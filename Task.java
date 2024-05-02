public class Task{
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "F-150® Raptor", 2024, 4);
        Car car2 = new Car("Mercedes-Benz", "GLB", 2019, 4);
        car1.displayDetails();
        car2.displayDetails();
    }
    
}
class Vehicle{
    
    String make;
    String model;
    int year;
    Vehicle(String make,String model,int year){
        this.make =make;
        this.model =model;
        this.year =year;
    }
}

class Car extends Vehicle{
    int numberOfDoors;
    Car(String make,String model,int year,int numberOfDoors){
        super(make,model,year);
        this.numberOfDoors = numberOfDoors;
    }
    void displayDetails(){
        System.out.println("Car Details:\nMake: "+this.make+
        "\nModel: "+this.model+
        "\nYear: "+this.year+
        "\nNumber of doors: "+this.numberOfDoors+"\n");
    }
}
