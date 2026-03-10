//Binary tree part 2
import java.util.*;
import java.util.LinkedList;
import java.util.HashMap;
public class code20 {
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

    //Subtree of another Tree:
        /*Given the roots of two binary trees root and subRoot, 
        return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise
    */
    public static boolean isIdentical(Node root, Node subRoot){
        if(root == null && subRoot == null){
            return true;
        }else if(root == null || subRoot == null || root.data != subRoot.data){
            return false;
        }
        if(!isIdentical(root.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(root.right, subRoot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubTree(Node root, Node subRoot){
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    //top view of the tree [O(n)]: usinh map , horizonatal distancc by level oreder traversal
    static class info{
        Node node;
        int hd;    //horizonatal distance
        public info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root){
        Queue<info> q = new LinkedList<>();           //queue for level order traversing
        HashMap<Integer,Node> map = new HashMap<>();  //map : key value pair for storing horizontal distance with corresponding node
        int min = 0 , max = 0;                        //min and max horizontal distance
        q.add(new info(root, 0));
        q.add(null);
        while(!q.isEmpty()){
            info cur = q.remove();
            if(cur == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(cur.hd)){            //map.containsKey(key) return true if key exists, else returns false
                    map.put(cur.hd, cur.node);           //if hd doest not exists , then add the hd,node pair
                }
                if(cur.node.left != null){                      
                    q.add(new info(cur.node.left, cur.hd-1));      //adding the left node and hd to the queue
                    min = Math.min(min, cur.hd-1);                 //updaing the min hd
                }
                if(cur.node.right != null){
                    q.add(new info(cur.node.right, cur.hd+1));     //adding the right node and hd to the queue
                    max = Math.max(max, cur.hd+1);                 //updating the max hd
                }
            }
        }
        for(int i = min; i <= max; i++){            //printing top view of the tree
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }

    //lowest common ancestor [O(n)] : first common ancestor of two given Nodes from nodes.
    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundleft = getPath(root.left, n, path);
        boolean foundright = getPath(root.right, n, path);
        if(foundleft || foundright){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    } 
    public static Node lca(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, n1, path1);
        getPath(root, n2, path2);
        int i = 0;
        while(path1.get(i) == path2.get(i)){
            i++;
        }
        Node lca = path1.get(i-1);
        return lca;
    }

    //approach 2: Lowest common ancestor
    public static Node lca2(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);
        if(rightLca == null){
            return leftLca;
        }
        if(leftLca == null){
            return rightLca;
        }
        return root;
    }

    //minimum distance between two nodes [O(n)] : number of edges between two nodes
    public static int lcaDist(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftdist = lcaDist(root.left, n);
        int rightdist = lcaDist(root.right, n);
        if(leftdist == -1 && rightdist == -1){
            return -1;
        }else if(leftdist == -1){
            return rightdist+1;
        }else{
            return leftdist+1;
        }
    }
    public static int mindist(Node root, int n1, int n2){
        Node lca = lca(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);
        return dist1 + dist2;
    }

    //kth ancestor [O(n)]
    public static int kthAnces(Node root, int n, int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftdist = kthAnces(root.left, n, k);
        int rightdist = kthAnces(root.right, n, k);
        if(leftdist == -1 && rightdist == -1){
            return -1;
        }
        int max = Math.max(leftdist, rightdist);
        if(max+1 == k){
            System.out.println("Kth ancestor is "+root.data);
        }
        return max+1;
    }

    public static void main(String args[]){
        //creating tree
        /*
                1
               / \
              2   3
             / \ / \
            4  5 6  7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        //cretaing the sub tree
        /*
                2
               / \
              4   5 
        */
       Node subRoot = new Node(2);
       subRoot.left = new Node(4);
       subRoot.right = new Node(5);
       //checking for subtree
       System.out.println(isSubTree(root, subRoot));
       //top view of the tree
       topView(root);
       //lowest common ancestor : lcf(root, n1, n2)
       int n1 = 4, n2 = 7;
       System.out.println("Lowest common ancestor of "+n1+" and "+n2+" is "+lca(root, n1, n2).data);
       System.out.println("Lowest common ancestor of "+n1+" and "+n2+" is "+lca2(root, n1, n2).data);
       //minimum distance between two nodes 
       System.out.println("Minimum distance between "+n1+" and "+n2+" is "+mindist(root, n1, n2));
       //k the ancestor of the given node
       kthAnces(root, n1, 2);
    }
}
