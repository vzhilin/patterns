package ru.sberbank.gof.creational.factorymethod3;


import ru.sberbank.gof.structural.decorator.Coupe;
import ru.sberbank.gof.structural.decorator.Saloon;
import ru.sberbank.gof.structural.decorator.Sport;
import ru.sberbank.gof.structural.decorator.StandardEngine;
import ru.sberbank.gof.structural.decorator.Vehicle;

public class CarFactory extends VehicleFactory {
    protected Vehicle selectVehicle(DrivingStyle style) {
        Vehicle vehicle = null;
        switch (style) {
            case ECONOMICAL:
                vehicle = new Saloon(new StandardEngine(1300));
                break;
            case MIDRANGE:
                vehicle = new Coupe(new StandardEngine(1600));
                break;
            case POWERFUL:
                vehicle = new Sport(new StandardEngine(2000));
                break;
            default:
                throw new IllegalArgumentException();
        }
        return vehicle;
    }
}
