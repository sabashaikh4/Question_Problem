package Question_Problem.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ModifyName {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Eve");
        names.add("Dave");
        System.out.println("original List: "+ names);
        System.out.println(("ModifyList: "+name(names)));

    }

     static ArrayList<String> name (ArrayList<String> names){
        names.replaceAll(String::toUpperCase);

         names.removeIf( n -> n.length()<5);

         //Collections.reverse(names);
         names.sort(Collections.reverseOrder());
         /*for (String n : names){
             n.remove
         }*/
         return names;
     }
}
