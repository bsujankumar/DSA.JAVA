/* Linked list */
/*
In Linked list each node is connected 
A node has two parts
In one part it stores the data and in another part it stores the reference of next node
The starting node is called head and the ending node before null is tail node
*/



public class LinkedList{
    public static class Node{ //creating a static Node class
        int data;
        Node next;

        public Node(int data){ //mannually calling constructor
            this.data = data;
            this.next = null;  //single node
        }
    }
    public static Node head;  //static variabless
    public static Node tail;
    public static int size; 

    //add first [O(1):constant time complexity]
    public void addFirst(int data){
        //create new node
        Node newNode = new Node(data);   //creating an object(new node) of class node
        size++;                          //updating the size of linked list
        if(head == null){                //empty linked list meaning both head and tail are same node

            head = tail = newNode;
            return;
        }
        //newNode next = head
        newNode.next = head;
        //head = newNode
        head = newNode;
    }

    //add last : [O(1):constant time complexity]
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;                          //updating the size of linked list
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    //add middle :[O(n): Linear time complexity]
    public void addMiddle(int idx, int data){
        if(idx == 0){          //if adding at head
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;                          //updating the size of linked list
        Node temp = head;
        int i = 0;
        while(i < idx -1){ //finding the previous node
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next; //storing the next of temp in newNode
        temp.next = newNode;      //storing the next of newNode in temp
    }

    //display : [o(n) : linear time complexity]
    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //remove first
    public int removeFirst(){
        if(size == 0){  //if Linked List is empty
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size ==1){ //single node whre heaad = tail
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size --;
        return val;
    }

    //remove last
    public int removeLast(){
        if(size == 0){  //if Linked List is empty
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size ==1){ //single node whre heaad = tail
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;  //previous node of tail
        for(int i = 0; i < size - 2; i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        size --;
        return val;
    }

    //iterative search
    public int itrsearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    //recursive serach : [O(n):Linear time complexity]
    public int recsearch(int key){
        return helper(head,key);
    }
    public int helper(Node head, int key){ //helper function to pass head along with key
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;  //as index of head is 0
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;   //recursive head index + 1
    }

    //reversing the linked list : [O(n): linear time complexity]
    public void reverse(){
        Node prev = null;
        Node cur = head;
        Node next;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;      //as cur becomes null , prev node becomes head
    }

    //delete nth node from end
    public void deleteNthfronEnd(int n){
        //finding the size
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size ++;
        }
        //if nth node is head
        if(n == size){    //as from the end index of head = size
            head = head.next;
            return;
        }
        //other case
        int i = 1;
        int iTofind = size - n; //previous node of nth node
        Node prev = head;
        while(i < iTofind){    //to find the previous node 
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;  //directly connecting prev node with next node of nth node that results in deletion of nth node
        return;
    }

    //finding the middle node : Slow - fast approach 
    /* slow and fast points head ---> slow increases by 1 and fast increses by 2
    for even number of nodes , mid = slow when fast = null
    for odd number of nodes ,  mid = slow when fast.nest = null
    */
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;      //+1
            fast = fast.next.next; //+2
        }
        return slow; //slow = mid
    }

    //check if a linked list is a palindrome
    public boolean ispalin(){
        //step 1 : find the mid node
        Node midnode = findMid(head);  //calling findmid function to obtain middle node
        //step 2 : reversing the linked list after middle node
        Node prev = null;
        Node cur = midnode;
        Node next;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        Node right = prev; //right LL head
        Node left = head;  //left LL head
        //step 3: compare left and right
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    
    public static void main(String[] args){
        LinkedList l1 = new LinkedList();  //creating an object of class LinkedList
        
        l1.display();                      //calling display function
        l1.addFirst(2);                    //calling addFisrt
        l1.display();
        l1.addFirst(1);
        l1.display();  
        l1.addLast(3);                     //calling addLast
        l1.display();  
        l1.addLast(4);
        l1.display();  
        l1.addMiddle(5,9);                 //calling addMiddle
        l1.display();
        System.out.println(LinkedList.size);   //size of the linked list (accesssing through class name as size is a static variable)
        l1.removeFirst();                      //calling removeFisrt
        l1.display();
        l1.removeLast();                         //calling removeLast
        l1.display();

        System.out.println(l1.itrsearch(2));     //calling iterative search
        System.out.println(l1.itrsearch(10));

        System.out.println(l1.recsearch(2));     //calling recursive search
        System.out.println(l1.recsearch(10));

        l1.addFirst(1);
        l1.addLast(4);
        l1.display();   //1-->2-->9-->3-->null

        // l1.reverse();   //calling reverse
        // l1.display();   //3-->9-->2-->1-->null

        l1.deleteNthfronEnd(3);   //calling delete nth node from end 
        l1.display();

        System.out.println(l1.ispalin());  //calling isplain()
    }
}
