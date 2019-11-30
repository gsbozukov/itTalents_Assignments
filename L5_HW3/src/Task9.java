import java.util.Scanner;

public class Task9 {
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
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter the " + (i + 1) + " number:");
            arr[i] = sc.nextInt();
        }
        //Swapping first and last, second with the first to last, third w/ second to last and etc...
        int iMemory=0;      //initiating a temp. memory

        for (int i = 0; i < (arr.length / 2); i++) {
            iMemory = arr[i];
            arr[i] = arr[arr.length-(i+1)];
            arr[arr.length-(i+1)] = iMemory;
        }

        //Printing new array
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==(arr.length-1)){
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i]+ ", ");
        }
        System.out.print("]");
    }
}
