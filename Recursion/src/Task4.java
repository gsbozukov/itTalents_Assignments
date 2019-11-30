import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        //Write a recursive function to find sum of all natural numbers between 1 to n
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println("Please insert a positive integer to find sum from 1 to N");
            input = sc.nextInt();
        }
        while (input<1);

        int result = sum1toN(input, 0, 1);
        System.out.println("Sum of natural numbers " +
                "between 1 and "+input+" is "+result);
    }

    public static int sum1toN (int input, int result, int i){
        // we need a result int to which we will add
        if (i == input){
            return (result+i);
        }
        result = result + i;
        return sum1toN(input, result, i+1);
    }
}
