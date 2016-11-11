package ru.sberbank.gof.creational.factorymethod2;

import java.util.ArrayList;
import java.util.List;

import ru.sberbank.gof.creational.builder.Vehicle;

import static ru.sberbank.gof.creational.factorymethod2.Category.CAR;
import static ru.sberbank.gof.creational.factorymethod2.Category.VAN;

public class Application {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(CAR.createVehicle());
        vehicles.add(VAN.createVehicle());
    }
}
