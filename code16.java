/* Stacks */

//Stack implementation using ArrayList
// import java.util.ArrayList;
// public class code16 {
//     static class Stack{
//         static ArrayList<Integer>list = new ArrayList<>();
//         //isEmpty 
//         public static boolean isEmpty(){
//             return list.size() == 0;
//         }
//         //push
//         public static void push(int value){
//             list.add(value);
//         }
//         //pop
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top = list.remove(list.size()-1);
//             list.remove(list.size()-1);
//             return top;
//         }
//         //peek
//         public static int peek(){
//             return list.get(list.size()-1);
//         }
//     }
//     public static void main(String args[]){
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         //display
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


// //Stack implementation using LinkedList
// public class code16{
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class Stack{
//         static Node head;
//         //isEmpty
//         public static boolean isEmpty(){
//             return head == null;
//         }
//         //push
//         public static void push(int data){
//             Node newNode = new Node(data);
//             if(isEmpty()){
//                 head = newNode;
//                 return;
//             }
//             newNode.next = head;
//             head = newNode;
//         }
//         //pop
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top = head.data;
//             head = head.next;
//             return top;
//         }
//         //peek
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return head.data;
//         }
//     }
//     public static void main(String args[]){
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         //display
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

// //using java collection frame work
// import java.util.*;
// public class code16{
//     public static void main(String args[]){
//         Stack<Integer>s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

/* Problems */
// //push an element at the bottom of the stack
// import java.util.*;
// public class code16{
//     public static void pushAtBottom(Stack<Integer>s, int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s,data);
//         s.push(top);
//     }
//     public static void main(String args[]){
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         pushAtBottom(s,4);
//         //to display the stack
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

// //reverse a string using stack
// import java.util.*;
// public class code16{
//     public static String reverse(String str){
//         Stack<Character> s = new Stack<>();
//         int idx = 0;
//         while(idx < str.length()){
//             s.push(str.charAt(idx));
//             idx++;
//         }
//         StringBuilder result = new StringBuilder();
//         while(!s.isEmpty()){
//             char cur = s.pop();
//             result.append(cur);
//         }
//         return result.toString();
//     }
//     public static void main(String args[]){
//         String str = "abcd";
//         String result = reverse(str);
//         System.out.println(result);
//     }
// }

// //reverse a stack
// import java.util.*;
// public class code16{
//     public static void pushAtBottom(Stack<Integer>s, int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s,data);
//         s.push(top);
//     }
//     public static void reverse(Stack<Integer>s){
//         if(s.isEmpty()){
//             return;
//         }
//         int top = s.pop();
//         reverse(s);
//         pushAtBottom(s,top);
//     }
//     //to print the stack
//     public static void display(Stack<Integer>s){
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
//     public static void main(String args[]){
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         reverse(s);
//         display(s);
//     }
// }

// //stock span problem
// import java.util.*;
// public class code16{
//     public static void stockSpan(int stocks[], int span[]){
//         Stack<Integer>s = new Stack<>();
//         span[0] = 1;  //span of first day is 1
//         s.push(0);    //pushing the index of previous high i.e for 1st day index = 0 
//         for(int i = 1; i < stocks.length; i++){
//             int cur_price = stocks[i];
//             while(!s.isEmpty() && cur_price >stocks[s.peek()]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 span[i] = i+1;
//             }else{
//                 int prev_high = s.peek();
//                 span[i] = i - prev_high;
//             }
//             s.push(i);
//         }                                                                                                                                                                                   
//     }
//     public static void main(String args[]){
//         int stocks[] = {100,80,60,70,60,85,100};
//         int span[]= new int[stocks.length];
//         stockSpan(stocks,span);
//         for(int i = 0; i < span.length; i++){
//             System.out.print(span[i]+" ");
//         }
//     }
// }

// //next greater element :  time complexity = O(n) : next gretaer element of current element in its right side , else -1
// import java.util.*;
// public class code16{
//     public static void nextGreater(int arr[], int nextgreater[]){
//         Stack<Integer> s = new Stack<>();
//         for(int i = arr.length - 1;i >= 0; i--){
//             while(!s.isEmpty() && arr[i] >= arr[s.peek()]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 nextgreater[i] = -1;
//             }else{
//                 nextgreater[i] = arr[s.peek()];
//             }
//             s.push(i);
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {6,8,3,4,1,0};
//         int nextgreater[] = new int[arr.length];
//         nextGreater(arr, nextgreater);
//         for(int i = 0; i < nextgreater.length; i++){
//             System.out.print(nextgreater[i]+" ");
//         }
//     }
// }

// //parentheses validation
// import java.util.*;
// public class code16{
//     public static boolean pValidation(String str){
//         Stack<Character> s = new Stack<>();
//         for(int i = 0; i < str.length(); i++){
//             char ch = str.charAt(i);
//             if( ch == '{' || ch == '[' || ch == '('){
//                 s.push(ch);
//             }else{
//                 if(s.isEmpty()){
//                     return false;
//                 }
//                 if((ch == '}' && s.peek() == '{') || (ch == ']' && s.peek() == '[') || (ch == ')' && s.peek() == '(')){
//                     s.pop();
//                 }else{
//                     return false;
//                 }
//             }
//         }
//         return s.isEmpty();
//     }
//     public static void main(String args[]){
//         String str = "{[([])]}";
//         if(pValidation(str)){
//             System.out.println("Balanced parentheses");
//         }else{
//             System.out.println("Parentheses not balanced");
//         }
//     }
// }

// //duplicate parentheses
// import java.util.*;
// public class code16{
//     public static boolean duplicates(String str){
//         Stack<Character> s = new Stack<>();
//         for(int i = 0 ; i < str.length(); i++){
//             char ch = str.charAt(i);
//             if(ch == ')'){
//                 int count = 0;
//                 while(s.peek() != '('){
//                     s.pop();
//                     count ++;
//                 }
//                 if(count < 1){
//                     return true; 
//                 }else{
//                     s.pop(); //remove the opening pair
//                 }
//             }else{
//                 s.push(ch);
//             }
//         }
//         return false; 
//     }
//     public static void main(String args[]){
//         String str = "((a+b))";
//         if(duplicates(str)){
//             System.out.println("Duplicates found");
//         }else{
//             System.out.println("No duplicates");
//         }
//     }
// }

// //maximum area of a rectangle in a histogram  : time complexity = O(n)
// import java.util.*;
// public class code16{
//     public static void maxArea(int arr[]){
//         int maxarea = 0;
//         int nsr[] = new int[arr.length];  //array to store the idx of next smaller right 
//         int nsl[] = new int[arr.length];  //array to store the idx of next smaller left
//         //next smaller right
//         Stack<Integer> s = new Stack<>();
//         for(int i = arr.length - 1; i >= 0; i--){
//             while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 nsr[i] = arr.length;  //if there is no smaller element then , idx = length of te array
//             }else{
//                 nsr[i] = s.peek();
//             }
//             s.push(i);
//         }
//         //next smaller left
//         s = new Stack<>();  
//         for(int i = 0; i < arr.length; i++){
//             while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 nsl[i] = -1;  //if there is no smaller element then , idx = -1
//             }else{
//                 nsl[i] = s.peek();
//             }
//             s.push(i);
//         }
//         //curr area = height * width : width = j-i-1 = nsr[j] - nsl[i] - 1
//         for(int i = 0; i < arr.length ; i++){
//             int height = arr[i];
//             int width  = nsr[i] - nsl[i] - 1;
//             int currarea = height * width;
//             maxarea = Math.max(currarea, maxarea);
//         }
//         System.out.println("The maximum area of rectangle in histogram is = "+maxarea);
//     }
//     public static void main(String args[]){
//         int arr[] = {2,4,5};   //array of heights
//         maxArea(arr);
//     }
// }