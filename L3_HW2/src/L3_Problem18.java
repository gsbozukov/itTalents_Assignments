import java.util.Scanner;
public class L3_Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between [1-9]:");
        int a = sc.nextInt();
        System.out.println("Please enter another number between [1-9]:");
        int b = sc.nextInt();
        if (a<1||a>9||b<1||b>9){
            System.out.println("Invalid entry! Restart me.");
            return;
        }
        if (a>b){
            int memory = b;
            b = a;
            a = memory;
        }
        //Loop for first multiplier
        int firstMulti = 1;
        for (firstMulti = 1; firstMulti <= b; firstMulti++){
            //Loop for second multiplier
            for (int secondMulti = 1; secondMulti <= b; secondMulti++){
                System.out.println(firstMulti+"*"+secondMulti+"="+(firstMulti*secondMulti));
            }
        }
    }
}
