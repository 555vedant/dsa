package recursion;

public class subsequence {
    static void ss(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        ss(p + ch, up.substring(1));
        ss(p, up.substring(1));
    }

    public static void main(String[] args) {
        String up = "abc";
        ss("", up);
    }
}

