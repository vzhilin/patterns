package ru.sberbank.gof.creational.builder;

public class LuxeDirector implements VehicleDirector {
    @Override
    public Vehicle build(VehicleBuilder builder) {
        builder.buildChassis();
        builder.buildBody();
        builder.buildPassengerArea();
        builder.buildBoot();
        builder.buildWindows();
        builder.buildClimateControlSystem();
        builder.buildSunroof();

        return builder.build();
    }
}