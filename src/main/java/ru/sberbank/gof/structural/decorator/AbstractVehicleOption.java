package ru.sberbank.gof.structural.decorator;

public abstract class AbstractVehicleOption extends AbstractVehicle {
    protected final Vehicle decoratedVehicle;

    public AbstractVehicleOption(Vehicle decoratedVehicle) {
        super(decoratedVehicle.getEngine(), decoratedVehicle.getColour());
        this.decoratedVehicle = decoratedVehicle;
    }
}
