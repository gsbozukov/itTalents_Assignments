public class L3_Problem23 {
    public static void main(String[] args) {
        int row = 1;
        int col = 1;

        while (row<=9){
            while (col<=9){
                System.out.print(row+" * "+col+" = "+ row*col+"; ");        //print the product between the 2
                col++;                                                      //increment with 1
            }
            row++;                                                          //next row
            col=row;                                                        //first multiplier is always equal to row
            System.out.println();                                           // new line
        }
    }
}
