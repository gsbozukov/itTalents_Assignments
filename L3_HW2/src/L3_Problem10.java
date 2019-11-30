import java.util.Scanner;
public class L3_Problem10 {
    // Is it a prime number?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to see if it's a prime number:");
        int x = sc.nextInt();
        boolean isPrime = true;
        // Assuring basic conditions are met by user
        if (x<0){
            System.out.println("Please enter a positive integer! Restart me.");
            return;
        }
        // Loop that keeps dividing n by numbers from 2 to n-1
        for (int i = 2; i < x; i++) {
            if (x%i==0){
                isPrime = false;            //if it can be divided by anything, it is not a prime
            }
        }
        // Print results
        if (isPrime){
            System.out.println("It is a prime number!");
        }
        else {
            System.out.println("It is not a prime number!");
        }
    }
}
