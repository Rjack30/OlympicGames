package Services;

import java.util.Collection;
import java.util.LinkedList;

    public class EFY {
        public static void main(String[] args) {
            Collection<String> list = new LinkedList<>();

// use add() method to add elements in the list
            list.add("Events");
            list.add("For");
            list.add("Year");

            // Output the present list
            System.out.println("The list is: " + list);

            // Adding new elements to the end
            list.add("Last");
            list.add("Element");

            // printing the new list
            System.out.println("The new List is: " + list);
        }
    }






