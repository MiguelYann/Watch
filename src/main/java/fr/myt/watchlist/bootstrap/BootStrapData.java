package fr.myt.watchlist.bootstrap;

import fr.myt.watchlist.models.Watch;
import fr.myt.watchlist.repositories.WatchRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BootStrapData implements CommandLineRunner {

    private final WatchRepository watchRepository;

    public BootStrapData(WatchRepository watchRepository) {
        this.watchRepository = watchRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Watch> watches = List.of(
                Watch.builder()
                        .id(1)
                        .name("Apple Watch")
                        .date("20/10/2020")
                        .build(),

                Watch.builder()
                        .id(2)
                        .name("Samsung Watch")
                        .date("20/10/2021")
                        .build(),

                Watch.builder()
                        .id(3)
                        .name("Nokie Watch")
                        .date("20/10/2023")
                        .build()
        );

        watchRepository.save(watches);
    }
}
