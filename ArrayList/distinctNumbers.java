package Question_Problem.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class distinctNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Entered Integer (input ends with 0):");
        int value;

        do{
            value = input.nextInt();

           if (!list.contains(value) && value != 0){
               list.add(value);
           }
        } while (value != 0);

        // Display the distinct numbers
        for(int element : list){
            System.out.print(element + " ");
        }
    }
}
