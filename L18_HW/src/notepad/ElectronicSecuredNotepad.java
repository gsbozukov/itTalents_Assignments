package notepad;
public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice{
    private boolean isStarted;

    ElectronicSecuredNotepad(String name, int numberOfPages, String password) throws Exception {
        super(name, numberOfPages, password);
    }

    @Override
    public void start() {
        if (this.isStarted){
            System.out.println("It is already ON.");
            this.isStarted = true;
        }
        else this.isStarted = true;
    }

    @Override
    public void stop() {
        if (!this.isStarted){
            System.out.println("It is already OFF.");
            this.isStarted = false;
        }
        else this.isStarted = false;
    }

    @Override
    public boolean isStarted() {
        return this.isStarted;
    }
    //overriding all methods and checking if the notepad is started
    @Override
    public void addText(int page) {
        if (isStarted()){
            super.addText(page);
        }
        else System.out.println("Please turn on your device.");
    }

    @Override
    public void overrideText(int page) {
        if (isStarted()){
            super.overrideText(page);
        }
        else System.out.println("Please turn on your device.");
    }

    @Override
    public void deleteText(int page) {
        if (isStarted()){
            super.deleteText(page);
        }
        else System.out.println("Please turn on your device.");
    }

    @Override
    public void previewPages() {
        if (isStarted()){
            super.previewPages();
        }
        else System.out.println("Please turn on your device.");
    }

    @Override
    public void printAllPagesWithDigits() {
        if (isStarted()){
            super.printAllPagesWithDigits();
        }
        else System.out.println("Please turn on your device.");
    }

    @Override
    public void searchWord(String word) {
        if (isStarted()){
            super.searchWord(word);
        }
        else System.out.println("Please turn on your device.");
    }
}
