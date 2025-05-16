import java.util.ArrayList;

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
