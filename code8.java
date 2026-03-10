/* 2D arrays */

// //2D matrix representation
// import java.util.*;
// public class code8{
//     public static void main(String args[]){
//         int matrix[][] = new int[3][4];
//         int n = 3, m = 4;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the array elements :");
//         for(int i = 0; i < n; i++ ){
//             for(int j = 0; j < m; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         for(int i = 0; i < n; i++ ){
//             for(int j = 0; j < m; j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// //search in 2D matrix
// import java.util.*;
// public class code8{
//     public static boolean search(int matrix[][], int key){
//         int n = 3, m = 4;
//         for(int i = 0; i < n; i++ ){
//             for(int j = 0; j < m; j++){
//                 if(matrix[i][j] == key){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         int matrix[][] = new int[3][4];
//         int n = 3, m = 4;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the array elements :");
//         for(int i = 0; i < n; i++ ){
//             for(int j = 0; j < m; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Enetr the key:");
//         int key = sc.nextInt();
//         boolean result = search(matrix,key);
//         if(result){
//             System.out.println("Element is found");
//         }else{
//             System.out.println("Element not found");
//         }
//     }
// }

// //Spiral Matrix 
// public class code8{
//     public static void spiralmatrix(int matrix[][]){
//         int sr = 0;
//         int sc = 0;
//         int er = matrix.length - 1;
//         int ec = matrix[0].length - 1;
//         while(sr <= er && sc <= ec){
//             //top
//             for(int j = sc; j <= ec; j++){
//                 System.out.print(matrix[sr][j]+" ");
//             }
//             //right
//             for(int i = sr+1; i <= er; i++){
//                 System.out.print(matrix[i][ec]+" ");
//             }
//             //bottom
//             for(int j = ec-1; j >= sc; j--){
//                 if(sr == er){
//                     break;
//                 }
//                 System.out.print(matrix[er][j]+" ");
//             }
//             //left
//             for(int i = er-1; i > sr; i--){
//                 if(sc == ec){
//                     break;
//                 }
//                 System.out.print(matrix[i][sc]+" ");
//             }
//             sr++;
//             sc++;
//             er--;
//             ec--;
//         }
//     }
//     public static void main(String args[]){
//         int matrix[][] = {{1,2,3,4}, {5,6,7,8}};
//         spiralmatrix(matrix);
//     }
// }

// //Sum of diagonal elements 
// public class code8{
//     public static int diagonalsum(int matrix[][]){
//         int diagonalsum = 0;
//         int n = matrix.length;
//         for(int i = 0 ; i < n; i++){
//             diagonalsum += matrix[i][i];             //primary diagonal
//             if(i != n-1-i){                          //not to add the superposed element 
//                 diagonalsum += matrix[i][n-1-i];     //secondary diagonal
//             }
//         }
//         return diagonalsum;
//     }
//     public static void main(String args[]){
//         int matrix[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
//         System.out.println("Sum of the diagonal elements is :"+diagonalsum(matrix));
//     }
// }

// //search in sorted matrix(row wise and column wise) also called as stare case search (time complexity = O(n+m))
// public class code8{
//     public static boolean search(int matrix[][], int key){
//         int row = 0 , column = matrix[0].length-1;
//         while(row < matrix.length && column >= 0){
//             if(matrix[row][column] == key){
//                 System.out.println("Found at position "+"("+ row + "," + column + ")");
//                 return true;
//             }
//             else if(key < matrix[row][column]){
//                 column--;
//             }else{
//                 row++;
//             }
//         }
//         System.out.println("Not found");
//         return false;
//     }

//     public static void main(String args[]){
//         int matrix[][] = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48},{32,33,39,50}};
//         int key = 33;
//         search(matrix,key);
//     }
// }

// //two sum target
// import java.util.*;
// public class code8{
//     public static boolean indices(int matrix[], int target){
//         for(int i = 0; i < matrix.length; i++){
//             for(int j = i+1; j < matrix.length; j++){
//                 if(matrix[i] + matrix[j] == target){
//                     System.out.println("["+i+","+j+"]");
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         int matrix[] = new int[5];
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the array elements one by one:");
//         for(int i = 0; i < matrix.length; i++){
//             matrix[i] = sc.nextInt();
//         }
//         System.out.println("Enetr the target:");
//         int target = sc.nextInt();
//         indices(matrix,target);
//     }
// }

// //Print the number of 7’s that are in the 2d array
// public class code8{
//     public static int occurance(int array[][], int key){
//         int occurance = 0;
//         for(int i = 0; i < array.length; i++){
//             for(int j = 0; j < array[0].length; j++){
//                 if(array[i][j] == key){
//                     occurance ++;
//                 }
//             }
//         }return occurance;
//     }
//     public static void main(String args[]){
//         int array[][] = {{1,7,8}, {4,9,7}, {9,5,7}};
//         int key = 7;
//         System.out.print(occurance(array,key));
//     }
// }

// //Print out the sum of the numbers in the second row of the “nums” array
// public class code8{
//     public static int sum(int nums[][]){
//         int sum = 0;
//         int i = 1;
//         for(int j = 0; j < nums[0].length; j++){
//             sum += nums[i][j];
//         }
//         return sum;
//     }
//     public static void main(String args[]){
//         int nums[][] = {{12,4,6}, {8,20,2}, {9,1,1}};
//         System.out.println(sum(nums));
//     }
// }

// //Transpose of the matrix
// public class code8{
//     public static void transpose(int matrix[][]){
//         int n = matrix.length;
//         int m = matrix[0].length;
//         int transpose[][] = new int[m][n];
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < m; j++){
//                 transpose[j][i] = matrix[i][j];
//             }
//         }
//         for(int i = 0; i < m; i++){
//             for(int j = 0; j < n; j++){
//                 System.out.print(transpose[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         int matrix[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
//         transpose(matrix);
//     }
// }

