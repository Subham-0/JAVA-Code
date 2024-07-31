import CoreJava.Access.A;

public class Subclass extends A {
    public static void main(String[] args) {

        // System.out.println(A.value3);
        Subclass sub = new Subclass();
        System.out.println(sub.value3);
    }
}