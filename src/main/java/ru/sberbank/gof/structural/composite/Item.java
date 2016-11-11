package ru.sberbank.gof.structural.composite;

import java.util.List;

public abstract class Item {
    private String description;
    private int cost;

    public Item(String description, int cost) {
        this.description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }

    public abstract void addItem(Item item);

    public abstract void removeItem(Item item);

    public abstract List<Item> getItems();

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", cost=" + getCost() +
                '}';
    }
}
