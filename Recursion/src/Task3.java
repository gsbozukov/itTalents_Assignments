import java.util.Arrays;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        //print all natural numbers from 1 to n
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println("Please insert a positive integer");
            input = sc.nextInt();
        }
        while (input<1);
        int [] even = new int[input];
        int [] odd = new int[input];
        printEvenAndOdd(input, 1, even, odd, 0, 0);
    }

    public static void printEvenAndOdd (int input, int i, int[] even, int[] odd, int iEv, int iOd){
        if (i == input){
            //print the matrices
            System.out.println("Even numbers: "+ Arrays.toString(even));
            System.out.println("Odd numbers: "+ Arrays.toString(odd));
            return;
        }

        //if even
        if (i%2 == 0){
            even[iEv] = i;
            iEv++;
        }
        // if odd
        else {
            odd[iOd] = i;
            iOd++;
        }
        i++;
        printEvenAndOdd(input, i, even, odd, iEv, iOd);
    }

}
