package ISSTask1;

//Point 5: Inheritance, Overriding, Polymorphism, Abstraction, Encapsulation, Interfaces, Packages
//This example may span multiple classes for brevity.

//Package declaration

//Abstraction
abstract class Shape {
 // Encapsulation
 private String color;

 // Constructor
 public Shape(String color) {
     this.color = color;
 }

 // Abstract method
 abstract void draw();

 // Getter method
 public String getColor() {
     return color;
 }
}

//Inheritance, Polymorphism
class Circle extends Shape {
 private double radius;

 // Constructor
 public Circle(String color, double radius) {
     super(color);
     this.radius = radius;
 }

 // Overriding
 @Override
 void draw() {
     System.out.println("Drawing a " + getColor() + " circle with radius " + radius);
 }
}

public class ShapeExample {
 public static void main(String[] args) {
// Polymorphism
     Shape shape = new Circle("Red", 5.0);
     shape.draw();
 }
}

