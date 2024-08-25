package grredy;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import heaps.heap;

/**
 * Huffmancoder
 */
public class Huffmancoder {
    public static int hash_table_size=10;
    /**
     * Node
     */
    public class Node {
        char data;
        String next_val;
        Node left, right;
        public Node(char data, String next_val){
            this.data=data;
            this.next_val= next_val;
        }
    
        
    }

    public static void main(String[] args) {
        HashMap<Character,String> encoder = new HashMap<>();
        HashMap<Character,String> decoder= new HashMap<>();
        //for insertion we have need of the frequncy table 
        Scanner sc = new Scanner(System.in);
        String input =sc.nextLine();
        
        //we have to find the frequncy of each character
        // LinkedList<Character> list = new LinkedList<>();
        HashMap<Character , String> input_map = new HashMap<>();
        input_map = frequncy_map(input);
        
        
     

        

        
    }
    public static hashMap<Character , String> frequncy_map(String test){
        HashMap<Character,String> encoder = new HashMap<>();
        
               for(int i =0 ; i<test.length(); i++){
    
                char a = test.charAt(i);
                // int hash = Character.hashCode(a);
                // int index = hash % hash_table_size;
                if(encoder.containsKey(a)){
                    encoder.put(a, encoder.get(a)+1);
                }else{
                    encoder.put(a, "1");
                }   
            }
        
        return encoder;
    }

}