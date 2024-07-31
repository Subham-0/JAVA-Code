//enums are named constants which we create
/*when you know that you have a specific error codes or when you have a specific constants which you want to use instead of creating a different object by yourself , you can create a enum */
enum Status { // enum is a class
    Running, Faild, Pending, Success; // these are objects(named constant)
}
// if you want to use an application where you want to return a status to the
// client (the status can be running,can be failed).Instead of returning a
// string format or a specific object you can simply return this status

public class Enum {
    public static void main(String[] args) {
        // Status s = Status.Pending;
        // System.out.println(s.ordinal());//print the order of your constant

        // Status[] ss = Status.values();
        // for (Status s : ss) {
        // System.out.println(s + " : " + s.ordinal());
        // }

        Status s = Status.Success;

        System.out.println(s.getClass().getSuperclass());

        switch (s) {
            case Running:
                System.out.println("all good");
                break;
            case Faild:
                System.out.println("try again");
                break;
            case Pending:
                System.out.println("please wait");
                break;
            default:
                System.out.println("done");
                break;
        }

        if (s == Status.Running) {
            System.out.println("All good");
        } else if (s == Status.Pending) {
            System.out.println("try again");
        } else if (s == Status.Faild) {
            System.out.println("Please wait");
        } else {
            System.out.println("Done");
        }

    }
}
