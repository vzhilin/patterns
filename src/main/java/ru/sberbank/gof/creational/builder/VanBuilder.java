package ru.sberbank.gof.creational.builder;

public class VanBuilder implements VehicleBuilder {
    private final Vehicle vehicle = new Van();

    @Override
    public void buildBody() {
        System.out.println("Building van body...");
    }

    @Override
    public void buildBoot() {
        System.out.println("Building van boot...");
    }

    @Override
    public void buildChassis() {
        System.out.println("Building van chassis...");
    }

    @Override
    public void buildPassengerArea() {
        System.out.println("Building van passenger area...");
    }

    @Override
    public void buildClimateControlSystem() {
        System.out.println("Building van climate control system...");
    }

    @Override
    public void buildSunroof() {
        System.out.println("Building van sunroof...");
    }

    @Override
    public void buildWindows() {
        System.out.println("Building van windows...");
    }

    @Override
    public Vehicle build() {
        return vehicle;
    }
}