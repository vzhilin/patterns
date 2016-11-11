package ru.sberbank.gof.creational.prototype;

public class BoxVan extends AbstractVehicle {
    public BoxVan(Engine engine) {
        super(engine);
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
