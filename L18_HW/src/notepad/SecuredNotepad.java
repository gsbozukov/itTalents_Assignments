package notepad;
public class SecuredNotepad extends SimpleNotepad implements ISecuredNotepad {
    private String password;

    SecuredNotepad(String name, int numberOfPages, final String password) throws Exception{
        super(name, numberOfPages);
        //password has to be at least 5chars, one Uppercase, one lowercase and digit
        boolean has5chars = false;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        //check length of password
        if (password.length()>5){
            has5chars = true;
        }
        for (int i = 0; i < password.length(); i++) {
            //check uppercase
            if (password.charAt(i)>= 'A' && password.charAt(i)<='Z'){
                hasUppercase = true;
                continue;
            }
            //check lowercase
            if (password.charAt(i)>= 'a' && password.charAt(i)<='z'){
                hasLowercase = true;
                continue;
            }
            //check if it has digit
            if (password.charAt(i)>= '0' && password.charAt(i)<='9'){
                hasDigit = true;
            }
        }
        //if password is incorrect
        if (!has5chars||!hasUppercase||!hasLowercase||!hasDigit){
            throw new Exception("Your password is too weak: " +
                    "you need 1 uppercase, 1 lowercase, 1 digit and at least 5 chars. " +
                    "The notepad was not created.");
        }
        else {
            this.password = password;
        }
    }

    //it is the same thing as Simple Notepad, but with passwords

    @Override
    public void addText(int page) {
        requirePassword();
        //if correct proceed to super
        super.addText(page);
    }

    @Override
    public void overrideText(int page) {
        requirePassword();
        //if correct proceed to super
        super.overrideText(page);
    }

    @Override
    public void deleteText(int page) {
        requirePassword();
        //if correct proceed to super
        super.deleteText(page);
    }

    @Override
    public void previewPages() {
        requirePassword();
        //if correct proceed to super
        super.previewPages();
    }

    @Override
    public void printAllPagesWithDigits() {
        requirePassword();
        //if correct proceed to super
        super.printAllPagesWithDigits();
    }

    @Override
    public void searchWord(String word) {
        requirePassword();
        //if correct proceed to super
        super.searchWord(word);
    }

    @Override
    public boolean correctPassword(String password) {
        return this.password.equals(password);
    }
    private void requirePassword (){
        String password;
        while (true){
            System.out.println("Please enter your password:");
            password = sc.nextLine();
            if (correctPassword(password)) {
                //if correct password continue w/ operations - else keep on trying the password
                return;
            }
            System.out.println("Wrong password... try again.");
        }
    }
}
