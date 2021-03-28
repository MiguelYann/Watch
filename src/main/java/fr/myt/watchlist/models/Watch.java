package fr.myt.watchlist.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Watch {
    private final int id;
    private final String name;
    private final String date;
    private final String brand;
}
