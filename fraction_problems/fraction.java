package Question_Problem.fraction_problems;

public class fraction{

    public static  void TypesOfFraction(int numerator, int denominator ){

        if(numerator < denominator){
            System.out.println("Proper Fraction :\n " + numerator +"/"+denominator);
        } else {
            System.out.println("Improper Fraction :\n" + numerator +"/"+denominator);
        }
        double ans = (double) numerator / denominator;

        System.out.println(ans);

    }

    public static void main(String[] args) {
        TypesOfFraction(3,6);
    }
    
}
