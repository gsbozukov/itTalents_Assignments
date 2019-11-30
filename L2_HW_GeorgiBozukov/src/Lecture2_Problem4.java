import java.util.Scanner;
public class Lecture2_Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Please enter your second number: ");
        int b = sc.nextInt();
        if (a==b){
            System.out.println("Your numbers are equal... what am I supposed to do?");
            return;
        }
        if (a>b){
            System.out.println("The ascending order of these numbers is: "+b+ ", "+a);
        }
        else {
            System.out.println("The ascending order of these numbers is: "+a+ ", "+b);
        }
    }
}
