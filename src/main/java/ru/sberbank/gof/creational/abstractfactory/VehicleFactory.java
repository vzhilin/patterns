package ru.sberbank.gof.creational.abstractfactory;

public interface VehicleFactory {
    Body createBody();

    Chassis createChassis();

    Windows createWindows();
}
