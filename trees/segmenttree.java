// package trees;

// import java.util.Scanner;

// public class segmenttree {
//     public class Node{
//         int value;
//         Node left;
//         Node right;
        
//         int height;
//         int[] next;

//         public Node(int value) {
//             this.value = value;
            
//         }

       


//     }
   
//     static Node root;
//     //making methods for segment  tree 
//     public void  buildTree(Node node , int[] arr, int start,int end,int value) {
//         if (start == end) {
//             root = new Node(arr[start]);
//             return ;
//         }
          
//        int mid = (start + end)/2;
//         //taking input for left side of the tree
//         System.out.println("Enter true of false for left side insertion ");
//         Scanner tf = new Scanner(System.in);
//         boolean respo= tf.nextBoolean();
//         System.out.println("Enter the data wanted to  be inserted");
//         Scanner sc = new Scanner(System.in);
//         value= sc.nextInt();
//         if (respo) {
//             node.left = new Node(value);
//             node.next[0] =start; // Assuming this assignment is meaningful
//             node.next[1]=end;
//             buildTree(node.left, arr, start, mid, value);
//         } else {
//             System.out.println("You don't have a choice, must insert data on the right side");
//             node.right = new Node(value);
//             node.next[0] =start; // Assuming this assignment is meaningful
//             node.next[1]=end;
        
//             buildTree(node.right, arr, mid + 1, end ,value);
//         }
    
       
  
//         // Assuming node.next is an array of arrays (two-dimensional array)



        
        
      
    

   



// }
// public void display(Node node){
// 	if(node == null){
//     return;
//     }
// 	display(node.left);
// 	System.out.print(node.value+" ");
// 	display(node.right);

// }



// public static void main(String[] args) {
//     System.out.println("Enter number of elements(size):");
//     Scanner sc =new Scanner(System.in);
//     int size =sc.nextInt();


    
//     // int array[]=new int[size];
//     int array[]={1,3,5,7,9,11};
//     segmenttree st = new segmenttree();
//     st.buildTree(root , array ,0 ,size - 1 , 36);
   
    
    
// }

// }
   
package trees;

import java.util.Scanner;

public class segmenttree {
    public class Node {
        int value;
        Node left;
        Node right;
        int height;
        int[] next; // Changed to 1D array

        public Node(int value) {
            this.value = value;
            this.next = new int[2]; // Initialize next as a 1D array with size 2
        }
    }

    static Node root;

    // Build segment tree method
    public void buildTree(Node node, int[] arr, int start, int end, int value) {
        if (start == end) {
            node.value = arr[start]; // Update node value
            return;
        }

        int mid = (start + end) / 2;

        // Taking input for left side of the tree
        System.out.println("Enter true or false for left side insertion ");
        Scanner tf = new Scanner(System.in);
        boolean respo = tf.nextBoolean();
        System.out.println("Enter the data wanted to be inserted");
        Scanner sc = new Scanner(System.in);
        value = sc.nextInt();

        if (respo) {
            node.left = new Node(value);
            node.left.next[0] = start; // Assign start to index 0 of left child
            node.left.next[1] = mid;   // Assign mid to index 1 of left child
            buildTree(node.left, arr, start, mid, value);
        } else {
            System.out.println("You don't have a choice, must insert data on the right side");
            node.right = new Node(value);
            node.right.next[0] = mid + 1; // Assign mid+1 to index 0 of right child
            node.right.next[1] = end;     // Assign end to index 1 of right child
            buildTree(node.right, arr, mid + 1, end, value);
        }
    }

    public void display(Node node) {
        if (node == null) {
            return;
        }
        display(node.left);
        System.out.print(node.value + " ");
        display(node.right);
    }

    public static void main(String[] args) {
        System.out.println("Enter number of elements (size):");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int array[] = {1, 3, 5, 7, 9, 11};
        segmenttree st = new segmenttree();
        root = st.new Node(-1); // Create a dummy root node
        st.buildTree(root, array, 0, size - 1, 36);
        st.display(root);
    }
}

