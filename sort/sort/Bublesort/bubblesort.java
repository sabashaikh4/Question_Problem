package Question_Problem.sort.Bublesort;

public class bubblesort {
   // printing array 
  static void printingArray(int[] arr){
    int n = arr.length;
  
     for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
     }
     System.out.println();
  }

  static void bubblesorting(int[] arr){
      int n = arr.length;

      for (int i = 0; i < n-1; i++) {
        boolean flag = false;
        for (int j = 0; j < n-i-1; j++) {
            
    // last i element are already at correct sorted position
    // so no need to check them

            if (arr[j] > arr[j+1]) {
                //swap - a[j] , a[j+1]
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                flag = true;
            }
        }
      if ( flag == false) {
        // !flag
        return;
       }
     }
  }
  
  public static void main(String[] args) {
    int[] arr = {6,5,7,8,9,4,2,2,6};
     System.out.println("original array");
    printingArray(arr);

    System.out.println("sorted array");
    bubblesorting(arr);
    printingArray(arr);
  }




}
