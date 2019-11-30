import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        //print all natural numbers from 1 to n
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println("Please insert a positive integer");
            input = sc.nextInt();
        }
        while (input<1);
        printNaturalToN(1,input);
    }

    public static void printNaturalToN (int i, int n){
        //check when to stop
        if (i == n){
            //print last number
            System.out.println(i);
            return;
        }
        //print i
        System.out.print(i + ", ");
        i++;
        printNaturalToN(i,n);
    }

}
