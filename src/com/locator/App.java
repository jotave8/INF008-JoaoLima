package com.locator;

public class App{
    public static void main (String [] args){
        RentalCompany rental = new RentalCompany ("Rental Company XPTO");
        Car car1 = new Car("ABC1234", "Civic", 2022, 4);
        Motorcycle motorcycle1 = new Motorcycle("XYZ9876", "XRE 300", 2021, 300);
        rental.registerVehicle(car1);
        rental.registerVehicle(motorcycle1);
        rental.listVehicle();
        double value = rental.calculateTotalRentalValue("ABC1234", 3);
        System.out.println("Contract value: R$ " + value);
    }
}