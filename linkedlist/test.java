package linkedlist;

import java.util.Scanner;

public class test {
    public int sum(int a , int b){
        int c = a + b ;
        return c;
        
    }
    public static void main(String[] args) {
        System.out.println("enter first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        test t1 =new test();
        
        System.out.println("sum of a and b is :");
        System.out.println(t1.sum(a, b));

        
        
    }
}
