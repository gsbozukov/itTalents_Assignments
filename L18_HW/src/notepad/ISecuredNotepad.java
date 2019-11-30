package notepad;
public interface ISecuredNotepad extends INotepad {
    boolean correctPassword(String password);
}
