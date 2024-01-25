package recursion;

  public class test {
   static void recursiveFun4(int n, int m, int o) {
        if (n <= 0) {
            System.out.println(m + ", " + o);
        } else {
            recursiveFun4(n - 1, m + 1, o);
            recursiveFun4(n - 1, m, o + 1);
        }
    }

    public static void main(String[] args) {
        recursiveFun4(3, 0, 0);
    }
}
 
