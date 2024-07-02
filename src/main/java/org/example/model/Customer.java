package org.example.model;

public class Customer extends Objects {
    private boolean hasItem;

    public Customer(int x, int y) {
        super(x, y);
        this.hasItem = false;
    }

    public boolean hasItem() {
        return hasItem;
    }

    public void setHasItem(boolean hasItem) {
        this.hasItem = hasItem;
    }

    @Override
    public void update() {
        // Logic to move customer and interact with items and cashier
    }
}
