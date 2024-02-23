package linkedlist;

public class LL {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
       Node(){
        this.data=0;
        this.next=null;
       }
    }

    //method for inserting ar ranodom index 
    void random(int index, int value) {
        Node newNode = new Node();
        newNode.data = value;

        if (head == null) {
            System.out.println("List is empty");
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
    


//method for inserting at the end of list
void last(int data ){
    Node nayinode=new Node();
    
    nayinode.data=data;
    if (head == null ) {
        System.out.println("list is empty");
        return;
        
    }
    Node temp=head;

    while (temp.next!=null) {
        temp =temp.next;
        
    }
    temp.next = nayinode;
    nayinode.next=null;


}


//method for insertion in linked list -> insertion at begining
void begining(int value){
    Node newnode = new Node();
    
    newnode.data=value;
    newnode.next=head;
    head = newnode;
    

    
    
    
}


//method for display the linked list 
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

}
