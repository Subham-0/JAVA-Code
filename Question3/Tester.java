import java.util.Scanner;

class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your type of food (V for veg and N for non-veg)");
        String type_of_food = sc.next();

        System.out.println("Quantity or no. of plates ordered");
        int quantity_ordered = sc.nextInt();

        System.out.println("Distance in kms  from restaurant");
        int distance = sc.nextInt();

        int dilivery_charge = 0;
        int veg_cost = 12;
        int non_veg_cost = 15;
        int bill_ammount = 0;

        if (!type_of_food.contains("V") && !type_of_food.contains("N")) {
            System.out.println("Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.");
            System.out.println(-1);
        } else if (distance <= 0) {
            System.out.println("Distance in kms must be greater than 0.");
            System.out.println(-1);
        } else if (quantity_ordered <= 0) {
            System.out.println("Quantity ordered should be minimum 1.");
            System.out.println(-1);
        } else {
            if (distance <= 3) {
                dilivery_charge += 0;
            }
            if (distance > 3) {
                dilivery_charge += 1;
            }
            if (distance > 6) {
                dilivery_charge += 2 * (distance - 6);
            }
            if (type_of_food.contains("V")) {
                bill_ammount = veg_cost * quantity_ordered + dilivery_charge;

            }
            if (type_of_food.contains("N")) {
                bill_ammount = non_veg_cost * quantity_ordered + dilivery_charge;

            }

        }
        System.out.println(bill_ammount);

    }

}