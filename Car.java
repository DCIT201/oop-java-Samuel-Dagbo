package org.example;

    public class Car extends Vehicle{
        private boolean hasAirConditioning;

        public Car(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
            super(vehicleId, model, baseRentalRate, isAvailable);
            this.hasAirConditioning = hasAirConditioning;
        }

        @Override
        public double calculateRentalRate(int daysRented) {
            double calculateRentalRate = getBaseRentalRate() * daysRented;

            if (hasAirConditioning) {
                calculateRentalRate += 20 * daysRented;
            }
            return calculateRentalRate;
        }

        @Override
        public boolean isAvailableForRental() {
            return isAvailable();
        }
    }
