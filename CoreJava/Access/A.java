package CoreJava.Access;

class B {
    private static int value2 = 34;

    private static void fun() {
        System.out.println(value2);
    }

    public static void accessFun() {
        fun();
    }
}

public class A {
    private static int value = 43;

    protected int value3 = 234;

    public static void main(String[] args) {

        System.out.println(value);
        // System.out.println(value2);
        // B.fun();
        B.accessFun();

        // System.out.println(value3);
    }
}
