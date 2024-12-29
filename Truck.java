package org.example;

public class Truck extends Vehicle {
    private double cargoCapacity;
    public Truck(String vehicleId, String model, double baseRentalRate, boolean isAvailable, double cargoCapacity) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public double calculateRentalRate(int daysRented) {
        return getBaseRentalRate() * daysRented + (cargoCapacity * 35);
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
