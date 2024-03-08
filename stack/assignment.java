package stack;

import java.util.Stack;

public class assignment {
  
    public static boolean isPalindrome(Stack<Character> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return false;
        }

        int size = stack.size();
        for (int i = 0; i < size / 2; i++) {
            if (stack.get(i) != stack.get(size - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Creating a custom stack
        Stack<Character> stack = new Stack<>();
        stack.push('v');
        stack.push('e');
        stack.push('d');
        stack.push('e');
        stack.push('v');
        stack.push('b');
        
        // Checking if the stack content is a palindrome
        boolean result = isPalindrome(stack);
        System.out.println("Is the stack content a palindrome? " + result);
    }
}




