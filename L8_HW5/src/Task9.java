import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a line of text, minuses and numbers without spaces and press Enter:");
        String text = sc.next();
        int sum = 0;
        //loop the whole string
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            //if we have -ve or a number enter another loop
            if (symbol >= '0' && symbol <= '9' || symbol == '-'){
                int number;
                //for negatives, we multiply the end result by -1
                if (symbol == '-'){
                    number = 0;
                    for (int j = i+1; j < text.length(); j++) {
                        if (text.charAt(j) >= '0' && text.charAt(j) <= '9'){
                            number = number*10;
                            number = number + text.charAt(j) - '0';
                            i++;
                        }
                        else {
                            break;
                        }
                    }
                    System.out.println(number*-1);
                    sum = sum + (number*-1);
                }
                //for positives we simply 'save' the number created
                else {
                    number = symbol - '0';
                    for (int j = i+1; j < text.length(); j++) {
                        if (text.charAt(j) >= '0' && text.charAt(j) <= '9'){
                            number = number*10;
                            number = number + text.charAt(j) - '0';
                            i++;
                        }
                        else {
                            break;
                        }
                    }
                    System.out.println(number);
                    sum = sum+number;
                }

            }

        }
        System.out.println("The total sum is: " + sum);
    }
}
