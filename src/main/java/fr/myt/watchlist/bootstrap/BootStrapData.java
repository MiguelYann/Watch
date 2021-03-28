package fr.myt.watchlist.bootstrap;

import fr.myt.watchlist.models.WatchItem;
import fr.myt.watchlist.repositories.WatchRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final WatchRepository watchRepository;

    public BootStrapData(WatchRepository watchRepository) {
        this.watchRepository = watchRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        WatchItem firstWatch = WatchItem.builder()
                .title("Apple Watch")
                .priority("1")
                .comment("Good")
                .rating("3")
                .build();
        WatchItem secondWatch = WatchItem.builder()
                .title("Samsung Watch")
                .priority("3")
                .comment("Not to bad")
                .rating("4")
                .build();

        WatchItem thirdWatch = WatchItem.builder()
                .title("Nokia Watch")
                .priority("5")
                .comment("Bad")
                .rating("1")
                .build();


        watchRepository.save(firstWatch);
        watchRepository.save(secondWatch);
        watchRepository.save(thirdWatch);

    }
}
