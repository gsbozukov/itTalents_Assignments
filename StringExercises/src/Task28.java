public class Task28 {
    public static void main(String[] args) {
        //count occurrences in a given string
        String sentence = "I love programming. I love coding. love love love ";
        String word = "programming";
        String [] wordByWord = sentence.split(" ");
        int occurrences = 0;
        boolean doesntContain = true;
        for (int i = 0; i < wordByWord.length; i++) {
            if (wordByWord[i].contains(word)){
                occurrences++;
                doesntContain = false;
            }
        }
        if (doesntContain){
            System.out.println("the word is not in the sentence");
        }
        System.out.println("The occurrences of '"+word+"': "+ occurrences);
    }
}
