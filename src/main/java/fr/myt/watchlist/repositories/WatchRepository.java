package fr.myt.watchlist.repositories;

import fr.myt.watchlist.models.WatchItem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class WatchRepository {

    private final List<Watch> watches = new ArrayList<>();
    private final List<WatchItem> watchItems = new ArrayList<>();

    public List<Watch> getList() {
        return watches;
    }

    public void saveAll(List<Watch> theWatches) {
        watches.addAll(theWatches);
    }

    public void save(WatchItem watchItem) {
        watchItems.add(watchItem);
    }

    public List<WatchItem> getWatchItems() {
        return watchItems;
    }
}
