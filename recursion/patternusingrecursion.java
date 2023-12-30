package recursion;

public class patternusingrecursion {
    static void pattern(int n ){
        if (n==0) {
            return;
        }
       if (n==4) {
        System.out.println("*" +"*"+"*"+"*");
        
       }
       if (n==3) {
        System.out.println("*"+"*"+"*");
       }
       if (n==2) {
        System.out.println("*"+"*");

    
       }
       if (n==1) {
        System.out.println("*");
       }
       
        pattern(n-1);
    }
    public static void main(String[] args) {
        pattern(4);
        
    }
    
}
