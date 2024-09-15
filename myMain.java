/** @author Joslenne Pena
 * 3/25/21
 */
import java.util.ArrayList;
import java.util.List;

// using the import statement below means importing all Java core utilities
// import java.util.*

public class myMain {
    public static void main(String[] args) {
        // c-style for loop
        for (int i = 0; i < 15; i++) {
            System.out.println(i);
        }

        // for-each loop
        // for each item in a list or array 
        // List<String> cars = List.of("jeep", "ford", "honda");
        // for (String i : cars){
        //     System.out.println(i);
        // }

        //CREATES ERROR - WHY?
        // System.out.println(cars.get(1));
        // cars.set(1, "tesla");
        // System.out.println(cars.get(1));

        // while loop loops through a block of code as long as a specified condition is true
        // int i = 0;
        // while (i < 5){
        //     System.out.println(i);
        //     i++;
        // }

        //do while loop
        // loop will execute the code block once, before checking if the condition is true, 
        // then it will repeat the loop as long as the condition is true
        // this loop will always be executed at least once, even if the condition is false
        // int y = 0;
        // do {
        //     System.out.println(y);
        //     y++;
        // }
        // while (y < 5);

        // creating objects

        // here we are using the List interface generally to say we can 
        // typecast to another type of list like linkedlist or arraylist
        // this is a more general implementation of the list interface
        //List<String> myList = new ArrayList<>();

        // the one below is more specific and means that you are bound
        // to use the arraylist methods only
        //ArrayList<String> coffee = new ArrayList<>();
    }
}
