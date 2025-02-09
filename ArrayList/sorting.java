package Question_Problem.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(7);
        list.add(4);
        list.add(5);

        System.out.println("\nBefore Sorting.....");
        printList(list);
        System.out.println();
        System.out.println("\nAfter Sorting.....");
        des(list);
        printList(list);
    }

    // sorting in ascending
    static ArrayList<Integer> Sorting(ArrayList<Integer> list){
        Collections.sort(list);

        return list;
    }

    private static void printList(ArrayList<Integer> list) {
        System.out.println("Elements in List: ");
        for (int element: list){
            System.out.print(element+" ");
        }
    }

    // sorting in descending
    static void des(ArrayList<Integer> list){
        list.sort(Collections.reverseOrder());
    }
}
