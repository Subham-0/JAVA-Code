package CollectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else
            return -1;
    }

}

public class SortingValuesOfClass {

    public static void main(String[] args) {
        // using lambda exp
        Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;

        // Comparator<Student> com = new Comparator<Student>() {
        // public int compare(Student i, Student j) {
        // if (i.age > j.age) {
        // return 1;
        // } else
        // return -1;
        // }
        // };

        List<Student> stud = new ArrayList<>();
        stud.add(new Student(21, "subham"));
        stud.add(new Student(24, "chiku"));
        stud.add(new Student(22, "harish"));
        stud.add(new Student(23, "lukesh"));
        stud.add(new Student(21, "jatin"));

        // Collections.sort(stud);
        // here Integer class implements comparable thats why the sort by default work
        // with Integer class and Student class not working
        // if we implement comarable interface in Student class then it work

        Collections.sort(stud, com);

        for (Student s : stud) {
            System.out.println(s);
        }

    }
}
