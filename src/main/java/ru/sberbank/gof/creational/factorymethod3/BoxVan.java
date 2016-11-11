package ru.sberbank.gof.creational.factorymethod3;

import ru.sberbank.gof.structural.decorator.Engine;
import ru.sberbank.gof.structural.decorator.Vehicle;

public class BoxVan implements Vehicle {
    private final Engine engine;

    public BoxVan(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Engine getEngine() {
        return null;
    }

    @Override
    public void paint(Colour colour) {

    }

    @Override
    public Colour getColour() {
        return null;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
