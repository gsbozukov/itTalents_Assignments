import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        //Write a program to reverse an array of integer values using recusrion
        int [] arr = {1,2,3,4,5,6,7,8,9,10,50,-7,4,5,6,8};
        int [] result = new int[arr.length];
        reverseArray(arr, 0, result);
        System.out.println(Arrays.toString(result));
    }
    public static int [] reverseArray (int[]arr, int i, int[]result){
        //when to stop
        if (i == arr.length-1){
            result[i] = arr[(arr.length-1)-i];
            return result;
        }
        //take first i and put it @ last index
        result[i] = arr[(arr.length-1)-i];
        return reverseArray(arr, i+1, result);
    }
}
