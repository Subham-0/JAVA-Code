package CollectionAPI.Map;

import java.util.HashMap;
import java.util.Map;

//Map is a collection of key and value pair
public class JavaMap {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<String, Integer>();
        // if you work with multiple thread and if you still want to use hashmap then
        // synchronized externally (use HashTable)

        students.put("babulu", 45);
        students.put("raja", 56);
        students.put("nikhil", 74);
        students.put("manga", 29);

        // keys can't be repeated but values can be
        students.put("raja", 59);

        System.out.println(students.get("raja"));

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}
