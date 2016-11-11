package ru.sberbank.gof.creational.abstractfactory;

public class VanFactory implements VehicleFactory {
    @Override
    public Body createBody() {
        return new VanBody();
    }

    @Override
    public Chassis createChassis() {
        return new VanChassis();
    }

    @Override
    public Windows createWindows() {
        return new VanWindows();
    }
}
