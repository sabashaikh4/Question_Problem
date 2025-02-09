package Question_Problem.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class ArraylistWithScanner {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> numbers = new ArrayList<>();

            System.out.println("Enter numbers (type 'done' to finish):");

            while (true) {
                String input = scanner.nextLine();

                // Check if the user wants to finish input
                if (input.equalsIgnoreCase("done")) {
                    break;
                }

                try {
                    // Try to parse the input as an integer
                    int number = Integer.parseInt(input);
                    numbers.add(number);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
                }
            }

            scanner.close();

            // Print the ArrayList
            System.out.println("You entered: " + numbers);
        }
    }

