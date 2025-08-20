
class Ebook {
    String title;
    String author;
    boolean isAvailable;

    void setEbook(String t, String a, boolean avail) {
        title = t;
        author = a;
        isAvailable = avail;
    }

    void toggleAvailability() {

        isAvailable = !isAvailable;

    }

    void displayEBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Yes\n\n" : "No\n\n"));
        
    }

}

public class Task_1 {

    public static void main(String arg[]) {
        System.out.println("Md. Nafijur Rahaman\n\n");

        Ebook eb = new Ebook();

        eb.setEbook("Alchemist", "paulo", true);
        eb.displayEBook();

        Ebook eb1 = new Ebook();
        eb1.setEbook("the robot", "tranjidis", false);
        System.out.println("Before the Toggle method");
        eb1.displayEBook();
        eb1.toggleAvailability();
        System.out.println("After the Toggle method");
        eb1.displayEBook();




        System.out.println("\n\nId: 20234103116");

    }

}
