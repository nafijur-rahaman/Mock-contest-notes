import java.util.Scanner;

public class Task_4 {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        int length;
        System.out.println("Enter the Size of Array");
        length = input.nextInt();

        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {

            arr[i] = input.nextInt();

        }
        int posCount = 0;
        int negCount = 0;
        int zerCount = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                zerCount++;
            }else if (arr[i] > 0) {
                posCount++;
            } else if(arr[i]<0) {
                negCount++;
            }
        }

        System.out.println("Positive Numbers" + " " + posCount);
        System.out.println("Negative Numbers" + " " + negCount);
        System.out.println("Zero Numbers" + " " + zerCount);
    }
}
