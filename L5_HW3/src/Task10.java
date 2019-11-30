import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = 7;
        System.out.println("Please enter 7 integers: ");

        //Entering the values for the array and keeping the sum that will become the average after
        int[] arr = new int[arrSize];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter the " + (i + 1) + " number:");
            arr[i] = sc.nextInt();
            sum = sum+arr[i];
        }
        int avg = sum/arr.length;
        int smallestDiff = 2147483647;
        int difference;
        int iMemory = 0;        //remembers the ith cell that contains the smallest difference
        //Looping the array and verifying the smallest difference between average and the given number
        for (int i = 0; i < arr.length; i++) {
            difference = avg - arr[i];
            //if -ve result, becomes positive
            if (difference<0){
                difference = difference*(-1);
            }
            if (difference<smallestDiff){
                smallestDiff = difference;
                iMemory = arr[i];
            }
        }
        System.out.println("The rounded average of the array is: "+avg+" and the number closest to the average is: "+iMemory);
    }
}
