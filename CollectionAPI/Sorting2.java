package CollectionAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public class Sorting2 {

    public static void main(String[] args) {

        Comparator<String> com = new Comparator<String>() {
            public int compare(String i, String j) {
                if (i.length() > j.length()) {
                    return 1;
                } else if (i.length() < j.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        List<String> name = new ArrayList<>();
        name.add("subham");
        name.add("nikhil");
        name.add("ajit");
        name.add("chiku");
        name.add("sonu");
        Collections.sort(name, com);
        for (String s : name) {
            System.out.println(s);
        }

    }
}
