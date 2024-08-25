
package hashmaps;
import java.util.Random;
import java.util.*;


public class randomnumber {
    public static void main(String[] args) {
        Random random =new Random();
        //where bound 100 will be exclusive 
        int new_random_number = random.nextInt(100);
        System.out.println("new_random_number"+new_random_number);  
        Random randomWithSeed = new Random(123);

        int randomNumberWithSeed = randomWithSeed.nextInt(100);


        System.out.println("Random Integer with seed: " + randomNumberWithSeed);
        // int a = 23 ;
        String name = "vedant";
        int b = name.hashCode();
        System.out.println("the value of b is -> "+b);

        //if wanted to hashcode of an integer we can follow below steps
        int d =1;
        int n = Integer.hashCode(d);
        System.out.println("the value of n is "+n);


    }
    
}
