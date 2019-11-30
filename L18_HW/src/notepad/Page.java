package notepad;
public class Page {
    private String title;
    private String text;
    //constructor
    //we only require a proper title
    Page (String title){
        //we have no limitations here except string being empty
        if (!title.isEmpty()){
            this.title = title;
            //making a new line
            System.out.println();
        }
        else {
            System.out.println("The page has no title!");
            this.title = "No title";
            //making a new line
            System.out.println();
        }
    }

    String getText() {
        return this.text;
    }

    public String getTitle() {
        return this.title;
    }

    /////////////////methods//////////////
    //addText
    void addText (String text){
        this.text = text;
        //create a new line
        System.out.println();
    }
    //deleteText
    void deleteText (){
        this.text = "";
        this.title = "No title";
    }
    //previewText
    void previewText (){
        System.out.println(this.title);
        System.out.println(this.text);
    }
    //search word
    boolean searchWord(String word){
        //if the word is in the text or title, it returns true, else false
        if (this.text.contains(word) || this.title.contains(word)){
            return true;
        }
        else return false;
    }
    //contains digit in title or text
    boolean containsDigit (){
        if (this.text.matches(".*\\d.*") || this.title.matches(".*\\d.*")){
            return true;
        }
        else return false;
    }
}
