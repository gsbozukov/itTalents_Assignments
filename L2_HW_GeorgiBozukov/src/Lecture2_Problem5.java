import java.util.Scanner;
public class Lecture2_Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Please enter your second number: ");
        int b = sc.nextInt();
        System.out.println("Please enter your third number: ");
        int c = sc.nextInt();

        if (a==b || a==c || b==c){
            System.out.println("Please don't enter numbers that are equal!");
            return;
        }

        // if A is the biggest number
        if (a>b && a>c){
            if (b>c){
                System.out.println("The descending order is: "+a+", "+b+", "+c+".");
            }
            else {
                System.out.println("The descending order is: "+a+", "+c+", "+b+".");
            }
        }

        // if B is the biggest number
        if (b>a && b>c){
            if (a>c){
                System.out.println("The descending order is: "+b+", "+a+", "+c+".");
            }
            else {
                System.out.println("The descending order is: "+b+", "+c+", "+a+".");
            }
        }

        //if C is the biggest number
        if (c>b && c>a){
            if (a>b){
                System.out.println("The descending order is: "+c+", "+a+", "+b+".");
            }
            else {
                System.out.println("The descending order is: "+c+", "+b+", "+a+".");
            }
        }
    }
}
