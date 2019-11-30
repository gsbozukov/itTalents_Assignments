import java.util.Locale;
import java.util.Scanner;
public class Lecture2_Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //Използвах това намерено от интернет че скенера да ми прочете boolean and double type
        System.out.println("Are you sick? Please answer with true or false.");
        boolean sick = sc.nextBoolean();
        System.out.println("How much money do you have?");
        double money = sc.nextDouble();

        if (sick){
            if (money>0){
                System.out.println("You are sick, you are not going out today! Don't forget to buy your meds!");
            }
            else {
                System.out.println("You are sick, but you have no money... drink some tea and stay home!");
            }
        }
        else {
            if (money<10) {
                System.out.println("You are not sick, but you have less than 10$ - go get a coffee.");
            }
            if (money>=10) {
                System.out.println("You are not sick! Go to the cinema!");
                }
            }
        }
    }

