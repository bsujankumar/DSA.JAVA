//Binary search tree 
/*
>>  left sub tree nodes < root
>>  right sub tree nodes > root
>>  left and right sub tree are also BST with no duplicates
>>  time complexity for searching : O(H) where H is the height of the BST , makes the search more efficient
>>  Inorder traversal of BST gives sorted sequence

*/
import java.util.ArrayList;
public class code21 {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //creating a BST
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.data){
            root.left = insert(root.left, val);
        }
        if(val > root.data){
            root.right = insert(root.right, val);
        }
        return root;
    }

    //Inorder travesal
    public static void InOrder(Node root){
        if(root == null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }

    //search in BST
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(key < root.data){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
    }

    //deleting a node in BST 
    /* if node has no child (leaf node) : return null to the root of the node
       if node has one child : connect the child to the root of the node
       if node has two child : replace the node with Inorder successor and delete node for inorder successor 
       Inorder successor -> left most node in the right subtree
                         -> always has 0 or 1 child(right) 
    */
    public static Node findInOrderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static Node delete(Node root, int val){
        if(val < root.data){
            root.left = delete(root.left, val);
        }
        else if(val > root.data){
            root.right = delete(root.right, val);
        }else{
            //leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            //single child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            //two child
            Node IS = findInOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    //print in ranage : print the nodes in BST that falls in the given range
    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data < k1){
            printInRange(root.left, k1, k2);
        }else{
            printInRange(root.right, k1, k2);
        }
    }

    //printing root to leaf path
    public static void printPath(ArrayList<Integer> path){
        for(int i = 0; i < path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("NULL");
    }
    public static void printRoot2LeafPath(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRoot2LeafPath(root.left, path);
        printRoot2LeafPath(root.right, path);
        path.remove(path.size()-1);
    }

    public static void main(String args[]){
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        //creating a BST
        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);             
        }
        //printing the BST by InOrder travesal
        InOrder(root);
        System.out.println();
        //seraching in BST
        System.out.println(search(root, 7));
        //deleting a node in BST
        root = delete(root, 8);
        InOrder(root);
        System.out.println();
        //printing in range
        printInRange(root, 5, 11);
        System.out.println();
        //root to leaf path
        printRoot2LeafPath(root, new ArrayList<>());
    }
}
