import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        while (input<2){
            System.out.println("Please enter a positive integer, greater than 1:");
            input = sc.nextInt();
        }

        //creating an array
        arrayToN(input);

        //printing array
        printArray(arrayToN(input));
    }
        //creating an array from 1 to N
    public static int [] arrayToN (int x){
        int [] array = new int[x];
        for (int i = 0; i < x; i++) {
            array [i] = i+1;
        }
        return array;

    }


    public static void printArray (int [] array){
        //printing
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1){
                System.out.print(array[i]);
            }
            else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("]");
        return;
    }
}
