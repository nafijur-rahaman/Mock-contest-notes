class Vehicle {
    String band;

    Vehicle(String band) {
        this.band = band;
    }

    void showDetails() {
        System.out.println("Band: " + band);
    }
}

class Car extends Vehicle {
    String model;

    Car(String band, String model) {
        super(band);
        this.model = model;
    }

    void viewDetails() {
        super.showDetails();
        System.out.println("Model: " + model);
    }

}

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Md. Nafijur Rahaman\n");

        Car c1 = new Car("Toyota", "Camry");
        c1.viewDetails();

        System.out.println("\nId: 20234103116");

    }
}
