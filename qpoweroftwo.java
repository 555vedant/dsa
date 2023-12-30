// import java.util.*;

// public class qpoweroftwo {
//     static boolean answer(int ans){
//         for(int i=0 ; i<=ans; i++){
//            if ( Math.pow(2, i)==ans) {
//             return true;
            
//            }
//         }
//         return false;
//     }
      
//     static int muloftwo(int number){
//           int base =1;
//           int ans =0;
//         while (number >0) {
            
//             int lastdig= number & 1;
//             number = number << 1;
//             int partialans = base *lastdig;
//             ans +=partialans;
//             base = base *2;

            
//         }
//        return ans;
//     }
//     public static void main(String[] args) {
//         System.out.println("enter a binary value ");
//         Scanner sc =new Scanner(System.in);
//         int number =sc.nextInt();
//         int value =muloftwo(number);
//         answer(value);

     
//         System.out.println("the ans of question is " + value );
//         sc.close();
      
         


        

//     }
// }



//corrected code
import java.util.*;

public class qpoweroftwo {
    static boolean answer(int ans){
        for(int i=0 ; i<=ans; i++){
           if ( Math.pow(2, i)==ans) {
            return true;
            
           }
        }
       return false;
    }
      
    static int muloftwo(int number){
          int base =1;
          int ans =0;
        while (number >0) {
            
            int lastdig= number & 1;
            number = number << 1;
            int partialans = base *lastdig;
            ans +=partialans;
            base = base *2;

            
        }
       return ans;
    }
    public static void main(String[] args) {
        System.out.println("Enter a binary value: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int value = muloftwo(number);
        boolean isPowerOfTwo = answer(value);

        System.out.println("The input number is " + (isPowerOfTwo ? "" : "not ") + "a power of two.");
        sc.close();
    }
}
