package linkedlist;

class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
    }
}

public class deletion {
    Node head;
    
    // Method to delete from the beginning of the linked list
    void delete(){
        if (head == null) {
            return;
        }
        head = head.next;
    }
    
    // Method to delete the last node of the linked list
    void deletelast(){
        if (head == null) {
            return;
        }
        Node secondLast = null;
        Node last = head;
        while (last.next != null) {
            secondLast = last;
            last = last.next;
        }
        if (secondLast != null) {
            secondLast.next = null;
        } else {
            head = null;
        }
    }
    
    // Method to insert a node at the end of the linked list
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    // Method to display the linked list
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        deletion l1 = new deletion();
        
        // Insert some elements
        l1.insert(1);
        l1.insert(2);
        l1.insert(3);
        l1.insert(4);
        l1.insert(5);
        
        System.out.println("Original linked list:");
        l1.display();
        
        // Delete the last element
        l1.deletelast();
        System.out.println("Linked list after deleting last element:");
        l1.display();
        
        // Delete the first element
        l1.delete();
        System.out.println("Linked list after deleting first element:");
        l1.display();
    }
}
