import java.util.Scanner;

public class Task2 {
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

        //Creating the new array

        int[] arrNew = new int[arrSize];
        //if it is an even number array
        if (isEven){
            for (int i = 0; i < arr.length; i++) {
                //if it is the first half
                if ((i+1)<=(arr.length/2)){
                    arrNew[i] = arr[i];
                }
                //if it is the second half
                else {
                    arrNew[i] = arr[arr.length-(i+1)];
                }
            }
        }
        // if it is an odd number array
        else {
            for (int i = 0; i < arr.length; i++) {
                //if it is the first half
                if ((i+2)<=((arr.length/2)+1)){
                    arrNew[i] = arr[i];
                }
                //if it is the second half
                else {
                    arrNew[i] = arr[arr.length-(i+1)];
                }
            }
        }

        //Printing new array
        System.out.print("[");
        for (int i = 0; i < arrNew.length; i++) {
            if (i==(arrNew.length-1)){
                System.out.print(arrNew[i]);
                break;
            }
            System.out.print(arrNew[i]+ ", ");
        }
        System.out.print("]");
    }
}
