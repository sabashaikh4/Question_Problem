package Question_Problem.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class error {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Dallas");
        list.add("Dallas");
        list.add("Houston");
        list.add("Dallas");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++)
            list.removeAll(Collections.singleton("Dallas"));

        System.out.println(list);
    }
}
