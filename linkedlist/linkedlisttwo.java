package linkedlist;
public class linkedlisttwo {
    node head;
    class node{
        int data ;
        node next;
        public node(int a){
            this.data=a;
           

        }
    }
    //adding new node at the begining of all 
    public void insetatfirst(int data){
        
        node newnode = new node(data);
        if (head ==null) {
            head = newnode;
            return;


            
        }
        newnode.next =head;
        head =newnode;
    }
    //adding node at last 
    void addlast(int data ){
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        while (head != null) 
        {
           head.next =newnode;
           newnode=head;
           


        }

    }
    public static void main(String[] args) {
        
        linkedlisttwo list = new linkedlisttwo();
        list.insetatfirst(1);
        list.addlast(2);
    }
}
