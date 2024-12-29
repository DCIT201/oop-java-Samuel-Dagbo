package org.example;
import java.util.List;
import java.util.ArrayList;
public class Customer {
    private String customerName;
    private String customerId;
    private List<Vehicle> vehiclesRented;

    public Customer(String name, String customerId) {
        this.customerName = name;
        this.customerId = customerId;
        this.vehiclesRented = new ArrayList<>();
    }


    public void addRentalHistory(Vehicle vehicle) {
        vehiclesRented.add(vehicle);
    }

    public List<Vehicle> getVehiclesRented() {
        return vehiclesRented;
    }

    //Renting a vehicle
    public void rentVehicle(Vehicle vehicle) {
        if (vehicle.isAvailable()) {
            vehiclesRented.add(vehicle);
            vehicle.setAvailable(false);
            System.out.println(customerName + "rented a" + vehicle.getModel() + vehicle.getDaysRented() + "days");
        } else {
            System.out.println(vehicle.getModel() + "is not available for rental");
        }
    }

    //Returning a vehicle
    public void returnVehicle(Vehicle vehicle) {
        if (vehiclesRented.contains(vehicle)) {
            vehiclesRented.remove(vehicle);
            vehicle.setAvailable(true);
            System.out.println(customerName + "has returned" + vehicle.getModel());
        } else {
            System.out.println(customerName + "has not returned" + vehicle.getModel());
        }
    }


}
