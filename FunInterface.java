@FunctionalInterface // must have only one method
interface A {
    void show(int a);
}

// class B implements A {
// public void show() {
// System.out.println("in Show");
// }
// }

public class FunInterface {
    public static void main(String[] args) {

        // A obj = new B();

        // A obj = new A() {
        // public void show() {
        // System.out.println("in Show");
        // }
        // };

        // The Lambda expression supported the Functional interface. These interfaces
        // also are known as the Single Abstract method(SAM)

        // A obj = () -> System.out.println("in Show");

        // A obj = (int a) -> System.out.println("in Show " + a );

        // A obj = (a) -> System.out.println("in Show " + a);

        A obj = a -> System.out.println("in Show " + a); // for only one parameter

        obj.show(5);
    }
}
