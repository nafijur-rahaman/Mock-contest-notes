class Rectangle {

    double length;
    double width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double rectangleArea(double l, double w) {
        double area = l * w;
        return area;
    }

    Boolean compareArea(Rectangle r) {

        if (rectangleArea(length, width) > rectangleArea(r.length, r.width)) {
            return true;
        } else {
            return false;
        }

    }

}

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Md. Nafijur Rahaman\n\n");

        Rectangle r1 = new Rectangle(5, 7);
        Rectangle r2 = new Rectangle(4, 8);

        boolean flag = r1.compareArea(r2);
        if (flag) {
            System.out.println("Object r1 has greater area than object r2.");
        } else {
            System.out.println("Object r2 has greater area than object r1.");
        }
        System.out.println("\n\nId: 20234103116");
    }
}
