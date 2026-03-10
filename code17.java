/* QUEUE */

// //Queue implementation using array
// public class code17 {
//     static class Queue{
//         static int arr[];
//         static int size;
//         static int rear;
//         Queue(int n){
//             arr = new int[n];
//             size = n;
//             rear = -1;
//         }
//         //isEmpty
//         public static boolean isEmpty(){
//             return rear == -1;
//         }
//         //Enqueue:O(1)
//         public static void Enqueue(int data){
//             if(rear == size -1){
//                 System.out.println("Queue is full");
//                 return;
//             }
//             rear ++;
//             arr[rear] = data;
//         }
//         //Dequeue :O(n)
//         public static int dequeue(){
//             if(isEmpty()){
//                 System.out.println("The Queue is empty");
//                 return -1;
//             }
//             int front = arr[0];
//             for(int i = 0; i < rear; i++){
//                 arr[i] = arr[i+1];
//             }
//             rear --;
//             return front;
//         }
//         //peek
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("The Queue is empty");
//                 return -1;
//             }
//             return arr[0];
//         }
//     }
//     public static void main(String args[]){
//         Queue q = new Queue(5);
//         Queue.Enqueue(1);
//         Queue.Enqueue(2);
//         Queue.Enqueue(3);
//         Queue.Enqueue(4);
//         while(!Queue.isEmpty()){
//             System.out.println(Queue.peek());
//             Queue.dequeue();
//         }
//     }
// }

// //circular queue implementation using array
// public class code17 {
//     static class Queue{
//         static int arr[];
//         static int size;
//         static int rear;
//         static int front;
//         Queue(int n){
//             arr = new int[n];
//             size = n;
//             rear = -1;
//             front = -1;
//         }
//         //isEmpty
//         public static boolean isEmpty(){
//             return front == -1 && rear == -1;
//         }
//         //isFull
//         public static boolean isFull(){
//             return (rear+1)%size == front;
//         }
//         //Enqueue:O(1)
//         public static void Enqueue(int data){
//             if(isFull()){
//                 System.out.println("Queue is full");
//                 return;
//             }
//             if(front == -1){
//                 front = 0;
//             }
//             rear = (rear + 1) % size;
//             arr[rear] = data;
//         }
//         //Dequeue :O(1)
//         public static int dequeue(){
//             if(isEmpty()){
//                 System.out.println("The Queue is empty");
//                 return -1;
//             }
//             int ele = arr[front];
//             if(front == rear){
//                 front = rear = -1; 
//             }else{
//                 front = (front + 1) % size;
//             }
//             return ele;
//         }
//         //peek
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("The Queue is empty");
//                 return -1;
//             }
//             return arr[front];
//         }
//     }
//     public static void main(String args[]){
//         Queue q = new Queue(3);
//         Queue.Enqueue(1);
//         Queue.Enqueue(2);
//         Queue.Enqueue(3);
//         Queue.dequeue();
//         Queue.Enqueue(4);
//         Queue.dequeue();
//         Queue.Enqueue(5);
//         while(!Queue.isEmpty()){
//             System.out.println(Queue.peek());
//             Queue.dequeue();
//         }
//     }
// }

// //LinkedList implementation of queue
// public class code17{
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class Queue{
//         static Node head = null;
//         static Node tail = null;
//         //isEmpty
//         public static boolean isEmpty(){
//             return head == null && tail == null;
//         }
//         //Enqueue
//         public static void Enqueue(int data){
//             Node newNode = new Node(data);
//             if(head == null){
//                 head = tail = newNode;
//                 return;
//             }
//             tail.next = newNode;
//             tail = newNode;
//         }
//         //dequeue
//         public static int dequeue(){
//             if(isEmpty()){
//                 System.out.println("The Queue is empty");
//                 return -1;
//             }
//             int front = head.data;
//             if(head == tail){
//                 head = tail = null;
//             }else{
//                 head = head.next;
//             }
//             return front;
//         }
//         //peek
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("The Queue is empty");
//                 return -1;
//             }
//             return head.data;
//         }
//     }
//     public static void main(String args[]){
//         Queue q = new Queue();
//         Queue.Enqueue(1);
//         Queue.Enqueue(2);
//         Queue.Enqueue(3);
//         Queue.Enqueue(4);
//         while(!Queue.isEmpty()){
//             System.out.println(Queue.peek());
//             Queue.dequeue();
//         }
//     }
// }

// //Queue implementation using java collection framework
// /*
// Syntax : Queue <data type> var_name = new LinkedList <>();
//          Queue <data type> var_name = new ArrayDeque <>();
// This is beacsue Queue is a interface in java ; We cannot make objects of interface ; 
// So we use class LinkedList or class ArrayDeque
// */
// import java.util.Queue;
// import java.util.LinkedList;
// public class code17{
//     public static void main(String args[]){
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

// //Queue using two stacks
// import java.util.*;
// public class code17{
//     static class Queue{
//         static Stack<Integer> s1 = new Stack<>();
//         static Stack<Integer> s2 = new Stack<>();
//         //isEmpty:O(1)
//         public static boolean isEmpty(){
//             return s1.isEmpty();
//         }
//         //add:O(n)
//         public static void add(int data){
//             while(!s1.isEmpty()){
//                 s2.push(s1.pop());
//             }
//             s1.push(data);
//             while(!s2.isEmpty()){
//                 s1.push(s2.pop());
//             }
//         }
//         //remove:O(1)
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }
//             return s1.pop();
//         }
//         //peek:O(1)
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }
//             return s1.peek();
//         }
//     }
//     public static void main(String args[]){
//         Queue q = new Queue();
//         Queue.add(1);
//         Queue.add(2);
//         Queue.add(3);
//         Queue.add(4);
//         while(!Queue.isEmpty()){
//             System.out.println(Queue.peek());
//             Queue.remove();
//         }
//     }
// }

// //stack using two Queue
// import java.util.Queue;
// import java.util.LinkedList;
// public class code17{
//     static class Stack{
//         static Queue<Integer> q1 = new LinkedList<>();
//         static Queue<Integer> q2 = new LinkedList<>();
//         //isEmpty:O(1)
//         public static boolean isEmpty(){
//             return q1.isEmpty() && q2.isEmpty();
//         }
//         //push:O(1)
//         public static void push(int data){
//             if(!q1.isEmpty()){
//                 q1.add(data);
//             }else{
//                 q2.add(data);
//             }
//         }
//         //pop:O(n)
//         public static int pop(){
//             if(isEmpty()){
//                 System.out.println("Stack is Empty");
//                 return -1;
//             }
//             int top = -1;
//             if(!q1.isEmpty()){
//                 while(!q1.isEmpty()){
//                     top = q1.remove();
//                     if(q1.isEmpty()){
//                         break;
//                     }
//                     q2.add(top);
//                 }
//             }else{
//                 while(!q2.isEmpty()){
//                     top = q2.remove();
//                     if(q2.isEmpty()){
//                         break;
//                     }
//                     q1.add(top);
//                 }
//             }
//             return top;
//         }
//         //peek:O(n)
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Stack is Empty");
//                 return -1;
//             }
//             int top = -1;
//             if(!q1.isEmpty()){
//                 while(!q1.isEmpty()){
//                     top = q1.remove();
//                     q2.add(top);
//                 }
//             }else{
//                 while(!q2.isEmpty()){
//                     top = q2.remove();
//                     q1.add(top);
//                 }
//             }
//             return top;
//         }
//     }
//     public static void main(String args[]){
//         Stack s = new Stack();
//         Stack.push(1);
//         Stack.push(2);
//         Stack.push(3);
//         while(!Stack.isEmpty()){
//             System.out.println(Stack.peek());
//             Stack.pop();
//         }
//     }
// }

// //first non repeating letter in a sequence of characters : O(n)
// import java.util.Queue;
// import java.util.LinkedList;
// public class code17{
//     public static void printNonRepeating(String str){
//         int freq[] = new int[26]; //frequency of a to z
//         Queue<Character> q = new LinkedList<>();
//         for(int i = 0; i < str.length(); i++){
//             char ch = str.charAt(i);
//             q.add(ch);        //adding the chracter to the queue
//             freq[ch - 'a']++; //increasing the frequency of the character by one each time
//             while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
//                 q.remove();   //removing the character from the queue if its frequency is greater than one
//             }
//             if(q.isEmpty()){
//                 System.out.print(-1+" ");        //if queue is empty , then there is no first non repeating element
//             }else{
//                 System.out.print(q.peek()+" ");  //else the first element in the queus is the first non repeating element
//             }
//         }
//     }
//     public static void main(String args[]){
//         String str = "aabccxb";
//         printNonRepeating(str);
//     }
// }

// //interleave two halfs of a queue (even sized queue) :O(n) : 123456 => 142536  
// import java.util.Queue;
// import java.util.LinkedList;
// public class code17{
//     public static void interLeave(Queue<Integer> q){
//         Queue<Integer> firstHalf = new LinkedList<>();  //new queue to store first half elements of queue
//         int size = q.size();
//         for(int i = 0; i < size/2; i ++){
//             firstHalf.add(q.remove());                 //adding first half elements to another queue of size size(queue)/2
//         }
//         while(!firstHalf.isEmpty()){
//             q.add(firstHalf.remove());      //adding the elements of firstHalf to q one at a time
//             q.add(q.remove());              //adding the elements of q to q itself after adding one element from firstHalf
//         }
//     }
//     public static void main(String args[]){
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);
//         q.add(8);
//         interLeave(q);
//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

// //reverse queue
// import java.util.Queue;
// import java.util.LinkedList;
// import java.util.Stack;
// public class code17{
//     public static void reverseQueue(Queue<Integer> q){
//         Stack<Integer> s = new Stack<>();
//         while(!q.isEmpty()){
//             s.push(q.remove());
//         }
//         while(!s.isEmpty()){
//             q.add(s.pop());
//         }
//     }
//     public static void main(String args[]){
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);
//         q.add(8);
//         reverseQueue(q);
//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

// //Double Ended queue : Deque
// import java.util.*;
// import java.util.LinkedList;
// public class code17{
//     public static void main(String args[]){
//         Deque<Integer> deque = new LinkedList<>();
//         deque.addLast(4);            //adding at the rear
//         deque.addLast(5);
//         deque.addLast(6);
//         System.out.println(deque);
//         deque.addFirst(3);          //adding at the front
//         deque.addFirst(2);
//         deque.addFirst(1);
//         System.out.println(deque);
//         System.out.println("First element is "+deque.getFirst());  //peek element from front side
//         System.out.println("Last element is "+deque.getLast());   //peek element from rear side
//         deque.removeFirst();        //removing an element at front
//         System.out.println(deque);
//         deque.removeLast();         //removing an element at last
//         System.out.println(deque);  
//     }
// }

// //stcak implementation using double ended queue 
// import java.util.*;
// import java.util.LinkedList;
// public class code17{
//     static class Stack{
//         Deque<Integer> deque = new LinkedList<>();
//         public void push(int data){
//             deque.addLast(data);
//         }
//         public int pop(){
//             return deque.removeLast();
//         }
//         public int peek(){
//             return deque.getLast();
//         }
//     }
//     public static void main(String args[]){
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         System.out.println("Peek = "+s.peek());
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//     }
// }

// //queue implementation using double ended queue 
// import java.util.*;
// import java.util.LinkedList;
// public class code17{
//     static class Queue{
//         Deque<Integer> deque = new LinkedList<>();
//         public void add(int data){
//             deque.addLast(data);
//         }
//         public int remove(){
//             return deque.removeFirst();
//         }
//         public int peek(){
//             return deque.getFirst();
//         }
//     }
//     public static void main(String args[]){
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         System.out.println("Peek = "+q.peek());
//         System.out.println(q.remove());
//         System.out.println(q.remove());
//         System.out.println(q.remove());
//     }
// }