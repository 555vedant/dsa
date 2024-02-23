

// Define the Node class outside the LL class
class Node {
    private int data;
    private Node next;

    public Node(int val) {
        this.data = val;
        this.next = null; // Initialize next to null
    }

    public Node(int val, Node next) {
        this.data = val;
        this.next = next;
    }

    // Getters and setters for data and next
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

// Define the LL (LinkedList) class
class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
        this.head = null; // Initialize head and tail to null when the list is created
        this.tail = null;
    }

    // Method to insert an element at the end of the linked list
    public void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}

// The main class
public class linkedlist {
    public static void main(String[] args) {
        LL list = new LL();
        list.insert(1); // Insert elements into the linked list
        list.insert(2);
        list.insert(3);
        list.printList(); // Print the linked list
    }
}
