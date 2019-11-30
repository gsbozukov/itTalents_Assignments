public class Task6 {

    public static void main(String[] args) {
        String randomText = "1234bac #$#$";
        int counterAlpha = 0;
        int counterNumer = 0;
        int counterOthers = 0;

        for (int i = 0; i < randomText.length(); i++) {
            char symbol = randomText.charAt(i);
            if (symbol>='0' && symbol<='9'){
                counterNumer++;
            }
            if (symbol>='a' && symbol<='z'||
                    symbol>='A' && symbol<='Z'){
                counterAlpha++;
            }
        }
        counterOthers = randomText.length() - counterAlpha - counterNumer;
        System.out.println("We have: "+ counterNumer +" numerical digits.");
        System.out.println("We have: "+ counterAlpha +" Alphabetical characters.");
        System.out.println("We have: "+ counterOthers +" other characters.");
    }

}
