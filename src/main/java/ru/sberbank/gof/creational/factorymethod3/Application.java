package ru.sberbank.gof.creational.factorymethod3;

import ru.sberbank.gof.structural.decorator.Vehicle;

import static ru.sberbank.gof.creational.factorymethod3.VehicleFactory.DrivingStyle.ECONOMICAL;
import static ru.sberbank.gof.structural.decorator.Vehicle.Colour.UNPAINTED;

public class Application {
    public static void main(String[] args) {
        VehicleFactory factory = new CarFactory();

        Vehicle car = factory.build(ECONOMICAL, UNPAINTED);
    }
}
