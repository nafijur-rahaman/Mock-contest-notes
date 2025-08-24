class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Md. Nafijur Rahaman\n\n");

        Calculator c1 = new Calculator();
        int r1 = c1.add(10, 20, 30);
        int r2 = c1.add(10, 20);
        double r3 = c1.add(20.5, 30.5);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("\n\nId: 20234103116");
    }
}
