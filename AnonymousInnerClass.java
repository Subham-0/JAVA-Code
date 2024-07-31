class A {
    public void show() {
        System.out.println("in A show");
    }
}
// how do we chage the behaviour of the class A
// by useing extend class(by method overriding)
// but it is good when we use the derived class in muliple places

// class B extends A {
// public void show() {
// System.out.println("in B show");
// }
// }

// if we have to use our class only once for a propose then we show go for
// anonymous inner class

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}
