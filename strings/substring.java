package Question_Problem.strings;

public class substring {
    public static void main(String[] args) {
        String s= "abcd";
        
        // for (int i = 0; i < 7; i++) {
        //     System.out.print(s.substring(i));
        //     System.out.println();
        // }

        for (int i = 0; i <=3; i++) {
            for (int j = i+1; j <=4 ; j++) {
                System.out.print(s.substring(i,j));
                System.out.println();
            }
        }
    }
}
