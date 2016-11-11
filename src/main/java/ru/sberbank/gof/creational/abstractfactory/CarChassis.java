package ru.sberbank.gof.creational.abstractfactory;

public class CarChassis implements Chassis {
    @Override
    public String getChassisParts() {
        return "Car chassis";
    }
}
