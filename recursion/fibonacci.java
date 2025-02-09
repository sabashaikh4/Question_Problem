package Question_Problem.recursion;

public class fibonacci {
    static int fibonacci(int n){
    
     // base case
     if (n == 0 || n== 1) {
        return n;
     }
     int current = fibonacci(n-1) + fibonacci(n - 2);

      return current;
    }
public static void main(String[] args) {
    //System.out.println(fibonacci(6));

    // printing 1 to 10 
    for (int i = 0; i <= 10; i++) {
        System.out.println(fibonacci(i));

    }
}

}
