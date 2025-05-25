package com.locator;

class Vehicle{
    private String plate;
    private String model;
    private int year;
    private static int totalVehicles;

    public Vehicle(String plate, String model, int year){
        this.plate = plate;
        this.model = model;
        this.year = year;
        totalVehicles++;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static int getTotalVehicles(){
        return totalVehicles;
    }

    public void displayDetails(){
        System.out.println(plate + " - " + model + " - " + year);
    } 

    public float calculateRental(int days){
        return 0.0f;
    }
}