/**
 * Created by domas on 15.3.12.
 */
public class Tests {
    public static void constructorTest(){
        //Test Note
        String testNote1 = "Make Java Project and stuff and more";
        String testNote2 = "Stuff";
        Note test1 = new Note(testNote1);
        System.out.println(testNote1.equals(test1.toString()));
        System.out.println(testNote1.equals(test1.getText()));
        test1.setText(testNote2);
        System.out.println(testNote2.equals(test1.getText()));

        //Test TaskNote

        TaskNote test2 = new TaskNote(testNote1);
        // Kodel su Note test2 = new TaskNote(testNote1);
        // neveike setChecked
        System.out.println(('☐'+testNote1).equals(test2.toString()));
        test2.setChecked(false);
        System.out.println(!test2.getChecked());
        test2.setChecked();
        System.out.println(test2.getChecked());
        System.out.println(('☑'+testNote1).equals(test2.toString()));
    }
}
