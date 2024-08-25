package trees;
import java.util.*;


class BFS {
    class TreeNode{
        int val ;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val ;
            this.left = null ;
            this.right = null;
            
        }

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrder = new ArrayList<>();
        if (root == null) {
            return levelOrder;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelValues = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                levelValues.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                // if(node.left==null){
                //     queue.offer(null);
                // }
                // if(node.right==null){    
                //     queue.offer(null);
                // }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            levelOrder.add(levelValues);
        }

        return levelOrder;
    }
}


// import java.util.LinkedList;
// import java.util.Queue;

// public class QueueExample {
//     public static void main(String[] args) {
//         // Create a Queue using LinkedList implementation
//         Queue<Integer> queue = new LinkedList<>();

//         // Adding elements to the queue
//         queue.offer(1);  // Adds 1 to the rear of the queue
//         queue.offer(2);  // Adds 2 to the rear of the queue
//         queue.offer(3);  // Adds 3 to the rear of the queue

//         // Removing elements from the queue
//         while (!queue.isEmpty()) {
//             System.out.println("Removed element: " + queue.poll());  // Removes and returns elements from the front of the queue
//         }
//     }
// }
