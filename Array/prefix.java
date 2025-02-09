package Question_Problem.Array;

import java.util.Scanner;

public class prefix {

    static int[] PrefixSum(int[] arr){
         int n = arr.length;
         int[] ans = new int[n];
         ans[0] = arr[0];

        for (int i =1 ; i < n; i++) {
            ans[i] = ans[i-1] + arr[i];
        }
        return ans;
    }

    static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Input Array");
        printArray(arr);

        int[] pref = PrefixSum(arr);
        printArray(pref);
    }
}
