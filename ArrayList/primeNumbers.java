package Question_Problem.ArrayList;

import java.util.ArrayList;

public class primeNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(11);
        System.out.println("original list: "+ list);
        System.out.println("After : "+modifyList(list));
    }

    static ArrayList<Integer>modifyList(ArrayList<Integer> num){
         num.removeIf(number -> !isPrime(number));

        num.replaceAll(n -> n * n);
       /* for (int i = 0; i < num.size() ; i++) {
            num.set(i, num.get(i)*num.get(i));
        }*/
         return num;
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
