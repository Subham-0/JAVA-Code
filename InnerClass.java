class A {

    int age;

    public void show() {
        System.out.println("in show");
    }

    class B {

        public void config() {
            System.out.println("in config");
        }

    }

    static class C {

        public void config() {
            System.out.println("in static config");
        }

    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj2 = obj.new B();
        obj2.config();

        A.C obj3 = new A.C();
        obj3.config();

    }
}
