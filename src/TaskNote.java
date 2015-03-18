/**
 * Created by domas on 15.3.6.
 */
public class TaskNote extends Note {
    private Boolean checked;

    public TaskNote(String input) {
        super(input);
        setChecked(false);
    }

    public Boolean getChecked() {
        return checked;
    }
    public String getCheckedSymbol() {
        if (checked){
            return "☑";
        }else{
            return "☐";
        }
    }

    public void setChecked() {
        setChecked(true);
    }
    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    @Override
    public String toString() {
        return getCheckedSymbol() + getText();
    }
}
