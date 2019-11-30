import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input;
        double power;
        do {
            System.out.println("Please enter an integer: ");
            input = sc.nextDouble();
            System.out.println("Please enter its power: ");
            power = sc.nextDouble();
        }
        while (input<1 && power<1);

        double result = powerOf(input, power, 1);
        System.out.println(result);
    }

    public static double powerOf (double input, double power, double result){
        if (power == 0){
            return result;
        }
        //power is the number of times this fct will recurse
        result = result*input;
        power--;
        return powerOf (input, power, result);
    }

}
