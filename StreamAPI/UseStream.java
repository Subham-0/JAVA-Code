package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class UseStream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 7, 2, 9, 6, 1);

        Stream<Integer> s1 = nums.stream(); // s1 is a stream obj, but not affecting to nums

        Consumer<Integer> com = new Consumer<Integer>() {
            public void accept(Integer n) {
                System.out.println(n);
            }
        };
        // Consumer<Integer> com = (Integer n) -> {
        // System.out.println(n);
        // };
        // Consumer<Integer> com = n -> System.out.println(n);

        // nums.forEach(com); //forEach method need Consumer obj
        nums.forEach(n -> System.out.println(n)); // or we can direct put the assignment part due to functional
                                                  // Interface with lambda expression

        s1.forEach(n -> System.out.println(n));
        // s1.forEach(n -> System.out.println(n)); //use can't reuse the stream obj
    }
}
