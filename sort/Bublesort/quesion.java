package Question_Problem.sort.Bublesort;

public class quesion {
    static void  insertzero(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                
                if (arr[j] == 0 && arr[j+1] != 0 ){
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;

                } 
            }
        }
    }

    static void pritingArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {0,5,0,0,0,0};
        pritingArray(arr);

        System.out.println("after inserting ");
        insertzero(arr);
        pritingArray(arr);
    }
}
