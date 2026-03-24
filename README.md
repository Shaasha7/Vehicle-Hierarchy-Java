# Vehicle-Hierarchy-Java
To design and implement an Object-Oriented Vehicle Hierarchy using Java.  The system allows different types of vehicles such as Car and Bike to perform  operations based on their type.  This project demonstrates core Object-Oriented Programming concepts such as:  • Inheritance  • Polymorphism  • Class and Object  • Method Overriding
🚗 Vehicle Management System using Java (OOP)

A simple Java application that demonstrates core Object-Oriented Programming (OOP) concepts like Inheritance, Method Overriding, and Runtime Polymorphism using real-world vehicle examples.

🚀 Features
🚘 Base class: Vehicle
🚗 Car class with specific behavior
🏍️ Bike class with specific behavior
🔁 Method overriding for dynamic output
🔄 Runtime polymorphism using parent reference
📋 Clean and simple console output
🛠️ Technologies Used
Java
OOP Concepts:
Inheritance
Method Overriding
Polymorphism
📌 Concepts Demonstrated
🔹 Inheritance
Car and Bike inherit from Vehicle
🔹 Method Overriding
start() and fuelType() methods behave differently in each subclass
🔹 Polymorphism
Parent reference (Vehicle) is used to refer to child objects
Vehicle v1 = new Car("Hyundai");
Vehicle v2 = new Bike("Yamaha");
📂 Project Structure
Vehicle
 ┣ Car
 ┗ Bike
▶️ How to Run
javac Main.java
java Main
💻 Source Code
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
<img width="1918" height="741" alt="vehicle heirarchy 1" src="https://github.com/user-attachments/assets/f3c18761-e720-4710-891d-60003e267853" />
<img width="1918" height="738" alt="vehicle heirarchy 2" src="https://github.com/user-attachments/assets/1731c6d8-689d-413f-bd23-7c57d8d5e57b" />

📊 Sample Output
Hyundai Car starts with key ignition
Car uses Petrol / Diesel

Yamaha Bike starts with self-start
Bike uses Petrol
🎯 Learning Outcomes
Understanding Inheritance in Java
Implementing Method Overriding
Applying Runtime Polymorphism
Designing real-world examples using OOP
🙌 Conclusion

This project clearly shows how Java OOP concepts can be used to model real-world systems like vehicles, allowing different behaviors for different object types using the same reference.
