package Question_Problem.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

    public class wxc{
        public static void main(String[] args) {
            ArrayList<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");
            names.add("Eve");
            names.add("Dave");

            System.out.println("Original List: " + names);

            // Modify the names list
            ArrayList<String> result = modifyNames(names);

            System.out.println("Modified List: " + result);
        }

        public static ArrayList<String> modifyNames(ArrayList<String> names) {
            // Convert all names to uppercase
            names.replaceAll(String::toUpperCase);

            // Remove names shorter than 5 characters
            names.removeIf(name -> name.length() < 5);

            // Sort in reverse alphabetical order
            names.sort(Collections.reverseOrder());

            return names;
        }
    }


