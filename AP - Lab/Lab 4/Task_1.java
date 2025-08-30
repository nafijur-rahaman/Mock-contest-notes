class Person {
    String name;
    protected int age;
    private int idNumber;

    Person(String name, int age, int idNumber) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
    }

    int getIdNumber() {
        return idNumber;
    }

}

class Librarian extends Person {

    Librarian(String name, int age, int idNumber) {
        super(name, age, idNumber);
    }

    int id = super.getIdNumber();

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }

}

public class Task_1 {

    public static void main(String[] args) {
        System.out.println("Md. Nafijur Rahaman\n");

        Librarian l1 = new Librarian("Md. Nafijur", 20, 3116);
        l1.display();

        System.out.println("\nId: 20234103116");
    }
}