import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = 7;
        int count = 0;  //will count the entries that are divisible by 5 and are greater than 5
        System.out.println("Please enter 7 integers: ");
        //Entering the values for the array
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter the " + (i + 1) + " number:");
            arr[i] = sc.nextInt();
            if (arr[i]%5==0 && arr[i]>5){
                count++;
            }
        }
        //Ends the program if there are no numbers divisible by 5
        if (count == 0){
            System.out.println("There are no numbers greater than 5 and divisible by 5.");
            return;
        }

        //Prints all the numbers which are divisible and greater than 5
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%5==0 && arr[i]>5){
                System.out.print(arr[i]+ " ");
            }
        }
        System.out.print(" - "+count+" number(s).");
    }
}
