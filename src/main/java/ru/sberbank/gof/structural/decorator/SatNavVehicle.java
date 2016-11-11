package ru.sberbank.gof.structural.decorator;

public class SatNavVehicle extends AbstractVehicleOption {
    public SatNavVehicle(Vehicle decoratedVehicle) {
        super(decoratedVehicle);
    }

    @Override
    public int getPrice() {
        return decoratedVehicle.getPrice() + 1500;
    }

    public void setDestination(String target) {
        // ...
    }
}
