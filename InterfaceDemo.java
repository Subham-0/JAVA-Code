// abstract class A{
//     public abstract void show();
//     public abstract void config();
// }
//if we have a class which only have abstract method the other alternative for that is to create an interface

interface A {
    int age = 23;// every variable inside interface by default final and static
    String area = "Bhubaneswar";

    void show();

    void config();

}

interface X {
    void run();
}

interface Y extends X {

}

class B implements A, Y {
    public void config() {
        System.out.println("in config");
    }

    public void show() {
        System.out.println("in show");
    }

    public void run() {
        System.out.println("in run");
    }

}

public class InterfaceDemo {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.config();
        obj.show();

        X obj1 = new B();
        obj1.run();

        System.out.println(A.area);

    }
}

// interface is not a class
// by default every method in interface is public abstract(so even you don't
// mention they are by default public abstract)

// interface just show you the design , so you can make another class and
// implements it methods.
// if you fail to defind the method in that class by default the class also
// become abstract.
// you can't create object of interface but you can create the object of the
// class which is implements the interface

// one class implenting multiple interface (but in abstract class we can not
// extends multiple abstract class)

// A class can extends an other class similarly interface extends multiple
// interfaces