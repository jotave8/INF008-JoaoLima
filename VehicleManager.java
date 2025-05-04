public class Vehicle(){
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

    public abstract void displayDetails(); 

    public static void  getTotalVehicles(){
        return totalVehicles;
    }
    public abstract double calculateDaily(int dias);
}