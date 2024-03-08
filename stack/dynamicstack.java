package stack;

/**
 * dynamicstack
 */
public class dynamicstack extends cutomstack {
    public dynamicstack(){
        super();
    }
    public dynamicstack(int size){
        super(size);
    }
   

    @Override
    public int peek() {
        // TODO Auto-generated method stub
        return super.peek();
    }

    @Override
    public int pop() {
        // TODO Auto-generated method stub
        return super.pop();
    }
      
    //in this dynamicstack we will never have any type of tension to became stack full we can dynamically oversize the stack
    @Override
    public boolean push(int item) {
        // TODO Auto-generated method stub
       if (super.isfull()) {
        int temp[]=new int[2*super.data.length];
        for (int index = 0; index < super.data.length; index++) {
            temp[index]=data[index];

            
        }
        data =temp;
       }
       //at this instant we know that our array is full of length 
       return super.push(item);

    }

    
}
