public class lcmandhcf {
    static int hcf(int a , int b){
        
        while (true) {
             int q = a/b;
             int r =a %b;
              a = r;
              b=a;
            if (a % b ==0 ) {
             return a;
             
        
            }
            
        }
       
       
      
    }
    public static void main(String[] args) {
        int a =12;
        int b =14;
        int ans = hcf(a, b);
        System.out.println("the hcf of number that you enterd is " +ans);
        
    }
}
