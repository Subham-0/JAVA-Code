// class A {
//     void show() {
//         try {
//             Class.forName("Cal");
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }
//if we throws an exception by ourside we should catch the last throws mehod by ourside
class A {
    void show() throws ClassNotFoundException {
        Class.forName("Cal");
    }
}

public class ThrowsException {
    static {
        System.out.println("class Loaded");
    }

    public static void main(String[] args) {
        // don't use throws in main method because jvm not handelling that
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
