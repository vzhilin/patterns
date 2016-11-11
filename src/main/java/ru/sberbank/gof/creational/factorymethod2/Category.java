package ru.sberbank.gof.creational.factorymethod2;

import ru.sberbank.gof.creational.builder.Car;
import ru.sberbank.gof.creational.builder.Van;
import ru.sberbank.gof.creational.builder.Vehicle;

public enum Category implements VehicleCreator {
    CAR {
        public Vehicle createVehicle() {
            return new Car();
        }
    },
    VAN {
        public Vehicle createVehicle() {
            return new Van();
        }
    };
}
