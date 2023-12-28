package ISSTask1;

//Point 6: Exception, Hierarchy of exception, Handling exceptions, Throw v/s throws
public class ExceptionExample {
 public static void main(String[] args) {
     try {
         // Handling exceptions
         int result = divide(10, 0);
         System.out.println("Result: " + result);
     } catch (ArithmeticException e) {
         // Hierarchy of exception
         System.out.println("Exception caught: " + e.getMessage());
     }
 }

 // Throw v/s throws
 private static int divide(int numerator, int denominator) throws ArithmeticException {
     if (denominator == 0) {
         // Throw exception
         throw new ArithmeticException("Cannot divide by zero");
     }
     return numerator / denominator;
 }
}

