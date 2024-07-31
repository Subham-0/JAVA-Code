// A sealed class can specify which classes are allowed to extend it using the "permits" clause.
// In this case, class A permits B and C to inherit from it.

sealed abstract class A permits B, C { // permitting class must be sealed, non-sealed, or final
    // A simple method to be overridden by subclasses
    public abstract void display();
}

// Class B is a non-sealed class, meaning it allows further inheritance
non-sealed class B extends A {
    @Override
    public void display() {
        System.out.println("Inside class B");
    }
}

// Class C is a final class, meaning no further classes can inherit from it
final class C extends A {
    @Override
    public void display() {
        System.out.println("Inside class C");
    }
}

// Class D extends B, as B is non-sealed and allows further inheritance
class D extends B {
    @Override
    public void display() {
        System.out.println("Inside class D");
    }
}

public class SealedClass {
    public static void main(String[] args) {
        // Creating objects of each class
        // A a = new A(); // Not possible as A is abstract
        B b = new B();
        C c = new C();
        D d = new D();

        // Calling the display method for each object
        // a.display(); // Not possible as A is abstract
        b.display(); // Prints "Inside class B"
        c.display(); // Prints "Inside class C"
        d.display(); // Prints "Inside class D"
    }
}
