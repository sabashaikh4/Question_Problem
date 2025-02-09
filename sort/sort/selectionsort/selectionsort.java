package Question_Problem.sort.selectionsort;

public class selectionsort {
    static void selectionSort(int[] arr){
        // for doing n-1 passes
        int n = arr.length;
        for (int i = 0; i <n-1; i++) { // i is presenting current index
            
            // find the minimum element in unsorted part of array
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            // swap current element and minimum element -> cuuent index i will have correct 
            // a[min_index] , a[i]

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }
    }
public static void main(String[] args) {
    int[] arr = {6,5,7,8,3,49,8};
    selectionSort(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}
}
