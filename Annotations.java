/*Annotations simply means a supplements to the compiler or to the runtime or we also call it as a metadata
When youwrite code sometime you intract with the compiler by saying something
 */
class A {
    public void shows() {
        System.out.println("in Show A");
    }
}

class B extends A {

    // public void show() {
    // System.out.println("in show B");
    // }
    @Override
    public void shows() {
        System.out.println("in show B");
    }

}

public class Annotations {
    public static void main(String[] args) {
        B obj = new B();
        obj.shows();

    }

}
