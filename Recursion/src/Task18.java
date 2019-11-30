public class Task18 {
    public static void main(String[] args) {
        //Write a program to read elements in a matrix and find average of elements
        int [][] matrix = {
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10}
        };
        double result = sumOfMatrix(matrix, 0, 0, 0, 0, 0);
        System.out.println("The avg is: "+result);
    }
    public static double sumOfMatrix (int[][]matrix, int i, int j, int sum, double avg, int count){
        //when to stop: last j of last row
        if (j == (matrix[i].length) && i == matrix.length-1){
            return avg;
        }
        //if we've reached the end of the row, next row
        if (j == matrix[i].length){
            return sumOfMatrix(matrix, i+1, 0, sum, avg, count);
        }
        //else we're good
        else {
            sum = sum + matrix[i][j];
            count++;
            System.out.println(count);
            avg = (double) sum/count;
            return sumOfMatrix(matrix, i, j+1, sum, avg, count);
        }
    }
}
