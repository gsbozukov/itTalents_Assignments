import java.util.Scanner;
public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize;
        // Accepts size of array
        do {
            System.out.println("Please enter a size of an array greater than 1:");
            arrSize = sc.nextInt();
        }
        while (arrSize < 2);

        //Entering the values for the array
        System.out.println("Please enter a zig-zag series using natural numbers:");
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter the " + (i + 1) + " number:");
            arr[i] = sc.nextInt();
            //ask again if negative
            if (arr[i]<0){
                i--;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            //if i is even, we expect it to be smaller than i-1
            if (i%2==0){
                if (arr[i]>=arr[i-1]){
                    System.out.println("It is not a Zig Zag series.");
                    return;
                }
            }
            //if i is odd, we expect it to be greater than i-1
            else {
                if (arr[i]<=arr[i-1]){
                    System.out.println("It is not a Zig Zag series.");
                    return;
                }
            }
        }
        System.out.println("Congratulations! It is a Zig Zag series!");

    }
}
