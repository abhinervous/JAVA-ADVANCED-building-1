// Abstract class example in Java

// Step 1: Define abstract class
abstract class Vehicle {

    // Constructor of abstract class
    Vehicle() {
        // This will be called when subclass object is created
        System.out.println("Vehicle constructor called");
    }

    // Abstract method (no body) - must be implemented by subclasses
    abstract void start();

    // Concrete method (has body)
    void fueltype() {
        System.out.println("Fuel type: Petrol/Diesel");
    }
}

// Step 2: Create subclass Car
class Car extends Vehicle {

    // Constructor of Car
    Car() {
        System.out.println("Car constructor called");
    }

    // Implement abstract method
    void start() {
        System.out.println("Car starts with key ignition");
    }
}

// Step 3: Create another subclass Bike
class Bike extends Vehicle {

    // Constructor of Bike
    Bike() {
        System.out.println("Bike constructor called");
    }

    // Implement abstract method
    void start() {
        System.out.println("Bike starts with kick/self-start");
    }
}

// Step 4: Main class
public class AbstractDemo {

    public static void main(String[] args) {

        // Create object of Car (upcasting)
        Vehicle v1 = new Car();

        // Call methods
        v1.start();       // Calls Car's start()
        v1.fueltype();    // Calls Vehicle's method

        System.out.println("----------------------");

        // Create object of Bike
        Vehicle v2 = new Bike();

        v2.start();       // Calls Bike's start()
        v2.fueltype();    // Calls Vehicle's method
    }
}