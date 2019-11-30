import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {10,5,8,7,6,2,11,1, -1,-15,5,7,6};
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (arr[j]<min){
                    int temp = arr[j];
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
