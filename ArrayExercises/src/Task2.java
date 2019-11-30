public class Task2 {
    public static void main(String[] args) {
        //avg value of array elements
        double [] arr = {1,7,8,6,5,4,10};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double avg  = sum/arr.length;
        System.out.println("The average of the array is: " + Math.round(avg) + " and the sum is: "+sum);
    }
}
