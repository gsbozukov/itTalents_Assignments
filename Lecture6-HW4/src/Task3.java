public class Task3 {
    public static void main(String[] args) {
        double [][] matrix = {
                {12.2, 15.5, 45.8, 456, 2.5},
                {17.2, -12.5, 15.0, 12, 44.1},
                {24, 25.5, 45.2, -4.6, 23},
                {12, 20.1, 210.6, 4, 27.1, 4, -6.5}
        };
        double sum = 0;
        double avg = 0;
        double values = 0;
        //finding sum and number of values
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
            values = values + matrix[i].length;
        }
        avg = sum/values;
        System.out.println("The sum of all the values is: "+sum+", and the average is: "+avg);
    }
}
