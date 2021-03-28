package fr.myt.watchlist.controllers;

import fr.myt.watchlist.models.WatchItem;
import fr.myt.watchlist.repositories.WatchRepository;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@Slf4j
public class WatchController {

    private final WatchRepository watchRepository;

    public WatchController(WatchRepository watchRepository) {
        this.watchRepository = watchRepository;
    }

    @GetMapping("/watchs")
    public ModelAndView getWatchList() {

        String viewName = "watchList";
        Map<String, Object> model = new HashMap<>();
        model.put("numberOfMovies", 222);
        model.put("watches", watchRepository.getWatchItems());

        return new ModelAndView(viewName, model);
    }

    @GetMapping("/watch_form")
    public ModelAndView getWatchForm() {
        log.info("{}", "Go");
        String viewName = "watchListItemForm";
        Map<String, Object> model = new HashMap<>();
        model.put("watchListItem", WatchItem.builder().build());

        return new ModelAndView(viewName, model);
    }

    @PostMapping("/watch_form")
    public ModelAndView submitWatchListItemForm(final WatchItem watchItem) {
        log.info("hey");
        watchItem.setId(UUID.randomUUID().toString());
        log.info("Lobjet" + watchItem);
        watchRepository.save(watchItem);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/watchs");

        return new ModelAndView(redirectView);
    }
}
