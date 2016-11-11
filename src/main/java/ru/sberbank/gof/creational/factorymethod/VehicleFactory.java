package ru.sberbank.gof.creational.factorymethod;

import ru.sberbank.gof.creational.builder.Car;
import ru.sberbank.gof.creational.builder.Van;
import ru.sberbank.gof.creational.builder.Vehicle;

public class VehicleFactory {

    // + static factory method
    public Vehicle createVehicle(Category category) {
        Vehicle vehicle;

        switch (category) {
            case CAR:
                vehicle = new Car();
                break;
            case VAN:
                vehicle = new Van();
                break;
            default:
                throw new IllegalArgumentException("Unknown category for this factory");
        }

        return vehicle;
    }
}
