//Linked list part 2
public class linkedList2 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
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

    //checking for cycle in linked list :Floyds cycle finding algorithum
    public boolean iscycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;      //+1
            fast = fast.next.next; //+2
            if(slow == fast){      //if slow = fast then LL is a cycle
                return true;       //cycle exists
            }
        }
        return false;             //cycle doesn't exists
    }

    //removing a cycle from linked list
    public void removecycle(){
        //check for cycle
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;  //cycle exists
                break;
            }
        }
        if(flag == false){
            return;
        }
        //find meeting point
        slow = head;
        Node prev = null; //last node
        while(slow != fast){
            prev = fast;
            slow = slow.next; //+1
            fast = fast.next; //+1
        }
        prev.next = null;  //coonect the last node before meeting to null
    }

    //merge sort
    public Node mergesort(Node head){
        //empty or single node
        if(head == null || head.next == null){
            return head;
        }
        //get mid
        Node mid = getmid(head);
        //left and right part
        Node righthead = mid.next;
        mid.next = null;
        Node newleft = mergesort(head);
        Node newright = mergesort(righthead);
        return merge(newleft,newright);
    }
    private Node getmid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            while(head1 != null){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while(head2 != null){
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        return mergedLL.next;
    }

    //Zig zag merge
    public void zigzag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast=fast.next.next;
        }
        Node mid = slow;
        //reverse the 2nd half
        Node prev = null;
        Node cur = mid.next;
        mid.next = null;
        Node next;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        //zig-zag merge
        Node left = head;
        Node right = prev;
        Node nextL , nextR;
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            //updation
            left = nextL;
            right = nextR;
        }
    }

    public static void main(String args[]){
        linkedList2 l1 = new linkedList2();
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // //1-->2-->3-->2
        // System.out.println(l1.iscycle());   //calling iscycle function
    
        // l1.removecycle();                   //calling remove cycle
        // l1.display();

        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(3);
        l1.addLast(5);
        l1.addLast(4);
        l1.addLast(6);
        l1.display();        

        l1.mergesort(head);   //calling merge sort function
        l1.display();        

    //     l1.zigzag();         //calling zig zag merge
    //     l1.display();        
    }
}
