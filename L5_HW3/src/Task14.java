public class Task14 {
    public static void main(String[] args) {
        //Given the array
        double []arr = {7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2};
        //Verify the size of the new array
        int sizeNew=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=-2.99 && arr[i]<=2.99){
                sizeNew++;
            }
        }
        if (sizeNew==0){
            System.out.println("There are no values between -2.99 and 2.99!");
            return;
        }

        double [] arr2 = new double[sizeNew];
        int j = 0;          //j is filling arr2
        //Loops the big loop and enters the values that are between -2.99 and 2.99
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=-2.99 && arr[i]<=2.99){
                arr2[j]=arr[i];
                j++;
            }
        }
        //Printing new array
        System.out.print("[");
        for (int i = 0; i < arr2.length; i++) {
            if (i==(arr2.length-1)){
                System.out.print(arr2[i]);
                break;
            }
            System.out.print(arr2[i]+ ", ");
        }
        System.out.print("]");
    }
}
