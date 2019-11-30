import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Please enter a positive integer.");
            n = sc.nextInt();
        }
        while (n<1);
        //Checking size of array
        int arrSize = 0;
        int division = n;
        while (division>0){
            division = division/2;
            arrSize++;
        }
        division = n;       //resetting division
        //Creating the 'inverse' array for the binary
        int [] array = new int[arrSize];
        for (int i = 0; i < array.length; i++) {
            array[i] = division%2;
            division = division/2;
        }
        //Printing the array from the end to the beginning
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[array.length-(i+1)]);
        }

    }
}
