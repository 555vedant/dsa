
package linkedlist;

public class doublelylinkedlist {
    Node head;
    
    Node tail;
    doublelylinkedlist(){
        this.head = null;
        this.tail=null;

    }
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode; // Update tail when inserting the first node
        } else {
            head.next = newNode;
            newNode.prev = head;
            head = newNode; // Update tail to the newly added node
        }
    }
    
    
     // Displaying the entire list
     public void displayAll() {
        Node current = head;
        System.out.println("Forward order:");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("Reverse order:");
        current = tail;
        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
    }
   public void display1(int index) {
    int i = 0;
    while (head != null) {
        if (i == index) {
            System.out.println(head.data);
            break;
        }
        i++;
        head = head.next; // Permanently modify head pointer
    }
    if (head == null) {
        System.out.println("Index out of bounds");
    }
}
//modificantion of head pointer new method
public Node display2(int index) {
    Node current = head;
    int i = 0;
    while (current != null) {
        if (i == index) {
            System.out.println(current.data);
            break;
        }
        i++;
        current = current.next;
    }
    if (current == null) {
        System.out.println("Index out of bounds");
    }
    return head; // Return the modified head pointer
}







    public static void main(String[] args) {
        doublelylinkedlist list = new doublelylinkedlist();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        // list.display1(1);
        list.displayAll();
        // head =display2(2);
        

        
    }
}

