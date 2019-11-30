import java.util.Scanner;
public class Lecture2_Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter your first number A1: ");
        int a1 = sc.nextInt();
        System.out.println("Please enter your second number A2: ");
        int a2 = sc.nextInt();
        System.out.println("Please enter your third number A3: ");
        int a3 = sc.nextInt();
        int memory = a1;

        a1=a2;
        a2=a3;
        a3=memory;
        System.out.println("Your new A1 is A2: "+ a1 + ", your new A2 is A3: "+a2+ " and your new A3 is A1: "+a3);
    }
}
