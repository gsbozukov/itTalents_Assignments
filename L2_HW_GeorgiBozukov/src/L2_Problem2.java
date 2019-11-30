import java.util.Scanner;
import java.util.Locale;
public class L2_Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //Използвах това намерено от интернет че скенера да ми прочете boolean and double type
        System.out.println("Please enter first number: ");
        int a = sc.nextInt();
        System.out.println("Please enter second number: ");
        int b = sc.nextInt();

        int sum = a+b;
        int sub = a-b;
        int mult = a*b;
        int div = a/b;
        int remainder = a % b;

        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + sub);
        System.out.println("The product is: " + mult);
        System.out.println("The division is: " + div);
        System.out.println("The remainder is: " + remainder);

        // NOW with double
        System.out.println("Please enter first number with a decimal: ");
        double a1 = sc.nextDouble();
        System.out.println("Please enter second number with a decimal: ");
        double b1 = sc.nextDouble();

        double sum1 = a1+b1;
        double sub1 = a1-b1;
        double mult1 = a1*b1;
        double div1 = a1/b1;
        double remainder1 = a1 % b1;

        System.out.println("The sum is: " + sum1);
        System.out.println("The difference is: " + sub1);
        System.out.println("The product is: " + mult1);
        System.out.println("The division is: " + div1);
        System.out.println("The remainder is: " + remainder1);

    }
}
