package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tracker {

    private final List<Item> items = new ArrayList<>();
    private int ids = 1;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < items.size(); index++) {
            Item item = items.get(index);
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public List<Item> sortAscId() {
        Collections.sort(items);
        return items;
    }

    public List<Item> sortDescId() {
        Collections.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                if (o1.getId() > o2.getId()) {
                    return -1;
                } else if (o1.getId() < o2.getId()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        return items;
    }
}