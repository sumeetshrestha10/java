public class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;

    public Vehicle(String make, String model, int year, String fuelType){
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }
    public void start(){
        System.out.println("engine starts");
    }
    public void accelerate(){
        System.out.println("vehicle accelerate");
    }
    
}
