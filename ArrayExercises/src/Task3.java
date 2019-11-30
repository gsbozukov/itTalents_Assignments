import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] arr = {12, 45, 4, 5, 878, 45, 5,6,7,12,3};
        System.out.println("Please insert the number you would like to check:");
        int input = sc.nextInt();
        System.out.println(contains(arr, input)? "it does contain "+input : "it doesn't contain "+input);
    }
    public static boolean contains (int[]arr, int input){
        boolean contains = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input){
                contains = true;
                return contains;
            }
        }
        return contains;
    }
}
