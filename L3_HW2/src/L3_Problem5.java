import java.util.Scanner;

public class L3_Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //User enters 2 numbers
        System.out.println("Please enter first integer:");
        int a = sc.nextInt();
        System.out.println("Please enter second integer:");
        int b = sc.nextInt();
        //Validate entry, detect smaller number
        if (a==b){
            System.out.println("Please enter two numbers that are not equal to each other!");
            return;
        }
        if (a>b){
            int memory = b;
            b = a;
            a = memory;
        }
        //Print all numbers between them in ascending order
        while (a<=b){
            System.out.print(a++ +" ");
        }
    }
}
