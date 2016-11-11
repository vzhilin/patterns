package ru.sberbank.gof.creational.prototype;

public class Application {
    public static void main(String[] args) {
        VehicleManager manager = new VehicleManager();

        // Получится shallow copy
        Vehicle saloon1 = manager.createSaloon();
        System.out.println(saloon1);
        Vehicle saloon2 = manager.createSaloon();
        System.out.println(saloon2);
        Vehicle saloon3 = manager.createSaloon();
        System.out.println(saloon3);
        Vehicle saloon4 = manager.createSaloon();
        System.out.println(saloon4);
    }
}
