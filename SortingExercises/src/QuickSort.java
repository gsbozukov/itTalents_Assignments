import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {20,8,9,15,21, 45, 48, 98, 7,12 ,45 ,78, 8,9, 3 , 4,8 ,150};
        //call quicksort
        quickSort (arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    //quickSort only takes pivot and quick sorts left and right
    public static void quickSort (int [] arr, int left, int right){
        //add a bottom
        if (left >= right){
            return;
        }
        //take pivot
        int pivot = partition(arr, left, right);
        //use pivot for left
        quickSort(arr, left, pivot-1);
        // and right side
        quickSort(arr, pivot+1, right);
    }
    //partitioning, where the magic happens
    public static int partition (int[]arr, int left, int right){
        //assign k to left
        int kIdx = left;
        int pivIdx = right;
        //if the given value is smaller than pivot, swap and increment k
        for (int i = left; i < right; i++) {
            if (arr[i]<=arr[pivIdx]){
                swap(arr, i, kIdx);
                kIdx++;
            }
        }
        //final step is to swap pivot to right place and return its index
        swap(arr, kIdx, pivIdx);
        return kIdx;
    }
    //swap function
    public static void swap (int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
