import java.util.Arrays;


public class querybetweenrange {
    public static int sum_query(int block[] , int array[] , int l , int right , int sqrt){
        int sum =0 ;
        while(l <sqrt && l < right){
            sum = sum + array[l];
            l++;
            
        }
        //intalizatoin for the mid middle one 
        while (l + sqrt< right) {
            if (l % sqrt == 0) {
                sum = sum + block[l / sqrt];
                l+=sqrt;
                
            }
        }
        //intalization of right part 
        while(l <= right){
            sum = sum + array[l];
            l++;
            
        }
        return sum ;
    }

    public static void update_block( int block[] , int array[] , int value , int index , int sqrt ) {
        int block_id = index /sqrt;
        block[block_id] = (block[block_id]-array[index])+value;
        array[index]=value;
        System.out.println(Arrays.toString(array));
        
    }
    public static void main(String[] args) {
        int array[]={1 ,3 , 4 ,6 ,7 ,8 , 10 , 13 , 12 , 65};
        
        int sqrt = (int) Math.sqrt(array.length);
        int blocks[]= new int[sqrt+1];
        int block_id = -1;
        for(int i =0 ; i<array.length ; i++){
            if (i % sqrt == 0) {
                block_id++;
                
            }
            blocks[block_id] = blocks[block_id] + array[i];
        }
        System.out.println(Arrays.toString(blocks));
        int left = 1;
        int right = 7;
        int ans_of_sum_query=sum_query(blocks, array, left, right, sqrt);
        System.out.println(ans_of_sum_query);
        int values =99;
        int index =1;
        update_block(blocks, array, values, index, sqrt);
        
        
        


        
    }
}
