package fr.myt.watchlist.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WatchItem {

    private final int id;
    private final String title;
    private final String rating;
    private final String priority;
    private final String comment;

}
