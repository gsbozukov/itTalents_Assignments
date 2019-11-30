public class Task17and18 {
    public static void main(String[] args) {
        int [] arr = {5, 10, 2, 5, 50, 5, 10, 1, 2, 2};
        int [] arrCopy = {5, 10, 2, 5, 50, 5, 10, 1, 2, 2};
        int [] freq = new int[arrCopy.length];
        //creating unique array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    arrCopy[j] = 0;
                }
            }
        }
        //frequency of each unique
        for (int i = 0; i < arrCopy.length; i++) {
            int frequency = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arrCopy[i] != 0 && arrCopy[i] == arr[j]){
                    frequency++;
                }
            }
            freq[i] = frequency;
        }
        //printing
        for (int i = 0; i < arrCopy.length; i++) {
            if (arrCopy[i]!=0){
                System.out.println("Freq of "+arrCopy[i]+" = "+freq[i]);
            }
        }
    }
}
