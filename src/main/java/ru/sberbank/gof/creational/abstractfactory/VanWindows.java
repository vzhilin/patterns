package ru.sberbank.gof.creational.abstractfactory;

public class VanWindows implements Windows {
    @Override
    public String getWindowsParts() {
        return "Van windows";
    }
}
