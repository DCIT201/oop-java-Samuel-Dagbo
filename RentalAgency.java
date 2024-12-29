package org.example;
import java.util.ArrayList;
import java.util.List;

public class RentalAgency {

    private List <Vehicle> vehicleFleet;
    private List <RentalTransaction> rentalTransactions;

    public RentalAgency() {
        this.vehicleFleet = new ArrayList<>();
        this.rentalTransactions = new ArrayList<>();
    }

    //Adding vehicles
    public void addVehicle(Vehicle vehicle) {
        vehicleFleet.add(vehicle);
    }

    //Making new transactions
    public void addRentalTransaction(RentalTransaction rentalTransaction) {
        rentalTransactions.add(rentalTransaction);
    }
}
