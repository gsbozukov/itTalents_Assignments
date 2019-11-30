import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize;
        // Accepts size of array
        do {
            System.out.println("Please enter a size of an array greater than 3:");
            arrSize = sc.nextInt();
        }
        while (arrSize < 3);

        //Entering the values for the array
        double[] arr = new double[arrSize];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter the " + (i + 1) + " number:");
            arr[i] = sc.nextDouble();
        }
        double firstMax = 0;
        int i1 = 0;
        double secondMax = 0;
        int i2 = 0;
        double thirdMax = 0;
        int i3 = 0;
        double difference;
        //finding the first max and its corresponding 'i'
        for (int i = 0; i < arr.length; i++) {
            //if negative number
            if (arr[i]<0){
                difference = -1*arr[i];
                if (firstMax<difference){
                    firstMax = difference;
                    i1 = i;
                }
            }
            else {
                difference = arr[i];
                if (firstMax<difference){
                    firstMax = difference;
                    i1 = i;
                }
            }
        }
        //finding the second max and its corresponding 'i'
        for (int i = 0; i < arr.length; i++) {
            //if negative number
            if (arr[i]<0){
                difference = -1*arr[i];
                if (secondMax<difference && i!=i1){
                    secondMax = difference;
                    i2 = i;
                }
            }
            else {
                difference = arr[i];
                if (secondMax<difference && i != i1){
                    secondMax = difference;
                    i2 = i;
                }
            }
        }
        //finding the third max and its corresponding 'i'
        for (int i = 0; i < arr.length; i++) {
            //if negative number
            if (arr[i]<0){
                difference = -1*arr[i];
                if (thirdMax<difference && i != i1 && i != i2){
                    thirdMax = difference;
                    i3 = i;
                }
            }
            else {
                difference = arr[i];
                if (thirdMax<difference && i != i1 && i != i2){
                    thirdMax = difference;
                    i3 = i;
                }
            }
        }

        //Printing new array
        System.out.print("[");
        System.out.print(arr[i1]+", "+arr[i2]+", "+arr[i3]);
        System.out.print("]");
    }
}
