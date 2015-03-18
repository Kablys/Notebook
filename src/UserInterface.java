
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by domas on 15.3.12.
 */
public class UserInterface {
    public static void start(){
        List<Note> noteList = new LinkedList<Note>();
        Scanner userInput = new Scanner(System.in);
        boolean exit = false;
        while(!exit){ // tikrinti su userAction jei lygu 4-exit
            System.out.println("Your options: 1-add, 2-remove, 3-print, 4-exit");
            Integer userActions = 0;
            try {
                userActions = Integer.parseInt(userInput.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Wrong input try again.");
                continue;
                //e.printStackTrace();
            }
            Integer index;

            switch (userActions) {
                case 1:
                    System.out.print("Write contents of note:");
                    String userStringInput = userInput.nextLine();
                    //String userStringInput2 = userInput.nextLine();
                    noteList.add(new Note(userStringInput));
                    break;

                case 2:
                    System.out.println("Write index of Note to remove, or 0 to return to menu.");

                    try {
                        index = Integer.parseInt(userInput.nextLine());
                        if (index < 0 || index > noteList.size()){
                            throw new NumberFormatException();
                        } else if (index == 0) {
                            continue;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong input try again.");
                        continue;
                        //e.printStackTrace();
                    }
                    noteList.remove(index - 1);
                    break;

                case 3:
                    index = 1;
                    for(Note iterator:noteList){
                        System.out.println(index.toString() + ' ' + iterator.toString());
                        //System.out.println(index + ' ' + iterator.toString());
                        index += 1;
                    }
                    break;

                case 4:
                    userInput.close();
                    exit = true;
                    break;
                default:
                    System.out.println("Wrong option number, try again.");
                    break;


            }
        }
    }

}
