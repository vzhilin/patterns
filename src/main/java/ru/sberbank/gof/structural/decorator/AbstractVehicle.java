package ru.sberbank.gof.structural.decorator;

public abstract class AbstractVehicle implements Vehicle {
    private Engine engine;
    private Colour colour;

    public AbstractVehicle(Engine engine, Colour colour) {
        this.engine = engine;
        this.colour = colour;
    }

    public AbstractVehicle(Engine engine) {
        this(engine, Colour.UNPAINTED);
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public void paint(Colour colour) {
        this.colour = colour;
    }

    @Override
    public Colour getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "engine=" + engine +
                ", colour=" + colour +
                ", price=" + getPrice() +
                '}';
    }
}
