package ru.sberbank.gof.structural.facade;

public class Application {
    public static void main(String[] args) {
        Vehicle vehicle = new Saloon(new StandardEngine(1300));

        VehicleFacade facade = new VehicleFacade();
        facade.prepareForSale(vehicle);
    }
}
