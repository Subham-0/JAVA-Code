/*
class Alian {
    private final int age;
    private final String name;

    @Override
    public String toString() {
        return "Alian [age=" + age + ", name=" + name + "]";
    }

    public Alian(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alian other = (Alian) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}
*/

// record Alian(int age, String name) {
//     // canonical constructor
//     // public Alian(int age, String name) {
//     // if (age == 0)
//     // throw new IllegalArgumentException("age can't be zero");
//     // this.age = age;
//     // this.name = name;
//     // }
//     }

record Alian(int age, String name) {

    // conpact canonical constructor
    public Alian {
        if (age == 0)
            throw new IllegalArgumentException("age can't be zero");
    }
}
// behind the seen toSting,equals,hasCode methods and parameterized constructure
// are implemented

public class JavaRecord {
    public static void main(String[] args) {
        Alian obj1 = new Alian(1, "ram");
        Alian obj2 = new Alian(1, "ram");

        // System.out.println(obj1.getAge());
        // System.out.println(obj2.getName());

        // if we have two different object have same data and if we compare that two
        // object(we can say that the values are same not the memory location)
        System.out.println(obj1.equals(obj2)); // returns false(two different object have two different memory location)

        // but we want to compare the values (override the hascode method and equal
        // method)
        // by that we are changing the behaviour of equals method

        System.out.println(obj1);
        System.out.println(obj2);

    }

}