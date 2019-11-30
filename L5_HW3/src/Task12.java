public class Task12 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7};
        int swap = 0;
        //switching 0 and 1
        swap = array[0];
        array[0] = array[1];
        array[1] = swap;
        //switching 2 and 3 with addition
        array[2] = array[2]+array[3];   //a = a+b
        array[3] = array[2]-array[3];   //b = (a+b)-b original = original a
        array[2] = array[2]-array[3];   //a = (a+b)-a original = original b
        //switching 4 and 5 with multiplication
        array[4] = array[4]*array[5];   //a = a*b
        array[5] = array[4]/array[5];   //b = (a*b)/b original = original a
        array[4] = array[4]/array[5];   //a = (a*b)/a original = original b

        //Printing the final form
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i==(array.length-1)){
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i]+ ", ");
        }
        System.out.print("]");
    }
}
