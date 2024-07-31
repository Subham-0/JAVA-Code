class MyExpection extends Throwable { // or you can use Expection or RuntimeException (child of Throuwable)
    public MyExpection(String s) {
        super(s);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                throw new MyExpection("this is a costom message from my custom exception");

        } catch (MyExpection e) {
            j = 18 / 1;
            System.out.println("Can't divide by zero " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong " + e);
        }

        System.out.println(j);
        System.out.println("bye");
    }
}
