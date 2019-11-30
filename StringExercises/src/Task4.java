public class Task4 {
    public static void main(String[] args) {
        //convert to uppercase

        String text = "HellO mY FrIenDS!";
        StringBuilder builder = new StringBuilder("");

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (symbol >= 'a' && symbol <= 'z'){
                int numerical = symbol-32;
                builder.append((char) numerical);
            }
            else {
                builder.append(symbol);
            }

        }
        System.out.println(builder);
    }
}
