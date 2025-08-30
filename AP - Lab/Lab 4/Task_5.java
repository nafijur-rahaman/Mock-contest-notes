abstract class Shape {
    abstract double area();

    void showShapeName() {
        System.out.println("this is a  shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}

public class Task_5 {
    public static void calculateArea(Shape s) {
        double area = s.area();
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        System.out.println("Md. Nafijur Rahaman\n");

        Shape s1;
        s1 = new Circle(10.5);
        calculateArea(s1);

        s1 = new Rectangle(10, 20);
        calculateArea(s1);

        System.out.println("\nId: 20234103116");
    }
}
