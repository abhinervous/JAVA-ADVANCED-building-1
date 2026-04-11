// Abstract class
abstract class Vehicle {
    
    // Abstract method (must be overridden in subclass)
    abstract void start();

    // Concrete method (already implemented)
    void fueltype() {
        System.out.println("Fuel type: Petrol/Diesel");
    }
}

// Subclass Car inheriting Vehicle
class Car extends Vehicle {
    
    // Overriding abstract method
    void start() {
        System.out.println("Car starts with a wheelspin");
    }
}

// Another subclass Bike inheriting Vehicle
class Bike extends Vehicle {
    
    // Overriding abstract method
    void start() {
        System.out.println("Bike starts with a kick or self-start");
    }
}

// Main class
public class AbstractDemo {
    
    public static void main(String[] args) {
        
        // Creating object of Car
        Vehicle car = new Car();  // Upcasting
        car.start();              // Calls Car's start()
        car.fueltype();           // Calls Vehicle's method
        
        System.out.println("----------------------");
        
        // Creating object of Bike
        Vehicle bike = new Bike(); // Upcasting
        bike.start();              // Calls Bike's start()
        bike.fueltype();           // Calls Vehicle's method
    }
}