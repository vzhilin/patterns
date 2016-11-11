package ru.sberbank.gof.structural.facade;

public class VehicleFacade {
    public void prepareForSale(Vehicle vehicle) {
        Registration registration = new Registration(vehicle);
        registration.allocateVehicleNumber();
        registration.allocateLicensePlate();

        Documentation.printBrochure(vehicle);

        vehicle.cleanInterior();
        vehicle.cleanExteriorBody();
        vehicle.takeForTestDrive();
    }
}
