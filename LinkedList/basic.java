package Question_Problem.LinkedList;
import java.util.Collections;
import java.util.LinkedList;

public class basic {

    public static void main(String[] args) {

        // create LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Add element
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(2);

        System.out.println("LinkedList: "+ list);
        list.removeLast();
        list.set(1,8);
        System.out.println("LinkedList: "+ list);
        Collections.sort(list);
        System.out.println("LinkedList: "+ list);

        Collections.reverse(list);
        System.out.println("LinkedList: "+ list);
        System.out.println(contain(list));

    }
    static boolean contain(LinkedList<Integer> list){
        if ( list.contains(8)){
            return true;
        }

        return false;
    }
}
