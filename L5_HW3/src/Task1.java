import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize;
        // Accepts size of array
        do {
            System.out.println("Please enter the size of the array you want:");
            arrSize = sc.nextInt();
        }
        while (arrSize<1);
        //Entering the values for the array
        int []arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter the "+(i+1)+" number:");
            arr[i] = sc.nextInt();
        }
        //Checking for the smallest number divisible by 3
        int minDiv = 2147483647;    //maximum possible integer
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3 == 0){
                if (arr[i]<minDiv){
                    minDiv = arr[i];
                }
            }

        }
        //if nothing is divisible by 3:
        if (minDiv==2147483647){
            System.out.println("There is no number divisible by 3 in your series.");
        }
        //otherwise print minDiv
        else {
            System.out.println("The smallest number divisible by 3 in your series is: " +minDiv);
        }

    }
}
