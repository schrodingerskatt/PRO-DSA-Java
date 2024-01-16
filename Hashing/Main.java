import java.util.AbstractMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Creating a TreeMap with a custom comparator
        TreeMap<AbstractMap.SimpleEntry<Long, Long>, Long> k = new TreeMap<>((a, b) -> {
            if (!a.getKey().equals(b.getKey())) {
                return a.getKey().compareTo(b.getKey());
            }
            return a.getValue().compareTo(b.getValue());
        });

        // Adding elements to the TreeMap
        k.put(new AbstractMap.SimpleEntry<>(1L, 3L), 2000L);
        k.put(new AbstractMap.SimpleEntry<>(1L, 2L), 100L);
        k.put(new AbstractMap.SimpleEntry<>(3L, 4L), 200L);
        k.put(new AbstractMap.SimpleEntry<>(1L, 5L), 300L);
        k.put(new AbstractMap.SimpleEntry<>(2L, 2L), 400L);

        // Printing the TreeMap
        for (var entry : k.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
