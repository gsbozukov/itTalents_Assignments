public class L3_Problem12 {
    //Prints all natural 3-digit numbers which digits are not repeating
    public static void main(String[] args) {
        // Loop that loops all 3-digit numbers
        for (int i = 100; i<999; i++){
            //explosion of number
            int firstNum = i/100;
            int secondNum = (i-firstNum*100)/10;
            int thirdNum = (i-firstNum*100-secondNum*10);
            //If they're different, print them
            if (firstNum!=secondNum && secondNum!=thirdNum && firstNum!=thirdNum){
                System.out.println(i);
            }
        }
    }
}
