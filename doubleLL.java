//Doubly Linked List : a node contains data , next node address and previous node adddress
public class doubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    static Node head;
    static Node tail;
    static int size;

    //addFisrt
    public void addFirst(int data){
        Node newNode = new Node(data);
        size ++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        size ++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    //display
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //remove first
    public int removeFirst(){
        if(head == null){     //empty DLL
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){        //single node
            int value = head.data;
            head = tail = null;
            size--;
            return value;
        }
        int value = head.data;
        head = head.next;
        head.prev = null;
        size --;
        return value;
    }

    //remove Last
    public int removeLast(){
        if(head == null){ 
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int value = head.data;
            head = tail = null;
            size --;
            return value;
        }
        int value = tail.data;
        tail = tail.prev;
        tail.next = null;
        size --;
        return value;
    }

    //rever DLL
    public void reverse(){
        Node cur = head;
        Node prev = null;
        Node next;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            cur.prev = next;
            prev = cur;
            cur = next;
        }
        head = prev;
    }

    public static void main(String args[]){
        doubleLL dll = new doubleLL();
        dll.addFirst(6);    //calling addFirst
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.addLast(7);    //calling addLast
        dll.addLast(8);
        dll.addLast(9);
        dll.addLast(10);

        dll.display();      //calling display
        System.out.println("Size of DLL :"+size);

        dll.removeFirst();  //calling remove first
        dll.display(); 
        System.out.println("Size of DLL :"+size);
         
        dll.removeLast();   //calling remove last
        dll.display();
        System.out.println("Size of DLL :"+size);

        dll.reverse();     //calling reverse DLL
        dll.display();

    }
}
