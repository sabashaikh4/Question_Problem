package Question_Problem.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class revers {

    // static void reverseList(ArrayList<Integer> list){
    //       int i = 0, j =list.size() - 1;

    //       while (i<j) {
    //         Integer temp =Integer.valueOf(list.get(i));
    //         list.set(i, list.get(j));
    //         list.set(j, temp);
    //         i++;
    //         j--;
    //       }
    // }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       list.add(0);
       list.add(10);
       list.add(3);
       list.add(5);
       list.add(22);
       list.add(10);
       System.out.print("original list " + list);
       //reverseList(list);
       Collections.reverse(list);
       System.out.println();
       System.out.print("revers"+ list);
       Collections.sort(list);
       System.out.println(list);

       Collections.sort(list, Collections.reverseOrder());
       System.out.println(list);
    }

}
