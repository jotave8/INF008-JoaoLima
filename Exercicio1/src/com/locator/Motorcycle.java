package com.locator;

class Motorcycle extends Vehicle{
    private int cylinder;

    public Motorcycle(String plate, String model, int year, int cylinder){
        super(plate, model, year);
        this.cylinder = cylinder;
    }

    @Override
    public float calculateRental(int days){
        return (days * 50.0f) + (cylinder * 0.1f);
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println(" - " + cylinder);
    }

}