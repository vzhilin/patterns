package ru.sberbank.gof.structural.decorator;

public interface Vehicle {
    Engine getEngine();

    void paint(Colour colour);

    Colour getColour();

    int getPrice();

    public enum Colour {
        UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW
    }
}
