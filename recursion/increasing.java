package Question_Problem.recursion;
import java.util.*;
public class increasing {
    
   static void printincreasing(int n){
     
    if (n == 1) {
        System.out.println(1);
        return;
    }

   printincreasing(n-1);
   System.out.println(n);
   }



   static void printdecreasing(int n){
     // basee case
    if (n == 1) {
        System.out.println(n);
        return;
    }
   // recursive work
   System.out.println(n);
   // self work
   printdecreasing(n-1);
   }
   
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.err.println(" enter n number :");
   int n = sc.nextInt();
      
    printdecreasing(n);
}

}
 