package ru.sberbank.gof.creational.abstractfactory;

public class VanChassis implements Chassis {
    @Override
    public String getChassisParts() {
        return "Van chassis";
    }
}
