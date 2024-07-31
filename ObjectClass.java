class Laptop {

    String model;
    int price;

    // public String toString() {
    // return model + " : " + price;
    // }

    // public boolean equals(Laptop that) {
    // return this.model.equals(that.model) && this.price == that.price;

    // }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

}

public class ObjectClass {
    public static void main(String[] args) {

        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 100000;
        System.out.println(obj);

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 100000;
        System.out.println(obj2);

        System.out.println(obj.equals(obj2));

        // Laptop obj = new Laptop();
        // System.out.println(obj.getClass());
        // System.out.println(Integer.toHexString(obj.hashCode()));
        // System.out.println(obj);
        // System.out.println(obj.toString());
        // Laptop obj2 = new Laptop();
        // System.out.println(obj.equals(obj2));

    }
}
