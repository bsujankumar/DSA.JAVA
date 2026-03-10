//Linked list using java collection frame work

import java.util.LinkedList;
public class code15 {
    public static void main(String args[]){
        //creating a Linked list
        LinkedList<Integer>l1 = new LinkedList<>();
        
        //add
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addFirst(0);
        System.out.println(l1);

        //remove
        l1.removeLast();
        l1.removeFirst();
        System.out.println(l1);
    }
}
