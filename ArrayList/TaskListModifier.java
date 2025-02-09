package Question_Problem.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class TaskListModifier {

    public static void main(String[] args) {
        ArrayList<String> Task = new ArrayList<>();
        Task.add("Start project");
        Task.add("urgent: Submit report");
        Task.add("Buy groceries");
        Task.add("Urgent: finish homework");
        Task.add("Attend meeting");
        Task.add("Complete project");
        System.out.println(" Before task: "+ Task);

        System.out.println("After Task: "+  modifyTask(Task));

    }

    static ArrayList<String> modifyTask (ArrayList<String> Task){
        int maxLength = 0;
        for (String list : Task){
            maxLength = Math.max(maxLength,list.length());
        }
        Task.removeIf(String ->  String.toLowerCase().contains("urgent"));
        System.out.println("Length of the longest task: "+ maxLength);
        Collections.sort(Task);
        return Task;
    }

}
