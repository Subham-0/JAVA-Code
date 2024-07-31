public class Wapper {
    public static void main(String[] args) {
        int a = 56;
        // Integer num2 = new Integer(a);// Boxing(taking a primitive value storing in a
        // object) this is deprecated since version 9
        Integer num2 = a;// Autoboxing(primitive value converting to object autometically)
        System.out.println(num2);

        // int num3 = num2.intValue(); // Unboxing(from object type to primitive type)
        int num3 = num2; // Auto-unboxing (we can directly assign there is no problem , it autometically
                         // converting object type to primitive type)
        System.out.println(num3);

        String str = "45";
        int num4 = Integer.parseInt(str);// converting string object to interger object and performing auto-unboxing;

        System.out.println(num4 * 2);
    }
}
