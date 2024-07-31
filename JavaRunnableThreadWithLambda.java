public class JavaRunnableThreadWithLambda {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("hii");
                try {
                    Thread.sleep(40);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("subham");
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        };

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
