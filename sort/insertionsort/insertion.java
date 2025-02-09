package Question_Problem.sort.insertionsort;

public class insertion {
    static void printingArray(int[] arr){
        for(int element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    static void insertionsort(int[] a){
//        int n =  a.length;
//
//        for (int i = 1; i < n; i++) {
//            int j =i;
//
//            // insert a[j] into sorted left part 0..i-1
//
//            while (j >0 && a[j]<a[j-1]) {
//               int temp = a[j];
//               a[j] = a[j-1];
//               a[j-1] = temp;
//               j--;
//            }
//        }



        // also
        int temp;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j >0; j--) {

                if (a[j] < a[j-1]){
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
                else
                    break;

            }

        }
    }
    public static void main(String[] args) {
        int[] a = {8,5,43,2,1};
        insertionsort(a);
        printingArray(a);
    }
}
