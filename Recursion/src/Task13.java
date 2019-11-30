public class Task13 {
    public static void main(String[] args) {
        //Write a program to find maximum and minimum elements in a given array
        int [] arr = {1,2,3,4,5,6,7,8,9,10,50,-7,4,5,6,8};
        printMaxAndMin (arr);
    }
    public static void printMaxAndMin(int [] arr){
        //find me my max
        int max = maxArray(arr, arr[0], 0);
        //find me my min
        int min = minArray(arr, arr[0], 0);

        System.out.println("Maximum element: "+max);
        System.out.println("Minimum element: "+ min);
    }
    public static int maxArray(int[]arr, int max, int i){
        if (i == arr.length-1){
            if (max<arr[i]){
                return arr[i];
            }
            else {
                return max;
            }
        }
        if (max<arr[i]){
            max = arr[i];
        }
        return maxArray(arr, max, i+1);
    }
    public static int minArray(int[]arr, int min, int i){
        if (i == arr.length-1){
            if (min>arr[i]){
                return arr[i];
            }
            else {
                return min;
            }
        }
        if (min>arr[i]){
            min = arr[i];
        }
        return minArray(arr, min, i+1);
    }
}
