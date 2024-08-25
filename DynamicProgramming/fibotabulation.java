package DynamicProgramming;
import java.math.BigInteger;
import java.util.Arrays;

public class fibotabulation {
    public static BigInteger[] fibo(int n) {
        BigInteger array[] = new BigInteger[n + 1];
        Arrays.fill(array, 0);
        array[1] = array[1].add(BigInteger.ONE);
        for (int i = 0; i < n - 1; i++) {
            array[i + 2] = array[i + 2].add(array[i]);
            array[i + 2] = array[i].add(array[i + 1]);
        }
        array[n] = array[n - 1].add(array[n - 2]);
        return array;
    }

    // @Override
    // public String toString() {
    //  return Arrays.toString(fibo(10));
    // }

    public static void main(String[] args) {
        fibotabulation f = new fibotabulation();
        System.err.println(Arrays.toString(f.fibo(10)));
    }
}