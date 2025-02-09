//  import java.util.*;

//  public class MatrixAddition{ 
//   // printing method
//    static void printMatrix(int[][] matrix){
//     for(int i = 0; i< matrix.length; i++){
//       for(int j =0 ; j< matrix[i].length; j++){
//         System.out.print(matrix[i][j] + " ");
//       }
//       System.out.println();
//    }
//   }


//   // addition method 
//    static void addition(int[][] a , int r1, int c1 , int[][] b , int r2 , int c2){
//       if(r1 != r2 || c1 != c2)
//         System.out.print("wrong input:(");
//         return;
      
//       //int[][] sum = new int[r2][c2]; //  also r2 c2
        
//       for(int i = 0; i < r1; i++){
//         for(int j = 0; j<c1; j ++){
//           sum[i][j] = a[i][j] + b[i][j];
//         }
//       }
//       printMatrix(sum);
//    }
//       // main method 
//    public static void main(String[] agrs){
//      Scanner sc = new Scanner(System.in);
//      System.out.print("Enter row & coloum : ");
//      int r1 = sc.nextInt();
//       int c1 = sc.nextInt();
//       int[][] a = new int[r1][c1];
//        System.out.print("enter matrix value:");
//        for(int i = 0; i< r1; i++){
//         for(int j =0 ; j< c1 ; j++){
//             a[i][j] = sc.nextInt();
//         }
//       }
//             System.out.println("enter num of rows & columns 2nd matrix");
//             int r2 = sc.nextInt();
//             int c2 = sc.nextInt();
//             int[][] b = new int[r2][c2];
//             System.out.println("enter matrix value");
//             for(int i = 0; i< r2; i++){
//               for(int j =0 ; j< c2 ; j++){
//                   b[i][j] = sc.nextInt();
//               }
//             }
//              System.out.println("Matrix 1");
//              printMatrix(a);
//              System.out.println("Matrix 2");
//              printMatrix(b);    
//              addition(a, r1 , c1 , b , r2, c2); 
//    }
//   }
  