class A implements Runnable {
    public void run() {
    }
}

// class B implements Runnable {
// public void run() {

// }
// }

public class Test {
    public static void main(String[] args) throws InterruptedException {
        // AnonymousInner class
        Runnable r1 = new A() {
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("hiii");
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };
        // convert to lambda expression
        Runnable r2 = () -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        Thread.sleep(10);
        t2.start();
    }
}
