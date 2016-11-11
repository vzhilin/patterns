package ru.sberbank.gof.structural.decorator;

public class AirConditionedVehicle extends AbstractVehicleOption {
    public AirConditionedVehicle(Vehicle decoratedVehicle) {
        super(decoratedVehicle);
    }

    @Override
    public int getPrice() {
        return decoratedVehicle.getPrice() + 600;
    }

    public void setTemperature(int temperature) {
        // ...
    }
}
