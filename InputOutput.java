import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number : ");
        // println method belongs to PrintStream class
        // that mean we should create a object of PrintStream class to use println
        // method
        // but the beauty is that the object is already created (i.e. = out)
        // but the out object is static variable created inside the System class
        // since it is static we can use out with the System.out and once we have
        // access of the object we can call the println method

        int result = System.in.read(); // it actually return the ascii value
        System.out.println(result - 48); // it work only on single character

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);

        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        System.out.println(num2);

        sc.close();
        bf.close();
    }
}
