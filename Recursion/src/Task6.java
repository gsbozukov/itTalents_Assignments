public class Task6 {
    public static void main(String[] args) {
        //Write a recursive function find reverse of any number
        int input = 15155511;
        int result = reverse(input, 0);
        System.out.println(result);
    }

    public static int reverse(int input, int result){
        if (input == 0){
            return result;
        }
        //take last digit and put it in first place
        result = result*10 + input%10;
        return reverse(input/10, result);
    }

}
