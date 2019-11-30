public class Task17 {
    public static void main(String[] args) {
        //Write a program to read elements in a matrix and find sum of elements
        int [][] matrix = {
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10}
        };
        int result = sumOfMatrix(matrix, 0, 0, 0);
        System.out.println("The sum is: "+result);
    }
    public static int sumOfMatrix (int[][]matrix, int i, int j, int sum){
        //when to stop: last j of last row
        if (j == (matrix[i].length) && i == matrix.length-1){
            return sum;
        }
        //if we've reached the end of the row, next row
        if (j == matrix[i].length){
            return sumOfMatrix(matrix, i+1, 0, sum);
        }
        //else we're good
        else {
            sum = sum + matrix[i][j];
            return sumOfMatrix(matrix, i, j+1, sum);
        }
    }
}
