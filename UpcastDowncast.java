class A {
    public void show1() {
        System.out.println("in A show ");
    }
}

class B extends A {
    public void show2() {
        System.out.println("in B show ");
    }
}

public class UpcastDowncast {
    public static void main(String[] args) {
        // Upcasting
        // it is implesitly happend behind the seen (ou don't have to mention it , it
        // normally works)
        A obj = (A) new B();
        obj.show1();

        // even the obj is of B and method show2 belongs to B ,but i can't call show2 --
        // because the referance is of A and A has no idea what is show2

        // downcasting
        B obj1 = (B) obj;
        obj1.show1();
        obj1.show2();

    }
}
