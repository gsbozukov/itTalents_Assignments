import java.util.Scanner;

public class L3_Problem9 {
    public static void main(String[] args) {
        //User inputs 2 numbers - validation of input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first positive integer:");
        int a = sc.nextInt();
        System.out.println("Please enter your second positive integer that is not equal to the previous:");
        int b = sc.nextInt();
        if (a == b || a<1 || b<1){
            System.out.println("Invalid entry! Restart me.");
            return;
        }
        //Placing them in ascending order
        if (a>b){
            int memory = a;
            a=b;
            b=memory;
        }
        // Main loop - power of 2
        int sum = 0;                    // sum that will check if we exceeded 200
        for (int i=a; i<=b; i++){
            //If it is divisible by 3 print SKIP 3
            if (i%3==0){
                System.out.print("Skip 3, ");
            }
            else {
                System.out.print(i*i);
                sum = sum + i*i;
                if (sum>200){
                    break;
                }
                System.out.print(", ");
            }
        }

    }
}
