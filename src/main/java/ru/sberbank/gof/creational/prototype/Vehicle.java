package ru.sberbank.gof.creational.prototype;

public interface Vehicle extends Cloneable {
    ru.sberbank.gof.creational.prototype.Engine getEngine();

    void paint(Colour colour);

    Colour getColour();

    int getPrice();

    Object clone();

    public enum Colour {
        UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW
    }
}
