// package trees;

// import java.util.Scanner;

// public class binarysearchtree {
//     class Node{
//         int  data;
//         Node right;
//         Node left;
//         public Node(int d) {data = d;}
        
    
//     }
//     Node head;
//     //intialiseing node 
//     public void  init(Node n,int d){
//         n.data=d;
//         n.left=null;
//         n.right=null;
//         if (n ==null) {
//             head = new Node(d);
            
//         } else {
//            insert(head , d);
            
//         }
       
//     }

//    public void insert(Node n , int value){
//     System.out.println("enter the number that you wanted for further binary tree");
//     Scanner sc = new Scanner(System.in);
//      value = sc.nextInt();
//     if (n == null) {
//         n = new Node(value); 
//         return ;
//     }
//     else {
//       if (value < n.data ){
//         insert(n.left , value);
//     }
//       else{
//         insert(n.right, value);
//     }

//     }


//    }

//     public static void main(String[] args) {
        
//     }
// }

package trees;

import java.util.Scanner;

public class binarysearchtree {
    class Node {
        int data;
        Node right;
        Node left;

        public Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

    Node head;

    public void init(Node n ,int d) {
        if (head == null) {
            head = new Node(d);
            init(head , d);

        } else {
            insert(head, d);
        }
    }

    public void insert(Node n, int value) {
        if (value < n.data) {
            if (n.left == null) {
                n.left = new Node(value);
            } else {
                insert(n.left, value);
            }
        } else {
            if (n.right == null) {
                n.right = new Node(value);
            } else {
                insert(n.right, value);
            }
        }
    }

    public static void main(String[] args) {
        binarysearchtree tree = new binarysearchtree();
        // Initialize a new node
        Node root = tree.new Node(5);
        tree.head = root; // Set root as the head of the tree
        // Insert more nodes
        tree.insert(root, 3);
        tree.insert(root, 8);
        tree.insert(root, 1);
        tree.insert(root, 4);
        tree.insert(root, 7);
        tree.insert(root, 9);

        // Example: Printing the data of the root, left child, and right child nodes
        System.out.println("Root: " + root.data);
        System.out.println("Left Child: " + root.left.data);
        System.out.println("Right Child: " + root.right.data);
    }
}
