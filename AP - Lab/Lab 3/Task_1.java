class Laptop {
    String name;
    double price;
    double ram;
    double storage;

    Laptop(String n, double p, double r, double s) {
        name = n;
        price = p;
        ram = r;
        storage = s;
    }

    void showLaptopDetails() {
        System.out.println("Laptop Name: " + name);
        System.out.println("Laptop Price: " + price);
        System.out.println("Laptop RAM: " + ram);
        System.out.println("Laptop Storage: " + storage);
        System.out.println();
    }

}

public class Task_1 {

    public static void main(String[] args) {
        System.out.println("Md. Nafijur Rahaman\n\n");

        Laptop l1 = new Laptop("Hp", 50000, 8, 512);
        Laptop l2 = new Laptop("Lenovo", 60000, 16, 512);

        l1.showLaptopDetails();
        l2.showLaptopDetails();

        System.out.println("\n\nId: 20234103116");
    }
}