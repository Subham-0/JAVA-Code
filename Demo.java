import CoreJava.tools.*;

public class Demo {
    public static void main(String[] args) {
        // method overriding
        AdvCal obj = new AdvCal();

        int res = obj.add(3, 8);
        System.out.println(res);

        int sub = obj.sub(6, 3);
        System.out.println(sub);
    }
}
