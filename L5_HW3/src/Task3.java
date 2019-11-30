import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        //checking for number to differ 0, otherwise the app will seem useless
        do {
            System.out.println("Please enter a number other than 0: ");
            n = sc.nextInt();
        }
        while (n==0);


        int [] array = new int[10];
        //filling the array

        for (int i = 0; i < array.length; i++) {
            //for the first two cells
            if (i<=1){
                array[i] = n;
            }
            else {
                array [i] = array[i-2]+array[i-1];
            }
        }
        //Printing new array
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i==(array.length-1)){
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i]+ ", ");
        }
        System.out.print("]");
    }
}
