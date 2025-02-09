package Question_Problem.Array;

import java.util.Scanner;


public class twopointer {

    // here we are printing array
    static void printingArray(int[] arr){
        int n = arr.length;
    for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

     // Here we are swaping array element
    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
     
    // sorintg zero and one
     static void sortzerosandone(int[] arr){
        int n = arr.length;
        int zeroes = 0;
        // count number of zeroes
        for (int i = 0; i < n; i++) {
             if (arr[i] == 0) {
                zeroes++;
             }
        }

       // 0 to zero-1 :0, zero to n-1: 1
       for (int i = 0; i < arr.length; i++) {
       if (i < zeroes) {
        arr[i] = 0 ;
       } else {
           arr[i] = 1;
        }
      }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input size 
        System.out.print("enter size of array :-");
        int n =sc.nextInt();

        // creating memory for array
        int[] arr = new int[n];
      
        // taking input element in array
        System.out.println("enter "+ n+ "element");
        // pintin with loop
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
         
        // printing original array
        System.out.println("original array:");
        printingArray(arr);
        
        // printing sorted array
        sortzerosandone(arr);
        System.out.println("sorted array : ");
        printingArray(arr);
    }
}
