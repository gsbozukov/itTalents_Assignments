import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize1;
        int arrSize2;
        // Accepts size of array
        do {
            System.out.println("Please enter the size of the first array you want:");
            arrSize1 = sc.nextInt();
            System.out.println("Please enter the size of the second array you want:");
            arrSize2 = sc.nextInt();
        }
        while (arrSize1 < 1 || arrSize2 < 1);

        //Entering the values for the first array
        int[] arr1 = new int[arrSize1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Please enter the " + (i + 1) + " number of the first array:");
            arr1[i] = sc.nextInt();
        }
        //Entering the values for the second array
        int[] arr2 = new int[arrSize2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Please enter the " + (i + 1) + " number of the second array:");
            arr2[i] = sc.nextInt();
        }

        //End the program if arrays sizes are not equal
        if (arr1.length != arr2.length){
            System.out.println("The arrays have different sizes! They're not equal!");
            return;
        }
        // if lengths are equal, check if the values are the same
        for (int i = 0; i < arr1.length; i++) {
            //if one of the values is different, end the program
            if (arr1[i]!=arr2[i]){
                System.out.println("The arrays are different, but have the same size.");
                return;
            }
        }
        System.out.println("The arrays are exactly the same!");
        
    }
}
