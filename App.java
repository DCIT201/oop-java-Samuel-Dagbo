package org.example;
    public class App {
        public static void main(String[] args) {
            // Create rental agency
                RentalAgency agency = new RentalAgency();

                // Adding of vehicles to the agency
                agency.addVehicle(new Car("A001", "Toyota Camry", 50, true));
                agency.addVehicle(new Motorcycle("A002", "Harley Davidson", 30, true));
                agency.addVehicle(new Truck("A003", "Ford F-150", 80, true,300.0));

                // Create customers
                Customer sam = new Customer("C001", "Sammy");
                Customer cassy = new Customer("C002", "Cassandra");

                // Rent vehicles
                sam.rentVehicle(new Car("A001", "Toyota Camry", 50, true));
                cassy.rentVehicle(new Truck("A003", "Ford F-150", 80, true, 300.0));

                // Return vehicles
                sam.returnVehicle(new Car("A001", "Toyota Camry", 50, true));
                cassy.returnVehicle(new Truck("A003", "Ford F-150",80,true,300.0));
        }
    }

