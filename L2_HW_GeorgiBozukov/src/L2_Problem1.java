import java.util.Scanner;

public class L2_Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number A: ");
        double a = sc.nextDouble();
        System.out.println("Please enter second number B: ");
        double b = sc.nextDouble();
        System.out.println("Please enter the last number C: ");
        double c = sc.nextDouble();
        if(a==b){
            System.out.println("Please provide an adequate spread between numbers!");
            return;
        }
        if(a==c || b==c){
            System.out.println("Your third number is equal to one of your first two! Try again!");
            return;
        }
        if (a>b && c<a && c>b){
            System.out.println(c + " is between " + a + " and "+ b);
            if (b>a && c<b && c>a){
                System.out.println(c + " is between " + a + " and "+ b);
            }
        }
        else{
            System.out.println(c + " is not between "+ a + " and " + b);}
    }
}
