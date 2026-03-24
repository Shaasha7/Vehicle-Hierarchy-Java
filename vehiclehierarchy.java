class Vehicle { 
String brand; 
Vehicle(String brand) { 
this.brand = brand; 
} 
void start() { 
System.out.println("Vehicle is starting..."); 
} 
void fuelType() { 
System.out.println("Vehicle fuel type"); 
} 
} 
class Car extends Vehicle { 
    Car(String brand) { 
        super(brand); 
    } 
    @Override 
    void start() { 
        System.out.println(brand + " Car starts with key ignition"); 
    } 
    @Override 
    void fuelType() { 
        System.out.println("Car uses Petrol / Diesel"); 
    } 
} 
class Bike extends Vehicle { 
    Bike(String brand) { 
        super(brand); 
    } 
    @Override 
    void start() { 
        System.out.println(brand + " Bike starts with self-start"); 
    } 
    @Override 
    void fuelType() { 
        System.out.println("Bike uses Petrol"); 
    } 
} 
public class Main { 
    public static void main(String[] args) { 
        Vehicle v1 = new Car("Hyundai"); 
        Vehicle v2 = new Bike("Yamaha"); 
        v1.start(); 
        v1.fuelType(); 
        System.out.println(); 
        v2.start(); 
        v2.fuelType(); 
    } 
}