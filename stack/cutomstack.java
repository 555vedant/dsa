package stack;

public class cutomstack implements cutomstack1 {
    protected int data[];
    protected static final int DEFALULT_SIZE=10;
    int ptr=-1;
    //we can use this keyword to refer the local varibles and also we can use this keywoed to use constructure inside the constructor 
    public cutomstack(){
        this(DEFALULT_SIZE);
    }
    public cutomstack(int size){
        this.data=new int[size];
    }
    @Override
    public boolean push(int item){
        if (isfull()) {
            return false;
            
        }
        ptr++;
        data[ptr]=item;
        return true;



    }
    public boolean isfull() {
        // TODO Auto-generated method stub
        return ptr==data.length-1;

    }
    public boolean isEmpty() {
        return ptr==-1;
    }

    //method for poping the element 
    @Override
    public int pop(){
        if(isEmpty()){
            try {
                throw new Exception("This is an logical exception !");
            } catch (Exception e) {
                // TODO: handle exception
                System.err.println("you cant pop element from empty stack " +e.getMessage());
            }
            
        }
        return data[ptr--];


    }

//method for peek 
/**
 * @return the data at topmost of stack
 */
@Override
public int peek(){
    if(isEmpty()){
        try {
            throw new Exception("This is an logical exception !");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("you cant pop element from empty stack " +e.getMessage());
        }
        
}
return data[ptr];
}  
}