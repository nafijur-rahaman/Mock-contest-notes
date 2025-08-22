import java.util.Scanner;

public class Task_3 {
    public static void main(String arg[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the String");

        String str = input.nextLine();

        int size = str.length();
        int vCount = 0;
        int cCount = 0;

        for (int i = 0; i < size; i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vCount++;
            } else if(Character.isLetter(str.charAt(i))) {
                cCount++;
            }

        }

        System.out.println("Vowels" + " " + vCount);
        System.out.println("Consonants" + " " + cCount);
    }

}
