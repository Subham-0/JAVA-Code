import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryFinally {
    public static void main(String[] args) throws IOException {
        int num = 0;
        BufferedReader bf = null;
        try {
            // InputStreamReader in = new InputStreamReader(System.in);
            // bf = new BufferedReader(in);

            bf = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        } finally {
            // it's a good practice allways close the resouces in finally block
            bf.close();
        }

        // try with resources
        // try (BufferedReader bff = new BufferedReader(new
        // InputStreamReader(System.in))) {
        // num = Integer.parseInt(bff.readLine());
        // System.out.println(num);
        // }

    }
}
