public class Task5 {
    public static void main(String[] args) {
        //creating array with 10 elements
        int [] array = new int[10];
        //filling the array

        for (int i = 0; i < array.length; i++) {
            array[i] = i*3;
        }
        //Printing new array
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i==(array.length-1)){
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i]+ ", ");
        }
        System.out.print("]");
    }
}
