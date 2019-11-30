import java.util.Scanner;
public class Task15 {
    //Write a program to find all pairs of elements in an array whose sum is equal to a specified number
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Scanner sc = new Scanner (System.in);
        int sum = sc.nextInt();
        int [][]result = new int[arr.length][2];
        //loop the array and check for summations. If possible enter in result matrix
        //if not pop a message
        boolean cantFind = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i]+arr[j]) == sum){
                    cantFind = false;
                    result[i][0] = arr[i];
                    result[i][1] = arr[j];
                }
            }
        }
        if (cantFind){
            System.out.println("Sorry, I couldn't find a pair that works.");
        }
        else {
            //print result matrix
            System.out.println("Here are all the pairs that add up to your sum "+ sum);
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < 2; j++) {
                    if (result[i][0]!=0 && result[i][1]!=0)
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
