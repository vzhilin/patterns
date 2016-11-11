package ru.sberbank.gof.structural.decorator;

public class Sport extends AbstractVehicle {
    public Sport(Engine engine, Colour colour) {
        super(engine, colour);
    }

    public Sport(Engine engine) {
        super(engine);
    }

    @Override
    public int getPrice() {
        return 8000;
    }
}
