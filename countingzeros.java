//only apply the logic of remainder then if zero occurs then counter++
/**
 * countingzeros
 */
public class countingzeros {
    static int counter(int n) {
        int count =0;
        while(n /10 != 0){
            int remainder = n%10;
            n = n/10;
            if (remainder ==0) {
                count++;

                
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int n =302040;
        int ans =counter(n);
        System.out.println("occurance of the zerors in the given number is " + ans);
        
    }
}