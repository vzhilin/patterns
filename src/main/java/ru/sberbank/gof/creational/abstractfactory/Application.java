package ru.sberbank.gof.creational.abstractfactory;

public class Application {
    private static void createVehicle(VehicleFactory factory) {
        Body body = factory.createBody();
        Chassis chassis = factory.createChassis();
        Windows windows = factory.createWindows();

        // ...
    }

    public static void main(String[] args) {
        VehicleFactory factory = new CarFactory();

        createVehicle(factory);
    }
}
