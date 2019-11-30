import java.util.Scanner;
public class HeartPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do{
            System.out.println("Please input an integer 'n', greater than 6:");
            n = sc.nextInt();
        }
        while (n<6);
        //dealing with row 0:
        //always starts with 2 spaces:
        for (int stars = 1; stars <= (n*2 - 1); stars++) {
            if (stars<=2||stars> (n-3)&& stars<= (n+2)||stars >(2*n-3)){
                System.out.print(" ");
            }
            else {
                System.out.print("*");
            }
        }
        System.out.println();
        //dealing with row 1:
        for (int stars = 1; stars <= (n*2 - 1); stars++) {
            if (stars<=1||stars> (n-2)&& stars<= (n+1)|| stars> (2*n-2)){
                System.out.print(" ");
            }
            else {
                System.out.print("*");
            }
        }
        System.out.println();
        //dealing with row 2:
        for (int stars = 1; stars <= (2*n - 1); stars++) {
            if (stars == n){
                System.out.print(" ");
            }
            else {
                System.out.print("*");
            }
        }
        System.out.println();
        //dealing with row 3 and onwards:
        for (int rows = 0; rows < n; rows++) {
            for (int chars = 0; chars < ((2*n-1)-rows); chars++) {
                if (chars < rows && rows!=0){
                    //draw spaces
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
