package ru.sberbank.gof.creational.factorymethod3;


import ru.sberbank.gof.structural.decorator.StandardEngine;
import ru.sberbank.gof.structural.decorator.Vehicle;

public class VanFactory extends VehicleFactory {
    protected Vehicle selectVehicle(DrivingStyle style) {
        Vehicle vehicle = null;
        switch (style) {
            case ECONOMICAL:
            case MIDRANGE:
                vehicle = new Pickup(new StandardEngine(1600));
                break;
            case POWERFUL:
                vehicle = new BoxVan(new StandardEngine(2000));
                break;
            default:
                throw new IllegalArgumentException();
        }
        return vehicle;
    }
}
