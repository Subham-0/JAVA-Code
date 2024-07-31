
public class TryCatchFinally {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        try {
            j = 18 / i; // for getting exception
            // j = 18 / 9; //for not getting exception
            System.out.println("in try"); // this line is not executed because in try block if exception arise then it
                                          // goes to the catch block
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("in catch");
        } finally {
            // irrespective if you got the exception or not finally block will execute
            System.out.println("in finally");
        }
    }
}
