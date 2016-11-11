package ru.sberbank.gof.creational.factorymethod3;


import ru.sberbank.gof.structural.decorator.Vehicle;

public abstract class VehicleFactory {
    public enum DrivingStyle {ECONOMICAL, MIDRANGE, POWERFUL};

    public Vehicle build(DrivingStyle style, Vehicle.Colour colour) {
        Vehicle vehicle = selectVehicle(style);
        vehicle.paint(colour);
        return vehicle;
    }

    protected abstract Vehicle selectVehicle(DrivingStyle style);
}
