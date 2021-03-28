package fr.myt.watchlist.controllers;

import fr.myt.watchlist.repositories.WatchRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
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
        model.put("watches", watchRepository.getList());
        return new ModelAndView(viewName, model);
    }
}
