class A implements Runnable {
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                System.out.println("hii");
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                System.out.println("hello");
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

public class JavaThreadRunnable {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
