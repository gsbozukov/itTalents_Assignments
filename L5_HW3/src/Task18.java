public class Task18 {
    public static void main(String[] args) {
        //first two initial arrays
        int []arr1 = {18, 19, 32, 1, 3, 4, 5, 6, 7, 8};
        int []arr2 = {1, 2, 3, 4, 5, 16, 17, 18, 27, 11};
        //check if their lengths are the same
        if (arr1.length!=arr2.length){
            System.out.println("Please keep the lengths of the arrays equal.");
            return;
        }
        //creating the result array
        int[] result = new int[arr1.length];
        for (int i = 0; i < result.length; i++) {
            //if arr1 > arr2, take arr1
            if (arr1[i]>=arr2[i]){
                result[i] = arr1[i];
            }
            else {
                result[i] = arr2[i];
            }
        }
        //printing arr1
        System.out.println("The first array is: ");
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            if (i==(arr1.length-1)){
                System.out.print(arr1[i]);
                break;
            }
            System.out.print(arr1[i]+ ", ");
        }
        System.out.println("]");
        //printing arr2
        System.out.println("The second array is: ");
        System.out.print("[");
        for (int i = 0; i < arr2.length; i++) {
            if (i==(arr2.length-1)){
                System.out.print(arr2[i]);
                break;
            }
            System.out.print(arr2[i]+ ", ");
        }
        System.out.println("]");
        //printing result array
        System.out.println("The result is: ");
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            if (i==(result.length-1)){
                System.out.print(result[i]);
                break;
            }
            System.out.print(result[i]+ ", ");
        }
        System.out.println("]");
    }
}
