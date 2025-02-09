package Question_Problem.sort.MergeSort;

public class mergeSort {
    static void conquer(int arr[] , int si, int mid, int ei){
    int merged[]= new int [ei - si +1];
   
     int idx1 = si; // 1 array{3,6,9,}trsking
     int idx2 = mid+1; // 2 array{2,5,8} traking
     int x = 0 ; // merged array traking 
    // comparing dono array
     while (idx1 <= mid && idx2 <= ei) {
        if(arr[idx1] <= arr[idx2]){
            merged[x++] = arr[idx1++];
          // x++; idx1++
        }
        else{// in case idx2 is greater
            merged[x++] = arr[idx2++];
        }
        }
        // agr kuch element rh gye hai to
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];   
        }
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];   
        }
// coping in original array
        for (int i = 0, j =si ; i < merged.length; i++ , j++) {
            arr[j] = merged[i];
        }
     }
    static void divide(int[] arr, int si, int ei){
       if(si >= ei){
        return;
       }
        int mid = si +(ei - si)/2;
        divide(arr, si, mid); // 6,3,9
        divide(arr, mid+1, ei);//5,2,8

        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;

        divide(arr, 0, n-1);
        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }
        // System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); 
        }
         System.out.println();
    }
}
