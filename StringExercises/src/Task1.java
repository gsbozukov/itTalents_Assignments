//TODO FINISH THIS PROBLEM!

public class Task1 {
    public static void main(String[] args) {
        //Finding length of a string with a loop

        String text = "Yes This shit works!";
        int counter = 0;
        StringBuilder builder = new StringBuilder(text);

        while (builder.length()>=1){
            builder.deleteCharAt(0);
            counter++;
        }

        System.out.println(counter);
    }
}
