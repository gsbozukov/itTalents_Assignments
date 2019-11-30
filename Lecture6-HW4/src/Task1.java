public class Task1 {
    public static void main(String[] args) {
        //creating the matrix
        int [][]matrix = {
                {48, 72, 13, 14, 15},
                {21, 22, 53, 24, 75},
                {31, 57, 33, 34, 35},
                {41, 95, 43, 44, 45},
                {59, 52, 53, 54, 55},
                {61, 69, 63, 64, 65}
        };
        //looking for max and min values, also if there is a negative number, the program stops (Since we're looking for natural numbers)
        int max=0;
        int min = 2147483647;

        for (int i = 0; i < matrix.length; i++) {
            //loop the inner arrays
            for (int j = 0; j < matrix[i].length; j++) {
                //looking for max
                if (matrix[i][j]>max){
                    max = matrix[i][j];
                }
                //looking for min
                if (matrix[i][j]<min){
                    min = matrix[i][j];
                }
                //if the teacher changes a value to a negative
                if (matrix[i][j]<0){
                    System.out.println("Please don't do that.");
                    return;
                }
            }
        }
        System.out.println("The max value is: "+max+" and the min value is: "+min);
    }
}
