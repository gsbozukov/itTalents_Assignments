import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //bubble sort
        int [] arr = {1,5,4,79,3,2,48,6,87,42,35,78,96,32,5,46,8,7,13};
        //we need a temp variable for swapping
        int temp = 0;
        //for the whole array
        for (int i = 0; i < arr.length; i++) {
            //do one pass
            for (int j = 0; j < (arr.length-i-1); j++) {
                if (arr[j]>arr[(j+1)]){
                    //swap them
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
