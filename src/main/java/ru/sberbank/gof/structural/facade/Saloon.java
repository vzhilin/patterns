package ru.sberbank.gof.structural.facade;

public class Saloon extends AbstractVehicle {
    public Saloon(Engine engine, Colour colour) {
        super(engine, colour);
    }

    public Saloon(Engine engine) {
        super(engine);
    }

    @Override
    public int getPrice() {
        return 6000;
    }
}
