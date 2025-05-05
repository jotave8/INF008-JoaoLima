import java.util.ArrayList;

abstract class Vehicle{
    private String plate;
    private String model;
    private int year;
    private static int totalVehicles = 0;

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

    public abstract void displayDetails(); 
    public abstract double calculateDaily(int dias);
}

class Car extends Vehicle{
    private int numberDoors;

    public Car(String plate, String model, int year, int numberDoors){
        super(plate, model, year);
        this.numberDoors = numberDoors;
    }

    @Override
    public double calculateDaily(int days){
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

class Motorcycle extends Vehicle{
    private int cylinder;

    public Motorcycle(String plate, String model, int year, int cylinder){
        super(plate, model, year);
        this.cylinder = cylinder;
    }

    @Override
    public double calculateDaily(int days){
        return (days * 50.0) + (cylinder * 0.10);
    }

    @Override
    public void displayDetails(){
        System.out.println(
            "Motorcycle - Plate: " + getPlate() +
            ", Model: " + getModel() +
            ", Year: " + getYear() +
            ", Cylinder Capacity: " + cylinder
       );
    }

    public int getCylinder(){
        return cylinder;
    }
    public void setCylinder(int cylinder){
        this.cylinder = cylinder;
    }
}

class RentalCompany{
    private String name;
    private ArrayList<Vehicle> registeredVehicle;


    public RentalCompany(String name){
        this.name = name;
        this.registeredVehicle = new ArrayList<>();
    }

    public void registerVehicle (Vehicle v){
        registeredVehicle.add(v);
    }

    public void listVehicle(){
        for (Vehicle vehicle : registeredVehicle){
            vehicle.displayDetails();
        }
    }

    public double calculateTotalRentalValue(String plate, int days){
        for (Vehicle vehicle : registeredVehicle){
            if (vehicle.getPlate().equals(plate)){
                return vehicle.calculateDaily(days);
            }
        }
        System.out.println("Veículo com placa " + plate + " não encontrado!");
        return -1.0;
    }
}
