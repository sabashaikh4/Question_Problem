package Question_Problem.sort.Bublesort;

public class xyz {


    static void printingArray(int[] arr){
        int n = arr.length;
      
         for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
         }
         System.out.println();
      }

      


    static void sort(int[] a){
        int n = a.length;
        for (int i = n; i >0; i--) {
            for (int j = 0; j < i-1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j]= a[j+1];
                    a[j+1] = temp;
                    
                }
            }

            
        }

    }

    public static void main(String[] args) {
        int[] arr = {6,5,7,8,9,4,2,2,6};
         System.out.println("original array");
        printingArray(arr);
    
        System.out.println("sorted array");
        sort(arr);
        printingArray(arr);
      }
    
}
