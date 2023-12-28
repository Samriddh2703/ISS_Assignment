package ISSTask1;

//Point 1: Concept of Class, Object, State (instance variable) and Methods (behavior).
public class Car {
 // State (instance variable)
 String brand;
 int year;

 // Constructor
 public Car(String brand, int year) {
     this.brand = brand;
     this.year = year;
 }

 // Method (behavior)
 public void displayInfo() {
     System.out.println("Brand: " + brand + ", Year: " + year);
 }

 public static void main(String[] args) {
     // Object creation
     Car myCar = new Car("Toyota", 2022);
     myCar.displayInfo();
 }
}
