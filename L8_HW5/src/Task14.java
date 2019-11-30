import java.util.Scanner;
public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        while (input<2 || input>20){
            System.out.println("Please enter a positive integer, greater than 1 and lesser than 20:");
            input = sc.nextInt();
        }
        //function which finds the factorial
        factorial(input);
        //printing result
        System.out.println("The factorial of "+input+" is: "+factorial(input));
    }

    public static long factorial (int n){
        long result = 1;

        for (int i = n; i >= 1; i--) {
            result = result*i;
        }

        return result;
    }

}
