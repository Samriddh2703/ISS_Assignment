package ISSTask1;

//Point 2: Basic Datatypes, variable types, Modifier types, Final keyword, Constructors
public class Student {
 // Variable types and modifier types
 private final String name;
 private int age;

 // Constructor
 public Student(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public void displayInfo() {
     System.out.println("Name: " + name + ", Age: " + age);
 }

 public static void main(String[] args) {
     // Object creation
     Student student = new Student("John", 20);
     student.displayInfo();
 }
}

