package CollectionAPI;

// import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Arraylist {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(8);
        nums.add(3);
        nums.add(7);

        for (int num : nums) {
            System.out.println(num);
        }
        // can access by index value
        List<String> names = new ArrayList<String>();
        names.add("babulu");
        names.add("raja");
        names.add("thakuni");
        names.add("manga");

        System.out.println(names.get(2));
        System.out.println(names.indexOf("raja"));

        // no duplicate value and unsorted format
        Set<Float> marks = new HashSet<Float>();
        marks.add(48.23f);
        marks.add(56.76f);
        marks.add(56.77f);
        marks.add(56.77f);
        marks.add(67f);

        for (float mark : marks) {
            System.out.println(mark);
        }

        // in sorted format no duplicate value
        Set<Integer> grade = new TreeSet<Integer>();
        grade.add(48);
        grade.add(56);
        grade.add(34);
        grade.add(56);
        grade.add(6);

        // for (int mark : grade) {
        // System.out.println(mark);
        // }
        Iterator<Integer> values = grade.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }

    }
}
