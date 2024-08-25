// package trees;
// //no restriction between any of the side 
// //if you defined node class outside the binary class then it will be asseible to all as global 

// import java.util.Scanner;

// public class binarytree {
//     class Node{
//         int value;
//         Node left;
//         Node right;
//         public Node(int input){
//             this.value=input;
//         }
//     }
//     private  Node root;
//     public Node making(int input){
//         System.out.println("enter the number for adding in tree");
            
//             if(root==null)
//                 root =new Node(input);
//             else
//                 addNode(root,input);
//             return root;
//     }

//     private void addNode(Node current, int input) {
//         // TODO Auto-generated method stub
//         // Scanner sc = new Scanner (System.in);
//         // input = sc.nextInt();
//         //asking to wanted to add  more nodes or not at left side of root node
//         System.out.println("wanted to add node at left of root node that is " + current.value +"true /false");
//         Scanner TF = new Scanner (System.in);
//         boolean  tf =TF.nextBoolean();
//         if(tf == true ) {
//           System.out.println("Enter the data for the Left Node: ");
//           Scanner sc =  new Scanner (System.in);
//           int data = sc.nextInt();
//         //   root2.left = new Node(input);
//        current.left = making(data);
          
//         }
//         else {
//            System.out.println("Enter the data for the Right Node : ");
//           Scanner scanner = new Scanner(System.in);
//           int  datanode = scanner.nextInt();
//           current.right = making(datanode);
//           System.out.println("Inserted succesfully ");
//         }
       

          
        

//     }

//     public static void main(String[] args) {
//         binarytree tree = new binarytree();
//         tree.making(10); // Example usage
//     }
// }

package trees;

import java.util.Scanner;

public class binarytree {
    class Node {
        int value;
        Node left;
        Node right;

        public Node(int input) {
            this.value = input;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    public Node making(int input) {
        System.out.println("Enter the number for adding to the tree: " + input);
        if (root == null) {
            root = new Node(input);
        } else {
            addNode(root, input);
        }
        return root;
    }

    private void addNode(Node current, int input) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to add a node at the left of " + current.value + " (true/false)?");
        
        boolean isLeft;
        try {
            isLeft = scanner.nextBoolean();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter true/false.");
            scanner.close();
            return;
        }

        if (isLeft) {
            if (current.left == null) {
                System.out.println("Enter data for the left node of " + current.value + ": ");
                int data = scanner.nextInt();
                current.left = new Node(data);
            } else {
                addNode(current.left, input);
            }
        } else {
            if (current.right == null) {
                System.out.println("Enter data for the right node of " + current.value + ": ");
                int data = scanner.nextInt();
                current.right = new Node(data);
            } else {
                addNode(current.right, input);
            }
        }

        scanner.close(); // Closing scanner after use
    }

    public void displayInOrder(Node node) {
        if (node != null) {
            displayInOrder(node.left);
            System.out.print(node.value + " ");
            displayInOrder(node.right);
        }
    }

    public static void main(String[] args) {
        binarytree tree = new binarytree();
        Node root = tree.making(10); // Example usage
        System.out.println("In-order traversal:");
        tree.displayInOrder(root);
    }
}
