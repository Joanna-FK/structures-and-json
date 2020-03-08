package com.jgdy4.json.zad3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
public class MenuResponse {
    private String type;
    private List<MenuResult> menuItems;
    private int offset;
    private int number;
    private int totalMenuItems;
    private int processingTimeMs;
    private long expires;
}
