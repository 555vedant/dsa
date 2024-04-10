package heaps;

public class heap<T extends  Comparable<T>> {
    private T[] array;
    private int size;
    
    public heap(int capacity) {
        this.array = (T[]) new Comparable[capacity + 1]; // Casting to make it work with generics
        this.size = 0;
    }

    /* Returns the number of elements in the heap */
    public int setsize(int s){
        this.size = s;
    }
    public int getSize() { return this.size; }

    /* Checks if the heap is empty or not */
    public boolean isEmpty() { return this.getSize() == 0; }

    /* Add an element to the end of the heap */
    public void add(T item) {
        /* Resize the array if necessary */
        if(this.size + 1 > this.array.length - 1) {
            T[] tempArray = (T[])new Comparable[2 * this.array.length]; // Double the size of the array
            for(int i=0;i < this.size;i++) {
                tempArray[i] = this.array[i];
            }
            this.array = tempArray;
        }
        
        this.array[this.size+1] = item; // Add the new item at the last position
        this.size++; // Increment the size counter
        heapifyUp(); // Maintain the heap property
    }

    /* Removes and returns the smallest element from the heap */
    public T removeMin() {
        if(isEmpty()) throw new RuntimeException("Heap underflow");

        T minItem = this.array[1]; // The root has the value of the first leaf node 
        this.array[1] = this.array[this.size]; // Move the last item to the root
        this.size--; // Decrement the size counter
        heapifyDown(); // Maintain the heap property
        return minItem;
    }

    /** Swaps two nodes in the heap array */
    private void swap(int i, int j) {
        Comparable tmp = this.array[i];
        this.array[i] = this.array[j];
        this.array[j] = tmp;
    }

  private int parent(int i){
    return (i-1)/2;
    
  }
  private int leftindex(int i){
    return (2*i)+1;

  }
  private int rightindex(int i){
    return (2*i)+2;
  }

    
