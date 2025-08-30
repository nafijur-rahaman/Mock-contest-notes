class Product {

    double getDiscount() {
        return 0;
    }

}

class Electronics extends Product {
    double getDiscount() {
        return 10;
    }
}

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Md. Nafijur Rahaman\n");

        Product p1;
        p1 = new Electronics();

        System.out.println("Discount: " + p1.getDiscount());

        System.out.println("\nId: 20234103116");
    }
}
