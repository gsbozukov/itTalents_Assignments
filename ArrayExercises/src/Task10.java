public class Task10 {
    public static void main(String[] args) {
        int [] arr = {1,5,4,8,9,1,4,65,7,8,9,8,7,6,5,4};
        //find duplicate values of an array and save them in another array
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = (i+1); j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    //the repeating character is set to 0
                    arr[j] = 0;
                    count++;
                }
            }
            //if it is not repeating delete it
            if (count == 0){
                arr[i] = 0;
            }
        }
        //print new array
        System.out.println("All the duplicates are: ");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("]");
        //find values that repeat
        //print what repeats and how many times
    }
}
