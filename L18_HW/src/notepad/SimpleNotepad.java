package notepad;
import java.util.Scanner;
public class SimpleNotepad implements INotepad{
    Scanner sc = new Scanner(System.in);
    private int numberOfPages;
    private Page [] pages;
    private String name;

    //create a notepad - we need pages and title of notepad
    SimpleNotepad (final String name, final int numberOfPages){
        //verify name
        if (!name.isEmpty()){
            this.name = name;
        }
        else {
            System.out.println("Your notepad has no title...");
            this.name = "No Title";
        }
        //verify pages
        if (numberOfPages>0){
            this.numberOfPages = numberOfPages;
            this.pages = new Page[this.numberOfPages];
        }
        else {
            this.numberOfPages = 10;
            this.pages = new Page[this.numberOfPages];
        }
    }

    @Override
    public void addText(int page) {
        //if page number is out of bounds stop it
        if (!checkPageValidity(page)){
            return;
        }
        //if page doesn't exist, create it
        if (this.pages[page-1]==null){
            System.out.println("Empty page #"+page+", please enter a title");
            String title = sc.nextLine();
            this.pages[page-1] = new Page(title);
            System.out.println("Please enter your text:");
            String text = sc.nextLine();
            this.pages[page-1].addText(text);
        }
        //if it exists, append
        else {
            System.out.println("You are writing on the existing page "+page);
            System.out.println("Please enter your additional text:");
            String text = sc.nextLine();
            this.pages[page-1].addText(this.pages[page-1].getText().concat(text));
        }
    }

    @Override
    public void overrideText(int page) {
        //check page validity
        if (checkPageValidity(page) && this.pages[page-1]!=null){
            System.out.println("Please enter your text that you want to overwrite on page "+page);
            String text = sc.nextLine();
            this.pages[page-1].addText(this.pages[page-1].getText().concat(text));
        }
        else System.out.println("Page "+page+" is empty, you cannot override.");
    }

    @Override
    public void deleteText(int page) {
        //check page validity and if it is not empty
        if (checkPageValidity(page) && this.pages[page-1]!=null){
            System.out.println("Deleting page "+page);
            this.pages[page-1].deleteText();
        }
        //else, say that there is nothing to delete
        else {
            System.out.println("The text on page "+page+" does not exist and cannot be deleted.");
        }
    }

    @Override
    public void previewPages() {
        //print name of notepad
        System.out.println("NOTEPAD "+this.name);
        //show only non null pages
        for (int i = 0; i < this.pages.length; i++) {
            if (this.pages[i] != null){
                System.out.println("========");
                //print title and text
                this.pages[i].previewText();
                //get page
                System.out.println("Page "+(i+1));
            }
        }
    }
    //printing pages with digits
    public void printAllPagesWithDigits(){
        //if page contains digit, print page
        boolean hasDigits = false;
        System.out.println("Printing all pages containing digits...");
        for (int i = 0; i < this.pages.length; i++) {
            if (this.pages[i] != null && this.pages[i].containsDigit()){
                System.out.println("========");
                //print title and text
                this.pages[i].previewText();
                //get page
                System.out.println("Page "+(i+1));
                hasDigits = true;
            }
        }
        //if we found no digits anywhere
        if (!hasDigits){
            System.out.println("There are no pages containing digits.");
        }
    }
    //show pages that contain the word
    public void searchWord(String word){
        boolean hasWord = false;
        System.out.println("The word ''"+word+"'' is contained on page(s):");
        for (int i = 0; i < this.pages.length; i++) {
            if (this.pages[i] != null && this.pages[i].searchWord(word)){
                //if the word is contained in the text print page
                System.out.print((i+1)+"  ");
                hasWord = true;
            }
        }
        System.out.println();
        if (!hasWord){
            System.out.println("Sorry, your word is not in any of the pages.");
        }
    }
    private boolean checkPageValidity(int page){
        if (page>this.numberOfPages || page==0){
            System.out.println("You cannot write, overwrite or delete on page "+page+
                    " since this notepad has only "+this.numberOfPages+" pages");
            return false;
        }
        else {
            return true;
        }
    }
}
