class Car extends Vehicle{
    private int numberDoors;

    public Car(String plate, String model, int year, int numberDoors){
        super(plate, model, year);
        this.numberDoors = numberDoors;
    }
 
    public Car(String plate, String model){
        super(plate, model, 2025);
        this.numberDoors = 4;
    }

    @Override
    public float calculateRental(int days){
        return (days * 100.0) + (numberDoors * 20.0);
    }

    @Override
    public void displayDetails(){
        System.out.println(
            "Car - Plate: " + getPlate() +
            ", Model: " + getModel() +
            ", Year: " + getYear() +
            ", Doors: " + numberDoors
       );
    }

    public int getNumberDoor(){
        return numberDoors;
    }
    public void setNumberDoor(int numberDoors){
        this.numberDoors = numberDoors;
    }
}