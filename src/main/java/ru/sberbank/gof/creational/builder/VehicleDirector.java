package ru.sberbank.gof.creational.builder;

public interface VehicleDirector {
    Vehicle build(VehicleBuilder builder);
}