package heaps;

import java.util.ArrayList;

public class heap<T extends comparable<T>> {
    private ArrayList<T> list;
    public heap(){
        this.list = new ArrayList<>();
    }
    //method for swap 
    public void swap(int index1 , int index1){
        int temp =list.get(index1);
        list.set(index1 , list.get(index2));
        list.set(index2 , temp );
    }
    int parent(int i){
        return (i -1)/2;

    }
    int left(int i){
        return 2*i + 1 ;
    }
    int right(int i){
        return 2*i + 2;
    }
    void insert(T item) {
        //implimenting upheap
        list.add(item);
        upheap(list.size()-1);
    }
    void upheap(int index){
        if (index ==0) {
            return ;
        }
       int p = parent(index);
       if (list.get(index).compareTo(list.get(p))<0) {
        swap(index , p );
        upheap(p);
        
       }

    }

    //making method for removing some elemnet from heap 
    public T remove(int i)throws Exception{
        if (list.isEmpty()) {
            throw new Exception("Heap is empty");
            
        }
        //for removing we are removing upmost element 
        T temp = list.get(i);
        int last =list.remove(list.size()-1);
        if (!list.isEmpty()) {
            list.set(i, temp);
            downheap(i);

            
        }
        return temp;

        
    }

    void downheap(int index) {
        
        int current =index;
        int left = left(index);
        int right = right(index);
        // int min = Math.min(list.get(left), list.get(right));
        // if (min>current) {
        //    swap(min , current);
        //    downheap(index);
            
        // }
        if (left <list.size && list.get(left).compareTo(list.get(index))) {
            int min =left;
        }
        if(right< list.size && list.get(right).compareTo(list.get(index))){
            int min = right;
        }
        if (min != index) {
            swap(min, index);
            downheap(min);
        }
    

    
}
}
