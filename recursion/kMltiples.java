package Question_Problem.recursion;

public class kMltiples {
    static void kMltiples(int n , int k){
        // this is base case :- if k == 1 it means printing the given number 
        if (k == 1) {
            System.out.println(n);
            // break the statement 
            return;
        }
        // multiplying n * k-1
        kMltiples(n, k-1 );
       System.out.println(n*k);;

    }
    public static void main(String[] args) {
        kMltiples(5,4 );
    }
}
