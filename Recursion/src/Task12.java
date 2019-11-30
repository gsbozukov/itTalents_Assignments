public class Task12 {
    public static void main(String[] args) {
        //Write a program to find sum of array elements using recursion.
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int x = sumOfArray(arr, 0, 0);
        System.out.println(x);
    }
    public static int sumOfArray (int [] arr, int result, int i){
        if (i==arr.length-1){
            return result+arr[i];
        }
        result = result + arr[i];
        return sumOfArray(arr, result, i+1);
    }
}
