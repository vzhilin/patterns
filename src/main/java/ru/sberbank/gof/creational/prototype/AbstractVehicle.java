package ru.sberbank.gof.creational.prototype;

public abstract class AbstractVehicle implements Vehicle {
    private Engine engine;
    private Colour colour;

    public AbstractVehicle(Engine engine, Colour colour) {
        System.out.println(this.getClass().getName());

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
    public int getPrice() {
        return 0;
    }

    @Override
    public Vehicle clone() {
        Vehicle object = null;
        try {
            object = (Vehicle) super.clone();
        } catch (CloneNotSupportedException e) {
            // Should not happen!
        }
        return object;
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
