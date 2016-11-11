package ru.sberbank.gof.creational.prototype;

public final class VehicleManager {
    private final AbstractVehicle saloon, coupe, pickup, boxVan;

    {
        saloon = new Saloon(new StandardEngine(1500));
        coupe = new Coupe(new StandardEngine(1500));
        pickup = new Pickup(new StandardEngine(1500));
        boxVan = new BoxVan(new StandardEngine(1500));
    }

    public Vehicle createSaloon() {
        return saloon.clone();
    }

    public Vehicle createCoupe() {
        return coupe.clone();
    }

    public Vehicle createPickup() {
        return pickup.clone();
    }

    public Vehicle createBoxVan() {
        return boxVan.clone();
    }
}
