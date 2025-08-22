
import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String ar[]) {

        Scanner input = new Scanner(System.in);
        int length;
        System.out.println("Enter the Size of Array");
        length = input.nextInt();

        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {

            arr[i] = input.nextInt();

        }

        int firstMax = 0;
        int secMax = 0;

        for (int i = 0; i < length; i++) {

            if(arr[i]> firstMax){
                firstMax = arr[i];
            }

        }

        for(int i = 0; i<length; i++){

            if(arr[i]>secMax && arr[i]!=firstMax){
                secMax = arr[i];
            }

        }


        if(secMax == 0){
            System.out.println(-1);
        }else{
            System.out.println(secMax);
        }
        

    }
}
