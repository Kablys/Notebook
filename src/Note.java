import java.util.Calendar;
import java.util.LinkedList;

/**
 * Created by domas on 15.3.6.
 */
public class Note {
    private String text;
    private static int noteCount = 0;
    private final Calendar creationDate;
    private Calendar lastModifiedDate;
    public LinkedList<Note> children;
    //TODO add, remove, sort, print
    //TODO bulleted list, numbered list

    public Note (String input){
        creationDate = Calendar.getInstance();
        lastModifiedDate = Calendar.getInstance();
        noteCount++;
        setText(input);
    }

    public static int getNoteCount() {
        return noteCount;
    }

    public String getText() {
        return text;
    }

    public final void setText(String text) {
        this.text = text;
        lastModifiedDate = Calendar.getInstance();
    }

    @Override
    public String toString() {
        return getText();
    }
}
