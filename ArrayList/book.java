package Question_Problem.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class book {
    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();
        list.add(2.3);
        list.add(7.3);
        list.add(5.3);
        list.add(2.33);
        list.add(3.4);
        list.add(2.1);
        list.add(1,20.9);
        System.out.print("Before sort: "+list);
        System.out.println();
        q1(list);
        System.out.println("after sort: "+list);
        System.out.println(list.size());


    }

    static ArrayList<Double> q1(ArrayList<Double>list1){
        Collections.sort(list1);
        return  list1;
    }
}
