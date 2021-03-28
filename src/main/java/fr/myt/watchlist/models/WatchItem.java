package fr.myt.watchlist.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
public class WatchItem {

    private String id;
    private final String title;
    private final String rating;
    private final String priority;
    private final String comment;

    public WatchItem(String id, String title, String rating, String priority, String comment) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.rating = rating;
        this.priority = priority;
        this.comment = comment;
    }
}
