package com.locator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class RentalCompany{
    private String name;
    private HashMap<String, Vehicle> vehicles = new HashMap<String,Vehicle>();


    public RentalCompany(String name){
        this.name = name;
    }

    public void registerVehicle (Vehicle vehicle){
        vehicles.put(vehicle.getPlate(), vehicle);
    }

    public void listVehicle(){
        Iterator<Vehicle> i = vehicles.values().iterator();
        while (i.hasNext()){
            i.next().displayDetails();
            System.out.println("");
        }
    }

    public float calculateTotalRentalValue(String plate, int days){
        if (vehicles.containsKey(plate)){
            return vehicles.get(plate).calculateRental(days);
        }
        return 0.0f;
    }
}
