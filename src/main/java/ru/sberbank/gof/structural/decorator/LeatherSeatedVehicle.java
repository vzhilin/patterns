package ru.sberbank.gof.structural.decorator;

public class LeatherSeatedVehicle extends AbstractVehicleOption {
    public LeatherSeatedVehicle(Vehicle decoratedVehicle) {
        super(decoratedVehicle);
    }

    @Override
    public int getPrice() {
        return decoratedVehicle.getPrice() + 1200;
    }
}
