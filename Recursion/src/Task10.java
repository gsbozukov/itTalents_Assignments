public class Task10 {
    public static void main(String[] args) {
        //Write a recursive function to generate nth fibonacci term in C programming.
        //input greater than 3
        int input = 10;
        int result = fibonacci(input, 1, 1, 3);
        System.out.println(result);
    }
    public static int fibonacci (int input, int n1, int n2, int counter){
        if (counter == input){
            int result = n1 + n2;
            return result;
        }
        int result = n1+n2;
        return fibonacci(input, result, n1, counter+1);
    }
}
