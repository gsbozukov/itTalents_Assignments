import java.util.Arrays;
public class OptimizedSelectionSort {
    public static void main(String[] args) {
        //selection sort optimized
        int[] arr = {10,2,7,3,8,6};
        int pass = 0;
        while (pass <= arr.length/2){
            int max = arr[pass]; int iMax = pass;
            int min = arr[pass]; int iMin = pass;
            for (int i = pass; i < arr.length - pass; i++) {
                if (max<arr[i]){
                    max = arr[i];
                    iMax = i;
                }
                if (min>arr[i]){
                    min = arr[i];
                    iMin = i;
                }
            }
            if (iMax == 0 || iMin == arr.length-1){
                int temporary = arr[iMax];
                arr[iMax] = arr[iMin];
                arr[iMin] = temporary;
                continue;
            }
            int temp = arr[iMax];
            int lastPos = arr.length-1-pass;
            int firstPos = pass;
            arr[iMax] = arr[lastPos];
            arr[lastPos] = temp;
            temp = arr[iMin];
            arr[iMin] = arr[firstPos];
            arr[firstPos] = temp;
            //increment
            pass++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
