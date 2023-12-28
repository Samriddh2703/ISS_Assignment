package ISSTask1;

// Point 7: Collection: List, Set, and Map. Collection operations on primitives and custom object
import java.util.*;

class Studentt {
    private int id;
    private String name;

    public Studentt(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Studentt{id=" + id + ", name='" + name + "'}";
    }
}

public class CollectionExample {
    public static void main(String[] args) {
        // List
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 3, 2, 4, 5));
        Collections.sort(numbersList);
        System.out.println("Sorted List: " + numbersList);

        // Set
        Set<Studentt> studentSet = new HashSet<>(Arrays.asList(
                new Studentt(1, "John"),
                new Studentt(2, "Alice"),
                new Studentt(3, "Bob")
        ));
        System.out.println("Student Set: " + studentSet);

        // Map
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "John");
        studentMap.put(2, "Alice");
        studentMap.put(3, "Bob");
        System.out.println("Student Map: " + studentMap);
    }
}
