/* ARRAYS :List of elements of same type placed in contiguous memory location
   Syntax: datatype arrayname[] = new datatype[size];
   where new is a keyword which gives the new plot to store the array elements.
   array.length : gives the length of the array
 */

// import java.util.*;
// public class code5 {
//     public static void main(String args[]){

//         //creation of array 
//         int marks[] = new int[100];
        
//         //input taking in array
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the marks of the studnet:");
//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();
        
//         //output in array
//         System.out.println("Physics :"+marks[0]);
//         System.out.println("Chemistry : "+marks[1]);
//         System.out.println("Maths : "+marks[2]);
//         System.out.println(marks[10]);
        
//         //Length of the array 
//         System.out.println("Length of the array :"+marks.length);          // array_name.length gives the length of the array


//     }
    
// }


// //arrays as function arguments         NOTE : Arrays are passed into the function by referencce not by value .Hence any changes on the array in the function reflects in the main function
// public class code5{
//     public static void update(int marks[]){
//         for(int i = 0 ;i < marks.length ;i++){
//             marks[i] += 1;
//         }
//     }
//     public static void main(String args[]){
//         int marks[] = {97, 98, 99};
//         update(marks);
//         for(int i = 0 ;i < marks.length ;i++){
//             System.out.println(marks[i]);
//         }
//     }
// }


// //Linear search
// public class code5{
//     public static int linearsearch(int numbers[], int key){
//         for(int i = 0; i < numbers.length; i++){
//             if(numbers[i] == key){
//                 return i;
//             }
//         }return -1;
//     }
//     public static void main(String args[]){
//         int numbers[] = {2, 4, 6, 8, 10, 12};
//         int key = 12;
//         int index = linearsearch(numbers,key);
//         if(index == -1){
//             System.out.println("Not found");
//         }else{
//             System.out.println("Found at index "+index);
//         }
//     }
// }

// //Largest elelment in an array
// public class code5{
//     public static int largest(int elements[]){
//         int largest = Integer.MIN_VALUE;                      // Integer.MIN_VALUES = - infinity  i.e smallest value in integer
//         for(int i = 0; i < elements.length; i++){
//             if( elements[i] > largest){
//                 largest = elements[i];
//             }
//         }return largest;
//     }
//     public static void main(String args[]){
//         int elements[] = {7, 9, 3, 5, 8, 11};
//         int largest = largest(elements);
//         System.out.println("Largest element in the array is "+largest);
//     }
// }

// //Smallest elelment in an array
// public class code5{
//     public static int smallest(int elements[]){
//         int smallest = Integer.MAX_VALUE;                     // Integer.MAX_VALUES = + infinity  i.e largest value in integer
//         for(int i = 0; i < elements.length; i++){
//             if( elements[i] < smallest){
//                 smallest = elements[i];
//             }
//         }return smallest;
//     }
//     public static void main(String args[]){
//         int elements[] = {7, 9, 3, 5, 8, 11};
//         int smallest = smallest(elements);
//         System.out.println("Smallest element in the array is "+smallest);
//     }
// }

// //binary search
// public class code5{
//   public static int binarysearch(int numbers[], int key){
//     int low = 0;
//     int high = numbers.length - 1;
//     int mid;
//     while(low <= high){
//       mid = (high + low) / 2;
//       if(numbers[mid] == key){
//         return mid;
//       }
//       if(numbers[mid] > key){
//         high = mid - 1;
//       }else{
//         low = mid + 1;
//       }
//     }return -1;
//   }
//   public static void main(String args[]){
//     int numbers[] = {2, 4, 6, 8, 10, 12, 14};
//     int key = 14;
//     int index = binarysearch(numbers,key);
//     if(index == -1){
//       System.out.println("Not found");
//     }else{
//       System.out.println("Found at index "+index);
//     }
//   }
// }

// //reversing an array
// public class code5{
//   public static void reverse(int numbers[]){
//     int first = 0;
//     int last = numbers.length - 1;
//     while(first < last){
//       int temp = numbers[first];
//       numbers[first] = numbers[last];
//       numbers[last] = temp;
//       first ++;
//       last --;
//     }
//   }
//   public static void main(String args[]){
//     int numbers[] = {2, 3, 4, 5, 6, 7};
//     reverse(numbers);
//     //printing the reversed array
//     for(int i = 0; i < numbers.length; i++){
//       System.out.print(numbers[i]+" ");
//     }
//     System.out.println();
//   }
// }

// //pairs in array
// public class code5{
//   public static void pair(int numbers[]){
//     for(int i = 0; i < numbers.length; i++){
//       for(int j = i+1; j < numbers.length; j++){
//         System.out.print("("+numbers[i]+","+numbers[j]+")");
//       }
//       System.out.println();
//     }
//   }
//   public static void main(String args[]){
//     int numbers[] = {2, 4, 6, 8, 10};
//     pair(numbers);
//   }
// }

// //subarrays : continuos part of array
// public class code5{
//   public static void subarray(int numbers[]){
//     int ts = 0;
//     for(int i = 0; i < numbers.length; i++){
//       for(int j = i; j < numbers.length; j++){
//         for(int k = i; k <= j; k++){
//           System.out.print(numbers[k]+" ");
//         }
//         ts ++;
//         System.out.println();
//       }
//       System.out.println();
//     }
//     System.out.println("Total number of sub arrays is "+ts);
//   }
//   public static void main(String args[]){
//     int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//     subarray(numbers);
//   }
// }

// //sum of sub arrays 
// public class code5{
//   public static void subarray(int numbers[]){
//     for(int i = 0; i < numbers.length; i++){
//       for(int j = i; j < numbers.length; j++){
//         int subsum = 0;
//         for(int k = i; k <= j; k++){
//           System.out.print(numbers[k]+" ");
//           subsum += numbers[k];
//         }
//         System.out.println();
//         System.out.println("The sum of the sub arrys is "+subsum);
//       }
//       System.out.println();
//     }
//   }
//   public static void main(String args[]){
//     int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//     subarray(numbers);
//   }
// }
