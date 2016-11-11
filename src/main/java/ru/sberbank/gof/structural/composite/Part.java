package ru.sberbank.gof.structural.composite;

import java.util.Collections;
import java.util.List;

public class Part extends Item {
    public Part(String description, int cost) {
        super(description, cost);
    }

    @Override
    public void addItem(Item item) {
    }

    @Override
    public void removeItem(Item item) {
    }

    @Override
    public List<Item> getItems() {
        return Collections.emptyList();
    }
}
