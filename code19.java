//Binary tress
/* is a hierarchical data structure
   each node at max have 2 childs
*/

//creating binary tree from pre order sequence
/*
            1
           / \
          2   3
         / \ / \
        4  5 6  7
*/
import java.util.*;
import java.util.LinkedList;
public class code19{
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    static class BinaryTree{
        //function to create the tree
        static int idx = -1;
        public Node buildTree(int nodes[]){
            idx++;
            if(idx >= nodes.length){
                return null;
            }
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;   
        }
        //function to print the tree : Preorder traversal [O(n)] :- print root -> print left tree -> print right tree
        public void preorder(Node root){
            if(root == null){
                // System.out.print("-1 ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        //function to print the tree : Inorder traversal [O(n)] :-print left tree -> print root ->  print right tree
        public void Inorder(Node root){
            if(root == null){
                // System.out.print("-1 ");
                return;
            }
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
        //function to print the tree : Postorder traversal [O(n)] :-print left tree -> print right tree -> print root
        public void Postorder(Node root){
            if(root == null){
                //System.out.print("-1");
                return;
            }
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data+" ");
        }
        //function to print the tree : level order traversal [O(n)] :- BFS (level by level)
        public void levelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node cur = q.remove();
                if(cur == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(cur.data+" ");
                    if(cur.left != null){
                        q.add(cur.left);
                    }
                    if(cur.right != null){
                        q.add(cur.right);
                    }
                }
            }
        }
        //height of the binary tree [O(n)]
        public int height(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh , rh) + 1;
        }
        //count of nodes [O(n)]
        public int count(Node root){
            if(root == null){
                return 0;
            }
            int lc = count(root.left);
            int rc = count(root.right);
            return lc + rc + 1;
        }
        //sum of nodes[O(n)]
        public int sum(Node root){
            if(root == null){
                return 0;
            }
            int ls = sum(root.left);
            int rs = sum(root.right);
            return ls + rs + root.data;
        }
    }
    public static void main(String args[]){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7};
        BinaryTree tree = new BinaryTree();
        //cretaing binary tree
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        //printing binary tree using preorder traversal
        tree.preorder(root);
        System.out.println();
        //printing binary tree using Inorder traversal
        tree.Inorder(root);
        System.out.println();
        //printing binary tree using Postorder traversal
        tree.Postorder(root);
        System.out.println();
        //printing binary tree using level order traversal
        tree.levelOrder(root);
        //height of the binary tree
        System.out.println("Height of the Binary tree is "+tree.height(root));
        //count of nodes of the binary tree
        System.out.println("Number of nodes in Binary tree is "+tree.count(root));
        //sum of nodes of the binary tree
        System.out.println("Sum of nodes in Binary tree is "+tree.sum(root));
    }
}
