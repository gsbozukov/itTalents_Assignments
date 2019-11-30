public class Task16 {
    public static void main(String[] args) {
        //Write a program to count the frequency of each element of an array
        int[] arr = {2,1,1,1,1,1};
        printFrequencies(arr, 0);
    }

    public static void printFrequencies(int[] arr, int i) {
        //for every unique make me print
        int[] uniques = new int[arr.length];
        findUniques(arr, uniques, 0, 0);
        int[] freq = new int[arr.length];
        findFrequencies(arr, freq, uniques, 0, 0);
        while (freq[i] != 0) {
            System.out.println("The frequency of " + uniques[i] + " is " + freq[i]);
            i++;
        }
    }

    public static int[] findUniques(int[] arr, int[] uniques, int i, int k) {
        //when to stop
        if (i == arr.length) {
            return uniques;
        }
        //check for uniques
        for (int j = 0; j < uniques.length; j++) {
            if (arr[i] == uniques[j]) {
                return findUniques(arr, uniques, i + 1, k);
            }
        }
        uniques[k] = arr[i];
        return findUniques(arr, uniques, i + 1, k + 1);
    }

    public static int[] findFrequencies(int[] arr, int[] freq, int[] uniques, int i, int count) {
        for (int j = 0; j < arr.length; j++) {
            if (uniques[i] == arr[j]) {
                count++;
            }
        }
        if (count == 0) {
            return freq;
        } else {
            freq[i] = count;
        }
        return findFrequencies(arr, freq, uniques, i + 1, 0);
    }
}