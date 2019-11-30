public class Task1 {
    public static void main(String[] args) {
        int [] arr = {1,2,5,8,10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        System.out.println("The total is: "+sum);
    }
}
