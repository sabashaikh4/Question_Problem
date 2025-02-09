package Question_Problem.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class RemoveAllEvenNumber {
    public static void main(String[] args) {
    ArrayList<Integer> Num = new ArrayList<>();
    Num.add(4);
    Num.add(5);
    Num.add(2);
    Num.add(9);
    Num.add(7);
    Num.add(6);
    Num.add(8);

        System.out.println("Original list: "+ Num);
        ArrayList<Integer> result = modifyList(Num);
        System.out.println("Modified List: "+ result);

    }

    static ArrayList<Integer> modifyList(ArrayList<Integer> list) {
        list.removeIf(n -> n % 2 == 0);

        list.replaceAll(integer -> integer * 2);

        /* for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)* 2);
        }*/

        Collections.sort(list);
        return list;
    }
}
