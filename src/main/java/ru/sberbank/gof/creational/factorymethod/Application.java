package ru.sberbank.gof.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

import ru.sberbank.gof.creational.builder.Vehicle;

import static ru.sberbank.gof.creational.factorymethod.Category.CAR;
import static ru.sberbank.gof.creational.factorymethod.Category.VAN;

public class Application {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        VehicleFactory factory = new VehicleFactory();
        vehicles.add(factory.createVehicle(CAR));
        vehicles.add(factory.createVehicle(VAN));
    }
}
