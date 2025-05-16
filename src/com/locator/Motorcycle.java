class Motorcycle extends Vehicle{
    private int cylinder;

    public Motorcycle(String plate, String model, int year, int cylinder){
        super(plate, model, year);
        this.cylinder = cylinder;
    }

    public Motorcycle(String plate, String model){
        super(plate, model, 2025);
        this.cylinder = 160;
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