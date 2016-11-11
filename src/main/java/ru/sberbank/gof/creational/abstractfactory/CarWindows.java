package ru.sberbank.gof.creational.abstractfactory;

public class CarWindows implements Windows {
    @Override
    public String getWindowsParts() {
        return "Car windows";
    }
}
