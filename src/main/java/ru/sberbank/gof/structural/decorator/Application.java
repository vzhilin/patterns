package ru.sberbank.gof.structural.decorator;

import static ru.sberbank.gof.structural.decorator.Vehicle.Colour.BLUE;

public class Application {
    public static void main(String[] args) {
        Vehicle vehicle = new Saloon(new StandardEngine(1300));
        vehicle.paint(BLUE);

        System.out.println(vehicle);

        vehicle = new AirConditionedVehicle(vehicle);
        System.out.println(vehicle);

        vehicle = new LeatherSeatedVehicle(vehicle);
        System.out.println(vehicle);

        vehicle = new SatNavVehicle(vehicle);
        System.out.println(vehicle);
    }
}
