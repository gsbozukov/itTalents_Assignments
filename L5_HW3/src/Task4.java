import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize;
        // Accepts size of array
        do {
            System.out.println("Please enter the size of the array you want:");
            arrSize = sc.nextInt();
        }
        while (arrSize < 1);

        //check if array size is even or odd
        boolean isEven = true;
        if (arrSize%2!=0){
            isEven = false;
        }

        //Entering the values for the array
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter the " + (i + 1) + " number:");
            arr[i] = sc.nextInt();
        }
        // if array size is even
        if (isEven){
            for (int i = arr.length/2; i < arr.length; i++) {
                //if it is not mirroring, break the operation
                if (arr[i]!=arr[arr.length-(i+1)]){
                    System.out.println("It is not a mirror array!");
                    return;
                }
            }
            System.out.println("It is a mirror array!");
        }
        // if it is an odd number array
        else {
            for (int i = ((arr.length/2)+1); i < arr.length; i++) {
                //if it is not mirroring, break the operation
                if (arr[i]!=arr[arr.length-(i+1)]){
                    System.out.println("It is not a mirror array!");
                    return;
                }
            }
            System.out.println("It is a mirror array!");
        }
    }
}
