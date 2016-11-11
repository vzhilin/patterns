package ru.sberbank.gof.creational.builder;

public class CarBuilder implements VehicleBuilder {
    private final Car vehicle = new Car();

    @Override
    public void buildBody() {
        System.out.println("Building car body...");
    }

    @Override
    public void buildBoot() {
        System.out.println("Building car boot...");
    }

    @Override
    public void buildChassis() {
        System.out.println("Building car chassis...");
    }

    @Override
    public void buildPassengerArea() {
        System.out.println("Building car passenger area...");
    }

    @Override
    public void buildClimateControlSystem() {
        System.out.println("Building car climate control system...");
    }

    @Override
    public void buildSunroof() {
        System.out.println("Building car sunroof...");
    }

    @Override
    public void buildWindows() {
        System.out.println("Building car windows...");
    }

    @Override
    public Car build() {
        return vehicle;
    }
}
