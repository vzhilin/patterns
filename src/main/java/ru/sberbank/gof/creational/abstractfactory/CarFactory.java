package ru.sberbank.gof.creational.abstractfactory;

public class CarFactory implements VehicleFactory {
    @Override
    public Body createBody() {
        return new CarBody();
    }

    @Override
    public Chassis createChassis() {
        return new CarChassis();
    }

    @Override
    public Windows createWindows() {
        return new CarWindows();
    }
}
