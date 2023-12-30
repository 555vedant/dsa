public class fibonachi {
    static int factorail(int n){
        
    if (n==0 || n==1) {
        System.out.println("factorial of the number as you enterd is 1 only");
        return 1;
        
    
        
    }
    
    return factorail(n-1)*n;
    
    }
    static void fibo(int n){
        //where n represents upto what number you wanted to print that fibonachi series
        int i=0;
        int seq=0;
        while (i<=n) {
            seq=seq+i;
            System.err.println("the fibonachi sequcence upto the number is as follow"+seq);
            i++;
            
            
        }
    }
    public static void main(String[] args) {
        int n =5;
        factorail(n);
        fibo(n);
        
    }
}
// public class fibonachi {
//     static int factorial(int n) {
//         if (n == 0 || n == 1) {
//             System.out.println("Factorial of the number as you entered is 1 only");
//             return 1;
//         }
//         return n * factorial(n - 1);
//     }

//     static void fibo(int n) {
//         int first = 0, second = 1;
//         System.out.println("The Fibonacci sequence up to the number is as follows:");
//         for (int i = 0; i <= n; i++) {
//             System.out.print(first + " ");
//             int temp = first + second;
//             first = second;
//             second = temp;
//         }
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println("Factorial of " + n + " is: " + factorial(n));
//         fibo(n);
//     }
// }

