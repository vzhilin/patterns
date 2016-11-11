package ru.sberbank.gof.structural.facade;

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
    public void cleanInterior() {
        System.out.println("Cleaning interior");
    }

    @Override
    public void cleanExteriorBody() {
        System.out.println("Cleaning exterior");
    }

    @Override
    public void polishWindows() {
        System.out.println("Polishing windows");
    }

    @Override
    public void takeForTestDrive() {
        System.out.println("Taking for test drive");
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
