import java.util.*; 

public class KarpRabin {
    public final int PRIME_NO = 101;
    
    // Calculating overall hash value of the string 
    public double hashstring(String pattern){
        double hash = 0;
        for (int i = 0; i < pattern.length(); i++) {
            hash = hash + pattern.charAt(i) * Math.pow(PRIME_NO, i);
        }
        return hash;
    }

    public double update_hash(double prevhash, char oldchar, char newchar, int patternlength) {
        double hash = prevhash - oldchar;
        hash = hash / PRIME_NO;
        hash = hash + newchar * Math.pow(PRIME_NO, patternlength-1);
        return hash; 
    }

    public void Search(String pattern, String main) {
        double patternhash = hashstring(pattern);
        double mainhash = hashstring(main.substring(0, pattern.length()));
        
        for (int i = 0; i <= main.length() - pattern.length(); i++) {
            if (patternhash == mainhash) {
                if (pattern.equals(main.substring(i, i + pattern.length()))) {
                    System.out.println("hey your name is therer so you can go and sleep now !");;
                }
                
            }
            
            if (i < main.length() - pattern.length()) {
                mainhash = update_hash(mainhash, main.charAt(i), main.charAt(i + pattern.length()), pattern.length());
            }
            
        }
        // System.out.println("your name is not there try it with diffrent name");
    }
    //i just tried with nonsense stuff you can use boolean and then procced through it 

    public static void main(String[] args) {
        String pattern = "ved";
        String main_one = "kasarvedant";
        KarpRabin obj = new KarpRabin();
        
        obj.Search(pattern, main_one);
        
    }
}
