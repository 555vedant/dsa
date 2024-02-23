// package linkedlist;


// public class ownpractice {
   
//     public static void main(String[] args) {
//         LL n5= new LL();

//         n5.begining(3);
//         n5.begining(4);
//         n5.begining(5);
//         n5.begining(7);
//         n5.random(3, 9);
//         // n5.display();
        
        
        
//     }
// }

package linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ownpractice {
    private Node head;
    private Node tail; // Maintain reference to the last node

    // Method for inserting at a random index
    void random(int index, int value) {
        Node newNode = new Node(value);

        if (index <= 0) { // Insert at the beginning
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int count = 0;
        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Method for inserting an element at the end of the list
    void last(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode; // Update tail when list is empty
            return;
        }

        tail.next = newNode;
        tail = newNode; // Update tail
    }

    // Method for insertion in linked list -> insertion at beginning
    void beginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null) { // If list was empty, update tail
            tail = newNode;
        }
    }

    // Method for display the linked list
    void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {
            System.out.println("The data of linked list is " + temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ownpractice list = new ownpractice();
        list.last(2);
        list.last(3);
        list.last(4);
        list.last(5);
        list.random(3, 9);
        list.display();
    }
}

