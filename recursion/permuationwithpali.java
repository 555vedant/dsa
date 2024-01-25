package recursion;

import java.util.Scanner;

public class permuationwithpali {

    public static boolean isPalindrome(String name) {
        int length = name.length();
        for (int i = 0; i < length / 2; i++) {
            if (name.charAt(i) != name.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int canWeMakePalindrome(String p, StringBuilder up) {
        if (up.isEmpty()) {
            if (isPalindrome(p)) {
                return 1;
            }
           
        }

        for (int i = 0; i < up.length(); i++) {
            char c = up.charAt(i);
            StringBuilder left = new StringBuilder(up.substring(0, i));
            StringBuilder right = new StringBuilder(up.substring(i + 1));

            // Concatenate 'left' and 'right' without using StringBuilder
            left.append(right);

            // Check if the modified string is a palindrome
            int result = canWeMakePalindrome(p + c, left);

            // Consider the result of the recursive call
            if (result == 1) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a");
        int ans = canWeMakePalindrome("", stringBuilder);
        System.out.println("ans of the question is " + ans);
    }
}
