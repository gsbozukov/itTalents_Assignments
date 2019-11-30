import java.util.Scanner;
public class Task5 {
    //remove a specific element from array
    public static void main(String[] args) {
        int [] arr = {1,2,45,5,458,98,6,4,87,5,7};
        Scanner sc = new Scanner(System.in);
        //read input and validate
        int input;
        do{
            System.out.println("Please enter an integer.");
            input = sc.nextInt();
        }
        while (!arrContains(arr, input));
        //print new array
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(remove(arr, input)[i]+ " ");
        }
        System.out.println("]");
    }

    public static int [] remove (int [] arr, int input){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input){
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static boolean arrContains (int [] arr, int input){
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
