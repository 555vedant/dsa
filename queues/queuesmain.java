package queues;

public class queuesmain {
    public static void main(String[] args) throws Exception {
        customqueues q1=new customqueues();
        q1.enqueues(3);
        q1.enqueues(4);
        q1.enqueues(5);
        q1.enqueues(6);
       
       q1.display();
       
    }
}
