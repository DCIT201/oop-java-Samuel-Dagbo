package org.example;

public class RentalTransaction {
    private Vehicle vehicle;
    private int daysRented;
    private Customer customer;

    RentalTransaction(Vehicle vehicle, int daysRented, Customer customer) {
        this.vehicle = vehicle;
        this.daysRented = daysRented;
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public void setDaysRented(int daysRented) {
        this.daysRented = daysRented;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


}
