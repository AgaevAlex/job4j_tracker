package ru.job4j.tracker;

public class Item implements Comparable<Item> {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Item o) {
      return Integer.compare(this.id, o.getId());
    }
}