// package stack;

// import java.util.Stack;
// import java.util.*;

// /**
//  * stringquestion
//  */
// public class stringquestion {
  

//     public int minLength(String p , String up) {
//         if (up.length()==0) {
//             System.out.println(p);
//             return 0;
            
//         }
//         Stack<Character> stack = new Stack<>();
//         String words[] ;
//         int i =0;
       
        
//         while (i < up.length()-3) {
//           words = up.subSequence(i, 3); 
            
        
        
//         for (int i =0 ; i<words.length-1; i++) {
//             int a =words.charAt(i);
//             int b=words[i+1];
            
//             if (stack.isEmpty()){
//                 return 0;
//             }
//             if (a =='A' && b =='B' || a=='C' && b=='D') {
//                 stack.pop();
//             } else {
//                 char last = stack.pop();
                
//             }
            
//         }
//         i++;
//     }
//     minLength(p, up);
// } 
        
        
        
        
        
    

//     public static void main(String[] args) {
//         Stack<Character> s = new Stack<>();
        
        

// }
// }

package stack;

import java.util.Stack;

public class stringquestion {
  
    public int minLength(String up) {
        
        Stack<Character> stack = new Stack<>();
        
        
        for (int i = 0; i < up.length() - 1; i++) {
            char currentChar = up.charAt(i);
            
            if (!stack.isEmpty()) {
                char top = stack.peek();
                if ((top == 'A' && currentChar == 'B') || (top == 'C' && currentChar == 'D')) {
                    stack.pop();
                } else {
                    stack.push(currentChar);
                }
            } else {
                stack.push(currentChar);
            }
        }
        
        return stack.size();
    }

    public static void main(String[] args) {
        stringquestion stringQuestion = new stringquestion();
        
        String up = "CAB"; // Your input string up
        int minLength = stringQuestion.minLength(up)+1;
        System.out.println("Minimum length: " + minLength);
    }
}
