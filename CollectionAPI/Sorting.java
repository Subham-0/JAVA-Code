package CollectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {

            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10)
                    return 1;
                else
                    return -1;
            }

        };

        List<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(34);
        nums.add(99);
        nums.add(56);
        nums.add(44);
        // Collections.sort(nums);
        // here sorting logic is internally

        // what if we want our own logic for sorting
        // use Comparator interface
        Collections.sort(nums, com);

        System.out.println(nums);
    }
}
