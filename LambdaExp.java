@FunctionalInterface
interface A {
    int add(int a, int b);

}

public class LambdaExp {
    public static void main(String[] args) {
        A obj = (a, b) -> a + b;
        int result = obj.add(3, 4);
        System.out.println(result);
    }
}