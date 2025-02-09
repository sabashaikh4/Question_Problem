package Question_Problem.ArrayList;

import java.util.ArrayList;

public class Prime {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(13);
        list.add(18);
        list.add(21);
        System.out.println("Original Number: "+ list);
        System.out.println("Modify List: "+ checkNum(list));

    }

    static ArrayList<Integer> checkNum(ArrayList<Integer> n){
        n.removeIf(primeNumbers::isPrime);
        return n;
    }


    static boolean isPrime(int num){
        if(num <= 1) {
            return false;}
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}
