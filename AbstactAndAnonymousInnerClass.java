//we can use anonymous inner class for the abstract class as well
abstract class A {
    public abstract void show();

    public abstract void config();
}

// class B extends A {

// public void show() {
// System.out.println("in B show");
// }

// }
// the entire purpose of the class B is to implement the show method() that's it
// and if you are using this method only once then why to even create this
// class, can i use something else can i use anonymous inner class here

public class AbstactAndAnonymousInnerClass {
    public static void main(String[] args) {
        /*
         * can you create a object or can you instanstiate the abstract class ?
         * a- yes by extends keyword
         */

        /*
         * here we are not creating the object of class A ,we create the object of
         * anonymous
         * inner class (no name)
         */
        A obj = new A() {
            public void show() {
                System.out.println("in new show");
            }

            public void config() {
                System.out.println("in new config");
            }
            // we can implement multiple methods in anonymous inner class
        };
        obj.show();
        obj.config();

    }
}
