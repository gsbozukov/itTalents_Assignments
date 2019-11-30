import java.util.Scanner;
public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 10 real numbers:");
        //creating array
        double [] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("You are entering your "+(i+1)+" number");
            arr[i] = sc.nextDouble();
        }
        //creating new array
        double [] arr2 = new double[10];
        for (int i = 0; i < arr2.length; i++) {
            if (arr[i]<-0.231){
                arr2[i] = (int)arr[i]*(int)arr[i]+41.25;
            }
            else {
                arr2[i] = (int)arr[i]*arr[i];
            }
        }
        //printing first array
        System.out.println("Your original array was:");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==(arr.length-1)){
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i]+ ", ");
        }
        System.out.println("]");
        //printing new array
        System.out.println("Your new array is:");
        System.out.print("[");
        for (int i = 0; i < arr2.length; i++) {
            if (i==(arr2.length-1)){
                System.out.print(arr2[i]);
                break;
            }
            System.out.print(arr2[i]+ ", ");
        }
        System.out.print("]");

    }
}
