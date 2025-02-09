package Question_Problem.recursion;

public class ChatGptQue {

    public static void main(String[] args) {
        int[] arr = {3, 5, 1,9, 2}; // Example input
        int result = findMin(arr, 0);
        System.out.println("Minimum value in the array is: " + result);
    }

    // Sum of First N Natural Numbers
    static int SumNnumbers(int n){
        if (n == 0){
            return n;
        }
        return n  +  SumNnumbers(n-1);
    }


       // Recursive function to find the minimum in an array
       public static int findMin(int[] arr, int index) {
           // Base case: If there's only one element, return it
           if (index == arr.length - 1) {
               return arr[index];
           }
           // Recursive case: Compare current element with the minimum of the rest of the array
           int minOfRest = findMin(arr, index + 1);
           return Math.min(arr[index], minOfRest);
       }
}
