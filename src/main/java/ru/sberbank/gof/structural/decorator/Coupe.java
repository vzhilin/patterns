package ru.sberbank.gof.structural.decorator;

public class Coupe extends AbstractVehicle {
    public Coupe(Engine engine, Colour colour) {
        super(engine, colour);
    }

    public Coupe(Engine engine) {
        super(engine);
    }

    @Override
    public int getPrice() {
        return 7000;
    }
}
