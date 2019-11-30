public class Task19 {
    public static void main(String[] args) {
        //Write a program to read elements in a matrix and finds if given number N is contained
        int [][] matrix = {
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,22,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,22,10}
        };
        int n = 22;
        boolean result = contains(matrix, n, 0, 0);
        System.out.println(result);
    }
    public static boolean contains (int [][] matrix, int n, int i, int j){
        //when to stop
        if (j == (matrix[i].length) && i == matrix.length-1){
            return false;
        }
        //if we've reached the end of the line
        if (j == matrix[i].length){
            return contains(matrix, n, i+1, 0);
        }
        //if not were good: if it contains
        if (n == matrix[i][j]){
            return true;
        }
        //if not, go to next element
        else {
            return contains(matrix, n, i, j+1);
        }
    }
}
