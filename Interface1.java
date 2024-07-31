interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code,compile,run..");
    }
}

class Dektop implements Computer {
    public void code() {
        System.out.println("code,compile,run,Faster..");
    }
}

class Developer {
    public void devApp(Computer com) {
        com.code();
    }
    // here the problem arise the developer can only work with laptop
    // this is called tight coupling (dev depend on lap)
    // so how to code it so that it should have more flexible.

    // A devloper depends on computer not lap or desk

}

public class Interface1 {
    public static void main(String[] args) {
        // Laptop lap = new Laptop();
        // Dektop desk = new Dektop();

        Computer lap = new Laptop();
        Computer desk = new Dektop();
        // now it losly coupled

        Developer subham = new Developer();
        subham.devApp(lap);
        subham.devApp(desk);
    }
}
