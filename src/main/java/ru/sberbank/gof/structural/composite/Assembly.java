package ru.sberbank.gof.structural.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assembly extends Item {
    private final List<Item> items = new ArrayList<>();

    public Assembly(String description) {
        super(description, 0);
    }

    @Override
    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public void removeItem(Item item) {
        items.remove(item);
    }

    @Override
    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    @Override
    public int getCost() {
        return items.stream().mapToInt(Item::getCost).sum();
    }
}
