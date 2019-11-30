public class Task13 {
    public static void main(String[] args) {
        //given the arrays
        int [] arr1 = {1,5,7,9,8,7,5,1,2,5,4};
        int [] arr2 = {98,78,45,54,54,545,56,-54};

        //joining arrays
        joinArrays(arr1, arr2);

        //printing array
        printArray(joinArrays(arr1, arr2));
    }

    public static int [] joinArrays (int [] x, int [] y){
        int [] array = new int[x.length+y.length];
        int j = 0;      //j counter which is equivalent to i of the second array
        for (int i = 0; i < array.length; i++) {
            //for the first half fill from first array
            if (i<x.length){
                array [i] = x[i];
            }
            //for the second half fill from second array

            else {
                array [i] = y[j];
                j++;
            }
        }
        return array;
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
