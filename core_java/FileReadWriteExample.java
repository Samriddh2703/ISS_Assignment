package ISSTask1;

//Point 12: File read write
import java.io.*;

public class FileReadWriteExample {
 public static void main(String[] args) {
     // Writing to a file
     try (Writer writer = new FileWriter("example.txt")) {
         writer.write("Hello, World!");
     } catch (IOException e) {
         e.printStackTrace();
     }

     // Reading from a file
     try (Reader reader = new FileReader("example.txt")) {
         char[] buffer = new char[1024];
         int bytesRead = reader.read(buffer);
         System.out.println("File Content: " + new String(buffer, 0, bytesRead));
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
