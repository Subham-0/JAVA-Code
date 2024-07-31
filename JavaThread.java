class A extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(30);
                System.out.println("hii");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(30);
                System.out.println("hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class JavaThread {
    public static void main(String[] args) {
        Thread obj1 = new A();
        Thread obj2 = new B();

        // obj1.setPriority(Thread.MAX_PRIORITY);
        // obj2.setPriority(5);

        obj1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
    }
}
