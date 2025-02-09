package Question_Problem.sort.sort.Bublesort;

public class bubble {

    public static void main(String[] args) {
        int[] arr = {9,6,4,3,7,8,2,1};
        insertion(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    static void sort(int[] arr){
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int swap = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
    }

    static void selection(int[] arr){
        int size = arr.length;

        for (int i = 0; i < size-1; i++) {
            int smallest = i;

            for (int j = i+1; j < size; j++) {
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    static void insertion (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].

            while (j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            // Place key at after the element just smaller than it.
            arr[j+1] = current;
        }
    }
}
