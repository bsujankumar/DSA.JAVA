/* BASIC SORTING ALGORITHUM */

/* 1.Bubble sort
   2.Selection sort
   3.InseRtion sort
   4.Counting sort (advanced)  
*/


// // 1. Bubble sort : Large element comes to the end of the array by swaping with adjucent element

// //with time complexity equals to O(n**2);
// public class code7{
//     public static void bubblesort(int arr[]){
//         for(int turn = 0; turn < arr.length -1; turn ++){           
//             for(int j = 0; j < arr.length - 1 - turn; j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }
//     //function to print the sorted array
//     public static void print(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {5, 4, 2, 3,1};
//         bubblesort(arr);
//         print(arr);
//     }
// }

// //optimised boubble sorting if the input array is already sorted ( it is a linear case with time complexity of O(n) )
// public class code7{
//     public static void bubblesort(int arr[]){
//         for(int turn = 0; turn < arr.length -1; turn ++){ 
//             int swap = 0;          
//             for(int j = 0; j < arr.length - 1 - turn; j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     swap ++;
//                 }
//             }
//             if(swap == 0){
//                 break;          //breaking the loop if there is no swaping in the 0 th turn meaning the array is already sorted
//             }
//         }
//     }
//     //function to print the sorted array
//     public static void print(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {1, 2, 3, 4};
//         bubblesort(arr);
//         print(arr);
//     }
// }

// // 2. Selection sort : Pick the the smallest frrom the unsorted array and put it at the begining
// public class code7{
//     public static void selectionsort(int arr[]){
//         for(int i = 0; i < arr.length - 1; i++){
//             int minpos = i;
//             for(int j = i+1; j < arr.length; j++){
//                 if(arr[j] < arr[minpos]){
//                     minpos = j;
//                 }
//             }
//             int temp = arr[minpos];
//             arr[minpos] = arr[i];
//             arr[i] = temp;
//         }
//     }
//     public static void print(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {5, 4, 3, 2, 1};
//         selectionsort(arr);
//         print(arr);
//     }
// }

// // 3. insertion sort : Pick an element from unsoerted array and place it in right pos in sorted part
// public class code7{
//     public static void insertionsort(int arr[]){
//         for(int i = 1; i < arr.length; i++){
//             int cur = arr[i];
//             int prev = i-1;
//             while(prev >= 0 && arr[prev] > cur){
//                 arr[prev+1] = arr[prev];
//                 prev --;
//             }
//             arr[prev+1] = cur;
//         }
//     }
//     public static void print(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     } 
//     public static void main(String args[]){
//         int arr[] = {5, 4, 1, 2, 3};
//         insertionsort(arr);
//         print(arr);
//     }
// }

// // 4. Counting sort :used when range is small ; find the range , then find the fequency and then sort
// public class code7{
//     public static void countingsort(int arr[]){
//         //finding the range
//         int largest = Integer.MIN_VALUE;
//         for(int i = 0; i < arr.length; i++){
//             largest = Math.max(largest,arr[i]);
//         }
//         //storing the frequency in an array
//         int count[] = new int[largest+1];
//         for(int i = 0; i < arr.length; i++){
//             count[arr[i]]++;
//         }
//         //sorting 
//         int j = 0;
//         for(int i = 0; i < count.length; i++){
//             while(count[i] > 0){
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }
//     public static void print(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = { 7, 6, 5, 1, 6, 1, 2};
//         countingsort(arr);
//         print(arr);
//     }
// }


// /* Built in functions for sorting : 
//   import java.util.*; or java.util.Arryas; then using the builtin functions
//   1. Arrays.sort(array name)
//   2. Arrys.sort(array name, starting index , ending index(exclusive) ) 
  
//   for sorting in reverse order : import java.util.Collections; (Note: it works the objects , it will not works on prinitive data type)
//   1. Arrays.sort(array name , Collections.reverseOrder())
//   2. Arrays.sort(arry name , starting index , ending index(exclusive) , Collections.reverseOrder() )
// */

// //sorting useing Arrays.sort(array name)
// import java.util.Arrays;
// public class code7{
//     public static void print(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = { 5, 3, 4, 1, 2, 8, 6, 7};
//         Arrays.sort(arr);
//         print(arr);
//     }
// }

// //reverse sorting using Arrays,sort(array name,reverseOrder) using collection pack
// import java.util.Arrays;
// import java.util.Collections;
// public class code7{
//     public static void print(Integer arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         Integer arr[] = { 5, 3, 4, 1, 2, 8, 6, 7};          //creating  object variables for Collection.reverseeOrder()
//         Arrays.sort(arr,Collections.reverseOrder());
//         print(arr);
//     }
// }








