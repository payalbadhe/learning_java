
abstract class Vehicle {

    int noOfTires;

    void displaytyres() {
        System.out.println("No of tires: " + noOfTires);
    }

    abstract void start();
}

class Car extends Vehicle {

    void start() {
        noOfTires = 4;
        System.out.println("Car is start with keys");
    }
}

class Bike extends Vehicle {

    void start() {
        noOfTires = 2;
        System.out.println("Bike is start with kick");
    }
}

public class abstact_ex {

    public static void main(String[] args) {

        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.displaytyres();

        Vehicle vehicle2 = new Bike();
        vehicle2.start();
        vehicle2.displaytyres();
    }
}
