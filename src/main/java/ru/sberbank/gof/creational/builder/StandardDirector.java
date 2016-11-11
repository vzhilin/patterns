package ru.sberbank.gof.creational.builder;

public class StandardDirector implements VehicleDirector {
    @Override
    public Vehicle build(VehicleBuilder builder) {
        builder.buildChassis();
        builder.buildBody();
        builder.buildPassengerArea();
        builder.buildBoot();
        builder.buildWindows();

        return builder.build();
    }
}