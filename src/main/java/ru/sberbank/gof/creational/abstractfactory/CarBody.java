package ru.sberbank.gof.creational.abstractfactory;

public class CarBody implements Body {
    @Override
    public String getBodyParts() {
        return "Car body";
    }
}
