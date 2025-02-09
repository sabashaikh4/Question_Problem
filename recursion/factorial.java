package Question_Problem.recursion;

public class factorial {
    static int factorial(int n){
    // base case
    if(n == 0) return 1 ;
    // small problem
   return n *factorial(n-1);
}

public static void main(String[] args) {
    System.out.println(factorial(4));
}

   


}
