package com.locator;

class Car extends Vehicle{
    private int numberDoors;

    public Car(String plate, String model, int year, int numberDoors){
        super(plate, model, year);
        this.numberDoors = numberDoors;
    }
 
    @Override
    public float calculateRental(int days){
        return (days * 100.0f) + (numberDoors * 20.0f);
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println(" - " + numberDoors);
    }
}