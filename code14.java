/* ARRAY LIST */

/*
Properties :
>> Dynamic size
>> Primitive datatypes cannot be stored directly 
>> Linear and inbuilt

Syntax:
    import java.util.ArrayList
    ArrayList <data type> var_name = new ArrayList<>();   where data type = non primitive like Integer, String , Boolean

Adding elements to ArrayList:
    ArrayList_name.add(element);
    here time complexity = O(1)

Accessing the ArrayList elements through indeex:
    Arraylist_name.get(index);
    where time complexity = O(1)

Removing an element from ArrayList
    Arraylist_name.remove(index);
    where time complexity is O(n)

Set element at index 
    ArrayList_name.set(index,element);
    where time complexity = O(n)

Contains - to check if elemts exists or not
    ArrayList_name.contains(element);  if exists it return true else false

Size of ArrayList
    ArrayList_name.size();

Sorting in ArrayList:
    import java.util.Collections;
    //ascending
    Collections.sort(ArrayList_name);
    //descending
    Collections.sort(ArrayList_name, Collections.reverseOrder());

*/

// import java.util.ArrayList;
// import java.util.Collections;
// public class code14{
//     public static void main(String arga[]){
//         //creating an ArrayList
//         ArrayList<Integer>list = new ArrayList<>();

//         //adding elements to ArrayList
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(2,10);  //add(index,elements) : adds the element at that index and adjust the other elements

//         //printing ArrayList
//         System.out.println(list);

//         //accessing the ArrayList elements through indeex
//         int element = list.get(2);
//         System.out.println(element);

//         //removing an element
//         list.remove(2); //where 2 is index 
//         System.out.println(list);

//         //set element at index
//         list.set(1,10); //set(index,element)
//         System.out.println(list);

//         //Contain - to check if elemts exists or not
//         System.out.println(list.contains(1));
//         System.out.println(list.contains(100));

//         //Sixe of ArrayList
//         System.out.println(list.size());

//         //Sorting ArrayList - ascending
//         Collections.sort(list);
//         System.out.println(list);

//         //Sorting ArrayList - descending
//         Collections.sort(list, Collections.reverseOrder());
//         System.out.println(list);

//     }
// }


/*Problems */

// //reverse of an ArrayList
// import java.util.ArrayList;
// public class code14{
//     public static void main(String args[]){
//         ArrayList<Integer>list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         for(int i = list.size()-1; i >= 0; i--){
//             System.out.print(list.get(i)+" ");
//         }
//     }
// }

// // max in ArrayList
// import java.util.ArrayList;
// public class code14{
//     public static void main(String args[]){
//         ArrayList<Integer>list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(3);
//         list.add(6);
//         int max = Integer.MIN_VALUE;
//         for(int i = 0; i < list.size(); i++){
//             if(list.get(i) > max){
//                 max = list.get(i);
//             }
//         }
//         System.out.println("Maximum Array List elements is : "+max);
//     }
// }

// //swaping in ArrayList
// import java.util.ArrayList;
// public class code14{
//     public static void swap(ArrayList<Integer>list, int idx1, int idx2){
//         int temp = list.get(idx1);
//         list.set(idx1,list.get(idx2));  //places the element at idx2 to idx1
//         list.set(idx2,temp);            //places the element at idx1 to idx2
//     }
//     public static void main(String args[]){
//         ArrayList<Integer>list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(3);
//         list.add(6);
//         int idx1 = 1, idx2 = 3;
//         System.out.println("Before swap: "+list);
//         swap(list,idx1,idx2);
//         System.out.println("After swap: "+list);
//     }
// }


/* Multi Dimensional ArrayList */
/*
Syntax:
    ArrayList <ArrayList <datatype> > main_list = new ArrayList<>();
    ArrayList <datatype> list1 = new ArrayList<>();
    ArrayList <datatype> list2 = new ArrayList<>();
    mainlist.add(list1);
    mainlist.add(list2);
*/
// import java.util.ArrayList;
// public class code14{
//     public static void main(String args[]){
//         ArrayList<ArrayList<Integer>>mainlist = new ArrayList<>();  //creating multi dimensional ArrayList
        
//         ArrayList<Integer>list1 = new ArrayList<>();
//         list1.add(1);
//         list1.add(2);
//         mainlist.add(list1);

//         ArrayList<Integer>list2 = new ArrayList<>();
//         list2.add(3);
//         list2.add(4);
//         mainlist.add(list2);

//         System.out.println(mainlist);
//         //taversing multi dimensional Arraylist elements
//         for(int i = 0; i < mainlist.size(); i++){
//             ArrayList<Integer>currentlist = mainlist.get(i);
//             for(int j = 0; j < currentlist.size(); j++){
//                 System.out.print(currentlist.get(i)+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// //Conatiner with most water For a given n liness on x-axis , use two lines to form a container such that it holds the max water

// //Brute force : time complexity = O(n**2)
// import java.util.ArrayList;
// public class code14{
//     public static int maxwater(ArrayList<Integer>height){
//         int maxwater = 0;
//         for(int i = 0; i < height.size(); i++){
//             for(int j = i+1; j < height.size(); j++){
//                 int h = Math.min(height.get(i), height.get(j));
//                 int width = j - i;
//                 int curwater = h * width;
//                 maxwater = Math.max(maxwater, curwater);
//             }
//         }
//         return maxwater;
//     }
//     public static void main(String args[]){
//         ArrayList<Integer>height = new ArrayList<>();
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);
//         System.out.println("Max water = "+maxwater(height));
//     }
// }

// //optimised (two pointer approach): time complexity O(n)
// import java.util.ArrayList;
// public class code14{
//     public static int maxwater(ArrayList<Integer>height){
//         int maxwater = 0;
//         int lp = 0;                //left pointer at index 0
//         int rp = height.size()-1;  //right pointer at index n-1
//         while(lp < rp){
//             int h = Math.min(height.get(lp),height.get(rp));
//             int width = rp-lp;
//             int curwater = h * width;
//             maxwater = Math.max(maxwater,curwater);
//             if(height.get(lp) < height.get(rp)){
//                 lp++;
//             }else{
//                 rp --;
//             }
//         }
//         return maxwater;
//     }
//     public static void main(String args[]){
//         ArrayList<Integer>height = new ArrayList<>();
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);
//         System.out.println("Max water = "+maxwater(height));
//     }
// }

// // pair sum : find if any pair in a sorrted ArrayList has the target sum [optmised way :o(n):two pointer approach]
// import java.util.ArrayList;
// public class code14{
//     public static boolean pairsum(ArrayList<Integer>list, int target){
//         int lp = 0;                //left pointer at index 0
//         int rp = list.size()-1;   //right pointer at index n-1
//         while(lp != rp){
//             if(list.get(lp) + list.get(rp) == target){
//                 return true;
//             }
//             if(list.get(lp) + list.get(rp) < target){
//                 lp ++;
//             }else{
//                 rp--;
//             }
//         }
//         return false;    
//     }
//     public static void main(String args[]){
//         ArrayList<Integer>list= new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);
//         list.add(7);
//         list.add(8);
//         list.add(9);
//         int target = 13;
//         System.out.println(pairsum(list,target));
//     }
// }

// //pair sum 2: find if any pair in a sorrted and rotated ArrayList has the target sum [optmised way :o(n):two pointer approach]
// import java.util.ArrayList;
// public class code14{
//     public static boolean pairsum(ArrayList<Integer>list, int target){
//         int n = list.size();  
//         int bp =-1;
//         for(int i = 0; i < list.size(); i++){
//             if(list.get(i) > list.get(i+1)){//break point as in a sorted array i < i+1 ,if it is not true then that index is pivot point
//                 bp = i;
//                 break;
//             }
//         }
//         int lp = bp +1; //left pointer = smallest 
//         int rp = bp;    //right pointer = largest
//         while(lp != bp){
//             if(list.get(lp) + list.get(rp) == target){
//                 return true;
//             }
//             if(list.get(lp) + list.get(rp) < target){
//                 lp = (lp+1) % n; 
//             }else{
//                 rp = (n+rp-1) % n;
//             }
//         }
//         return false;    
//     }
//     public static void main(String args[]){
//         ArrayList<Integer>list= new ArrayList<>();
//         //11 15 6 8 9 10 - sorted and rotated ArrayList
//         list.add(11);
//         list.add(15);
//         list.add(6);
//         list.add(8);
//         list.add(9);
//         list.add(10);
//         int target = 16;
//         System.out.println(pairsum(list,target));
//     }
// }

