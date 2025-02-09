package Question_Problem.sort.Quicksort;

public class Quicksort {
    static void printingArray(int[] arr){
        int n = arr.length;
      
         for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
         }
         System.out.println();
      }

      static void QuickSort(int[] arr , int low, int high){
//         if(low<high){
//            int pivot = arr[high];
//            int i= low-1,temp;
//            for (int j = i-low; j <= high-1; j++) {
//               if (arr[j] < pivot)
//               {
//                  ++i;
//                  temp=arr[i];
//                  arr[i]=arr[j];
//                  arr[j]=temp;
//
//               }
//
//            }
//
//            temp=arr[i+1];
//            arr[i+1] = arr[high];
//            arr[high]=temp;
//            QuickSort(arr,low,i);
//            QuickSort(arr,i+2,high);
//         }



      }
      public static void main(String[] args) {
         int i,j,n,low,high,pivot,temp;
         int[] arr= {78,65,87,9,0,34,67,70};
         low =0;
         high= arr[0];

         printingArray(arr);
         QuickSort(arr,low,high);

      }


}
