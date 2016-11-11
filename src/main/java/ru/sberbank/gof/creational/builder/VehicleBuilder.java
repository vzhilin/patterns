package ru.sberbank.gof.creational.builder;

public interface VehicleBuilder extends Builder<Vehicle> {
    void buildBody();

    void buildBoot();

    void buildChassis();

    void buildPassengerArea();

    void buildClimateControlSystem();

    void buildSunroof();

    void buildWindows();

    Vehicle build();
}