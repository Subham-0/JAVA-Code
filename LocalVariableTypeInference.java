class Student {

}
// class var{

// } //can't use for class name

public class LocalVariableTypeInference {

    // var age = 34; //var is not allow for instance variable

    public static void main(String[] args) {
        int a = 34;
        var b = 23;

        int var = 45; // can use as a variable name

        int c;
        // var d; //must have to assign value

        int arr[] = new int[12];
        var fruit = new int[12]; // can use for array

        var obj = new Student(); // can use for obj creation

    }
}