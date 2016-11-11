package ru.sberbank.gof.creational.builder;

public class Application {
    public static void main(String[] args) {
        VehicleBuilder carBuilder = new CarBuilder();
        VehicleBuilder vanBuilder = new VanBuilder();

//        VehicleDirector standardDirector = new StandardDirector();
//        Vehicle standardCar = standardDirector.build(carBuilder);
//        Vehicle standardVan = standardDirector.build(vanBuilder);

        VehicleDirector luxeDirector = new LuxeDirector();
        Vehicle luxeCar = luxeDirector.build(carBuilder);
        Vehicle luxeVan = luxeDirector.build(vanBuilder);
    }
}
