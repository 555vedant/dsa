package hashmaps;
import java.util.Map;

public class iteration {
    public static void main(String[] args) {
        hashMap<String, Integer> map = new hashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        // Iterate through keys
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // Iterate through values
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        // Iterate through key-value pairs
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

