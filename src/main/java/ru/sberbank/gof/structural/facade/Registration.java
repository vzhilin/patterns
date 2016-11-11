package ru.sberbank.gof.structural.facade;

public class Registration {
    private final Vehicle vehicle;

    public Registration(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    // Номерной знак
    public void allocateLicensePlate() {
        System.out.println("Allocating license plate");
    }

    public void allocateVehicleNumber() {
        System.out.println("Allocating vehicle number");
    }
}
