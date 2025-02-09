package Question_Problem.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class maxANDmin {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(2);
        list.add(8);
        System.out.println("Original List: "+list);
        System.out.println("Modify List: "+MinAndMax(list));
    }

    static ArrayList<Integer> MinAndMax(ArrayList<Integer> list){
        Integer Max = Collections.max(list);
        Integer Min = Collections.min(list);
        System.out.println("Max is "+Max);
        System.out.println("Min is "+ Min);

        list.replaceAll( n-> n.equals(Max) ? Min:(n.equals(Min) ? Max : n));

        return list;

       /* for (int i = 0; i < numbers.size(); i++) {
            int n = numbers.get(i);
            if (n == max) {
                numbers.set(i, min);
            } else if (n == min) {
                numbers.set(i, max);
            }
        }*/

    }
}
