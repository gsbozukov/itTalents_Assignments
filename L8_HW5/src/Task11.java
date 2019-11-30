public class Task11 {
    public static void main(String[] args) {
        //given the array
        int [] arr = {1,5,4,8,9,74,5,6,7,6};
        //printing the array
        printArray(arr);
    }

    public static void printArray (int [] array){
        //printing
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1){
                System.out.print(array[i]);
            }
            else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("]");
        return;
    }
}
