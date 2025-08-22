import java.util.Scanner;

public class Task_5 {

    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = input.nextLine();
        String revStr = "";
        int size = str.length();

        for (int i = size - 1; 0 <= i; i--) {
            revStr = revStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(revStr.toLowerCase())) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }

    }
}
