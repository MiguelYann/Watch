package fr.myt.watchlist.repositories;

import fr.myt.watchlist.models.Watch;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class WatchRepository {

    private final List<Watch> watches = new ArrayList<>();

    public List<Watch> getList() {
        return watches;
    }

    public void save(List<Watch> theWatches) {
        watches.addAll(theWatches);
    }
}
