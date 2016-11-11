package ru.sberbank.gof.structural.facade;

public interface Vehicle {
    Engine getEngine();

    void paint(Colour colour);

    Colour getColour();

    int getPrice();

    void cleanInterior();

    void cleanExteriorBody();

    void polishWindows();

    void takeForTestDrive();

    public enum Colour {
        UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW
    }
}
