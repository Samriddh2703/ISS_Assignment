package ISSTask1;

//Point 9: JSON
import org.json.JSONObject;

public class JsonExample {
 public static void main(String[] args) {
     // Creating a JSON object
     JSONObject jsonObject = new JSONObject();
     jsonObject.put("name", "John");
     jsonObject.put("age", 25);
     jsonObject.put("city", "New York");

     // Converting JSON object to string
     String jsonString = jsonObject.toString();
     System.out.println("JSON String: " + jsonString);
 }
}
