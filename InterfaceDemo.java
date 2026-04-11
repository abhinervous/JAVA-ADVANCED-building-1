// Interface example in Java
// This program demonstrates how interfaces work with multiple classes

// Step 1: Define an interface
interface Vehicle {
    
    // Abstract methods (no body)
    void start();     // method to start the vehicle
    void stop();      // method to stop the vehicle
    int getSpeed();   // method to get speed
    
    // Default method (Java 8 feature)
    default void fuelType() {
        System.out.println("Fuel type depends on vehicle");
    }
}

// Step 2: Implement the interface in a class
class Car implements Vehicle {
    
    int speed;
    
    // Constructor
    Car(int speed) {
        this.speed = speed;
    }
    
    // Implement start method
    public void start() {
        System.out.println("Car is starting...");
    }
    
    // Implement stop method
    public void stop() {
        System.out.println("Car is stopping...");
    }
    
    // Implement getSpeed method
    public int getSpeed() {
        return speed;
    }
    
    // Override default method
    public void fuelType() {
        System.out.println("Car uses Petrol or Diesel");
    }
}

// Step 3: Another class implementing same interface
class Bike implements Vehicle {
    
    int speed;
    
    // Constructor
    Bike(int speed) {
        this.speed = speed;
    }
    
    // Implement start method
    public void start() {
        System.out.println("Bike is starting...");
    }
    
    // Implement stop method
    public void stop() {
        System.out.println("Bike is stopping...");
    }
    
    // Implement getSpeed method
    public int getSpeed() {
        return speed;
    }
}

// Step 4: Main class to test the interface
public class InterfaceDemo {
    
    public static void main(String[] args) {
        
        // Create object of Car
        Vehicle car = new Car(80);
        
        // Call methods using interface reference
        car.start();
        System.out.println("Car speed: " + car.getSpeed());
        car.fuelType();
        car.stop();
        
        System.out.println("----------------------");
        
        // Create object of Bike
        Vehicle bike = new Bike(60);
        
        bike.start();
        System.out.println("Bike speed: " + bike.getSpeed());
        bike.fuelType(); // calls default method
        bike.stop();
    }
}
