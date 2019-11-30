import java.util.Scanner;
public class Task7 {
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
        //Creating the new array
        int [] arrNew = new int[arrSize];
        for (int i = 0; i < arrNew.length; i++) {
            if (i==0||(i==arrNew.length-1)){
                arrNew[i] = arr[i];
            }
            else {
                arrNew[i] = arr[i-1]+arr[i+1];
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
