package notepad;
public class DemoNotepad {
    public static void main(String[] args) throws Exception {
        //creating the electronic secured notepad, if password is weak, it won't be created
        ElectronicSecuredNotepad notepad = new ElectronicSecuredNotepad("Notepad", 15, "Fifi55");
        //if we don't turn it on, nothing will happen, so we have to turn it on
        notepad.start();
        //if we stop it it won't work, again...
        notepad.stop();
        notepad.addText(4); //it will say, please turn on your device
        notepad.start();
        notepad.addText(15);    //it will require the password, before doing anything
        notepad.addText(1);     //write something including a digit
        notepad.addText(2);     //write something including a digit and the word "Hello"
        notepad.addText(3);     //write something including the word "Hello"
        notepad.addText(4);     //write some nonsense
        notepad.deleteText(4);  //we delete that
        notepad.addText(5);     //write some nonsense
        notepad.overrideText(5);//override that and include the word "Hello"
        notepad.printAllPagesWithDigits();  //we should get a print for pages 1, 2
        notepad.searchWord("Hello");    //we should get pages: 2, 3 and 5
        notepad.addText(2);     //let's add some text on page 2
        notepad.previewPages();         //it will print all pages that are not empty


    }
}
