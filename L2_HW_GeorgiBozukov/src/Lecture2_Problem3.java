import java.util.Scanner;
public class Lecture2_Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter your first number A: ");
        int a = sc.nextInt();
        System.out.println("Please enter your second number B: ");
        int b = sc.nextInt();
        int memory = a;
        a=b;
        b=memory;
        System.out.println("Your new A is "+ a + " and your new B is "+b);
    }
}
