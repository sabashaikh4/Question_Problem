package Question_Problem.ArrayList;
import java.util.ArrayList;

public class gpt {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(33);
        list.add(2);
        list.add(7);
    }

    // basic adding
    static void add(){
    ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        for (int num : list){
            System.out.print(num+" ");
        }
    }

    // basic removing
    static  void Remove(){
        ArrayList<String> list = new ArrayList<>();
        list.add("bob");
        list.add("jad");
        list.add("oggy");
        list.add("doreamon");
        list.add("shinchan");

        for (String name : list){
            System.out.print(name+" ");
        }
        System.out.println();

        list.remove("jad");
        for (String name : list){
            System.out.print(name + " ");
        }
    }

    // Access and search
    static void color(){
        ArrayList<String> color = new ArrayList<>();
        color.add("red");
        color.add("green");
        color.add("blue");
        for (String c : color){
            System.out.print(c+" ");
        }
        System.out.println();

        for (String e: color){
            if (e.equals("blue")){
                System.out.println("Exist At index: "+e.indexOf(e));
                break;
            } else System.out.println("not found");
        }
    }

    //  Write a method to return the index of the first occurrence of a given element in the ArrayList. If it doesn’t exist, return -1.
     static  void occurrence(){
        ArrayList<String> color = new ArrayList<>();
         color.add("red");
         color.add("green");
         color.add("blue");
         for (String c : color){
             System.out.print(c+" ");
         }
         System.out.println();

         for (String c: color){
             if (c.equals("blue")){
                 System.out.println(" Present");
                 break;
             } else {
                 System.out.println(-1);
             }
         }
       for (String c : color){
           System.out.print(c+" ");
       }

     }

    // print list
    static void printList(ArrayList<Integer> list){
        System.out.print("Element in the list: ");
        for (int e : list){
            System.out.println(e);
        }
    }
}
