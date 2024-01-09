package recursion;

/**
 * permutation
 */
public class permutation {

    static void p(String p , String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;

        }
        for(int i =0 ; i<up.length(); i++){
            char ch = up.charAt(i);
            String left = up.substring(0, i);
            String right = up.substring(i+1);
            String merg = left + right;
            p(p+ch, merg);
        }
    }
    public static void main(String[] args) {
       System.out.println("permutation of the string is as below");
       p("", "abc");
        
    }
}