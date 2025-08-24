class Teacher {

    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void showDetails(Teacher t) {
        System.out.println("Teacher Name: " + t.name);
        System.out.println("Teacher Subject: " + t.subject);
    }

}

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Md. Nafijur Rahaman\n\n");

        Teacher t1 = new Teacher("Md. Nafijur Rahaman", "CSE");
        Teacher t2 = new Teacher("Tanjid", "English");

        t1.showDetails(t2);
        t2.showDetails(t1);

        System.out.println("\n\nId: 20234103116");
    }
}
