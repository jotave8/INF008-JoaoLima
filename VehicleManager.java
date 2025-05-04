public class Vehicle{
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

public class Car extends Vehicle{
    private int numberDoors;

    public Car(String plate, String model, int year, int numberDoors){
        super(plate, model, year);
        this.numberDoors = numberDoors;
    }

    @Override
    public calculateDaily(int dias){
        return (dias * 100.0) + (numberDoors * 20.0);
    }

    @Override
    public abstract void displayDetails(){
        System.out.println(
            "Carro - Placa: " + getPlate() +
            ", Modelo: " + getModel() +
            ", Ano: " + getYear() +
            ", Portas: " + numberDoors
       );
    }

    public int getNumberDoor(){
        return numberDoors;
    }
    public void setNumberDoor(int numberDoors){
        this.numberDoors = numberDoors;
    }
}