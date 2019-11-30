package notepad;
public interface INotepad {
    void addText(int page);
    void overrideText(int page);
    void deleteText(int page);
    void previewPages();
    void searchWord(String word);
    void printAllPagesWithDigits();
}
