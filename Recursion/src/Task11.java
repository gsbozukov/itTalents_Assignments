public class Task11 {
    public static void main(String[] args) {
        //Write a program to print all elements of any array using recursion.
        double [] arr = {12, 45.5, 454, 78.4, 4896, 45, 48, 35.5};
        printArray (arr, 0);
    }
    public static void printArray (double[]arr, int i){
        //print last element and stop
        if (i == arr.length-1){
            System.out.println(arr[i]+"]");
            return;
        }
        //print first element
        if (i == 0){
            System.out.print("[" + arr[i]+ ", ");
        }
        else {
            System.out.print(arr[i]+ ", ");
        }
        printArray(arr, i+1);
    }
}
