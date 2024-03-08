package queues;

public class circularqueue {
    protected int data[];
    protected static final int DEFAULT_SIZE = 10;
    //this "-1" is refering that intially our pointer is pointing to the out of stack value
    //or null value  Integer end =null;
    int end = 0;
    public boolean enqueues(int item) {
        if(isEmpty()){
            try {
                throw new Exception("This is an logical exception !");
            } catch (Exception e) {
                // TODO: handle exception
                System.err.println("you cant pop element from empty stack " +e.getMessage());
            }
            return false;
        }
        data[end++]=item;
        return true;

    }
    public boolean isFull() {
        // TODO Auto-generated method stub
       return end ==data.length;
    }
    public boolean isEmpty(){
        return end==0;
    }
    public int dequeues()throws Exception{
        //we have to shift queues to leftward upto when first elemnet get fucked out of queue
        //O(n)
        if (isEmpty()) {
            throw new Exception("quenue if empty");
        }
        
        int removed =data[0];
        for (int i = 1; i < end; i++) {

            data[i-1]=data[i];
            
        }
        end--;
        return removed;

    }
    public void display(){
        for(int i =0 ; i<end; i++){
            System.out.println(data[i]+ "");
        }
        System.out.println("end");
    }
}
