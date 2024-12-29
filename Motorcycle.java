package org.example;

public class Motorcycle extends Vehicle {
    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
    }

    @Override
    public double calculateRentalRate(int daysRented) {
        double calculateRentalRate = getBaseRentalRate() * daysRented;
        return calculateRentalRate;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
