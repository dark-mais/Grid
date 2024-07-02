package org.example.model;

import java.util.List;

public class Shelf extends Objects{
    private List<Item> items;

    public Shelf(int x, int y, List<Item> items) {
        super(x, y);
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public void update() {
        // Logic for shelf updates
    }
}
