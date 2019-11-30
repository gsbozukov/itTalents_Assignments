import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        //counting sort
        int [] arr = {20,8,9,15,21, 45, 48, 98, 7,12 ,45 ,78, 8,9, 3 , 4,8 ,150};
        //find max value of array
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        //create a matrix for the length of the array
        int [] helper = new int[max+1];
        //start looping our array to fill helper
        for (int i = 0; i < arr.length; i++) {
            helper [arr[i]]++;
        }
        //fill the main array again
        int cell = 0;
        for (int i = 0; i < helper.length; i++) {
            if (helper[i] < 1){
                continue;
            }
            arr[cell] = i;
            cell++;
            helper[i]--;
            i--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
