package Question_Problem.recursion;

public class sum {
    static int sumOfDigits(int d){
        //base case
      if (d >= 0 && d<= 9) return d;
    // recursive work
    //int smallAns = sumOfDigits(d/10);
    // self work
    //return smallAns + d%10;
     return sumOfDigits(d/10)+ d%10;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
    
 }
}
