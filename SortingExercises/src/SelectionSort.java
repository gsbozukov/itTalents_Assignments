import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        //selection sort
        int[] arr = {20,8,9,15,21, 45, -4, 48, 98, 7,12 ,45 ,78, 8,9  ,3 ,4 ,8 ,150};
        //find max value of whole array

        int pass = 0;
        while (pass <= arr.length-2){
            int iMax = 0;
            int max = arr[0];
            for (int i = 0; i < arr.length-pass; i++) {
                if (max<arr[i]){
                    max = arr[i];
                    iMax = i;
                }
            }
            //swap it with its current position and the last one
            int lastPos = arr.length-1-pass;
            int temp = arr[lastPos];
            arr[lastPos] = arr[iMax];
            arr[iMax] = temp;

            pass++;
            //do the same, but this time from i = 0 to arr.lenght-1-i
        }
        System.out.println(Arrays.toString(arr));
    }
}