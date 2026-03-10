/*Divide and conquer algorithum */

// //merge sort : Divide by mid -> sort (left and right parts) -> merge [here time complexity : O(nlogn) and space complexity : O(n)
// public class code13{
//     //to print the array after sorting
//     public static void print(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     //divides the array into small parts
//     public static void mergesort(int arr[], int si, int ei){
//         if(si >= ei){
//             return;
//         }
//         int mid = si + (ei - si) / 2;
//         mergesort(arr, si, mid);        //left part
//         mergesort(arr, mid+1, ei);      //right part
//         merge(arr, si, mid, ei);        
//     }
//     //sort and merges the left and right parts
//     public static void merge(int arr[], int si, int mid, int ei){
//         int temp[] = new int[ei-si+1];  //temporary array to store the sorted part array
//         int i = si;
//         int j = mid+1;
//         int k = 0;
//         while(i <= mid && j <= ei ){
//             if(arr[i] < arr[j]){
//                 temp[k] = arr[i];
//                 i++;
//             }
//             else{
//                 temp[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }
//         //left part leftout elements
//         while(i <= mid){
//             temp[k++] = arr[i++];
//         }
//         //right part leftoutelements
//         while(j <= ei){
//             temp[k++] = arr[j++];
//         }
//         //copy temp to arr
//         for(k = 0, i = si; k < temp.length; k++, i++){
//             arr[i] = temp[k];
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {5,3,2,9,7,8,6};
//         int si = 0;
//         int ei = arr.length-1;
//         mergesort(arr, si, ei);
//         print(arr);
//     }
// }


// //quick sort : pivot and partition (another form of divide and conquer) 
// /*
// where pivot element can be random , median , first , last . then part the arrys based on the pivot , 
// if it is less than pivot then it comes to left side of pivot
// if it is more than piot tthen it comes to right side of pivot
// while parting only the elements are sorted by swaping

// Time compexity = O(nlogn) on average but in some case it is worst with O(n**2)
// IMPORTANT : Worst case occurs when the pivot is always the largest or smallest element .
// for example in a asc sorted array pivot is always largest menaing fisrt time partiton is done n time then n-1 then n-2 till 1
// i.e equals to n(n+1)/2 = O(n**2) the worst case

// can be used whre there is no space
// */
// public class code13{
//     //to print the array after sorting
//     public static void print(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     //divides the array into small parts based on the pivot element(here last element)
//     public static void quicksort(int arr[], int si, int ei){
//         if(si >= ei){
//             return;
//         }
//         int pIdx = partition(arr, si, ei);
//         quicksort(arr, si, pIdx-1);
//         quicksort(arr, pIdx+1, ei);
//     }
//     //return the index of pivot element and sort the left part [less than pivot ele] and right part [greater than pivot ele] of array
//     public static int partition(int arr[], int si, int ei){
//         int pivot = arr[ei];   //last element as pivot
//         int i = si - 1; 
//         for(int j = si; j < ei; j++){
//             if(arr[j] <= pivot){
//                 i++;
//                 int temp = arr[j];  //swaping
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//             }      
//         }
//         i++;
//         int temp = pivot;
//         arr[ei] = arr[i];   //arr[ei] = pivot as this make te change in array by call  by ref
//         arr[i] = temp;
//         return i;
//     }
//     public static void main(String args[]){
//         int arr[] = {5,3,2,9,7,8,6};
//         int si = 0;
//         int ei = arr.length - 1;
//         quicksort(arr, si, ei);
//         print(arr);
//     }
// }


// //serch in sorted and rotated array : recursive binary search where time complexity : O(nlogn)
// public class code13{
//     public static int search(int arr[], int key, int si, int ei){
//         //base case
//         if(si > ei){
//             return -1;
//         }
//         int mid = si + (ei-si)/2;
//         //case found
//         if(arr[mid] == key){
//             return mid;
//         }
//         //mid on line 1
//         if(arr[mid] >= arr[si]){
//             //case a : left
//             if(key >= arr[si] && key <= arr[mid]){
//                 return search(arr, key, si, mid-1);
//             }
//             //case b : right
//             else{
//                 return search(arr, key, mid+1, ei);
//             }
//         }
//         //mid on line 2
//         else{
//             //case c : right
//             if(key >= arr[mid] && key <= arr[ei]){
//                 return search(arr, key, mid+1, ei);
//             }
//             //case d: left
//             else{
//                 return search(arr, key, si, mid-1);
//             }
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {4,5,6,7,0,1,2,3};
//         int key = 3;
//         int si = 0;
//         int ei = arr.length-1;
//         int index = search(arr, key, si, ei);
//         System.out.println(index);
//     }
// }


//