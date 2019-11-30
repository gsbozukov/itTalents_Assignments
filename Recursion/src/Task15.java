public class Task15 {
    public static void main(String[] args) {
        //Write a program to find most duplicated value of an array of integer values using
        int [] arr = {1,2,3,4,5,5,5,4,7,8,9,10,7,7,7,7,7,7,10};
        int result = mostDuplicated(arr, 0, 0, arr[0]);
        System.out.println(result);
    }
    public static int mostDuplicated(int [] arr, int i, int max, int maxValue){
        //when to stop
        if (i == arr.length){
            return maxValue;
        }
        //find max duplicates
        if (max<duplicates(arr, i, 0, 0)){
            max = duplicates(arr, i, 0, 0);
            maxValue = arr[i];
        }
        return mostDuplicated(arr, i+1, max, maxValue);
    }
    public static int duplicates(int[]arr, int target, int reps, int j){
        //when to stop
        if (j == arr.length){
            return reps;
        }
        //how many duplicates
        if (arr[target] == arr[j]){
            reps++;
        }
        return duplicates(arr, target, reps, j+1);
    }
}
