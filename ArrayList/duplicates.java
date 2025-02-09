package Question_Problem.ArrayList;

import java.util.ArrayList;

public class duplicates {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(7);
        list.add(7);
        System.out.println("Before : "+ list);

        /*
        Remove duplicates
        ArrayList<Integer> num = removeDuplicate(list);
         removeDuplicate(list);
       */
        System.out.println("After : "+ removeDuplicate(list));

    }
    static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> uniqueList = new ArrayList<>();

       for (Integer element : list){
           if (!uniqueList.contains(element)){
               uniqueList.add(element);
           }
       }
        return uniqueList;
    }
}
