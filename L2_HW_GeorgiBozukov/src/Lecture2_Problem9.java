import java.util.Scanner;
public class Lecture2_Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first 2-digit natural number:");
        int input1 = sc.nextInt();
        System.out.println("Please enter your second 2-digit natural number:");
        int input2 = sc.nextInt();

        int product = input1*input2;
        int remainder = product%10;

        if (input1>99 || input1<10 ||input2>99 || input2<10){
            System.out.println("Invalid entry! Restart me.");
            return;
        }

        System.out.println("The product of your numbers is: "+product+", the last digit is: "+remainder);
        if (remainder%2==0){
            System.out.println("It is an even number.");
        }
        else {
            System.out.println("It is an odd number.");
        }
    }
}
