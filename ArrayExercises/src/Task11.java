public class Task11 {
    public static void main(String[] args) {
        int [] arr1 = {1,4,78,65,7,3,5,3,4,5,6,4};
        int [] arr2 = {1,5,65,78,3,3,65,75,98,1,1,1};
        int sizeOfArray=0;
        if (arr1.length>arr2.length){
            sizeOfArray = arr1.length;
        }
        else {
            sizeOfArray = arr2.length;
        }
        int [] result = new int [sizeOfArray];
        int nextI = 0; // next index for the result array
        //run through the first array and verify one by one to the second

        for (int i = 0; i < arr1.length; i++) {
            int firstOccurence = -1;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    firstOccurence = i;
                    //delete all repetitions
                    arr2[j] = 0;
                }
            }
            if (firstOccurence != -1) {
                result[nextI] = arr1[i];
                nextI++;
            }
        }
        System.out.println("All the duplicates are: ");
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            if (result[i]!=0) {
                System.out.print(result[i] + " ");
            }
        }
        System.out.println("]");

    }
}
