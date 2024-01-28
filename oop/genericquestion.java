package oop;

// class pair<T> {
//     T a;
//     T b;

//     // Constructor to initialize fields
//     pair(T a, T b) {
//         this.a = a;
//         this.b = b;
//     }

//     public T getA() {
//         return a;
//     }

//     public T getB() {
//         return b;
//     }

//     public boolean compare(Object object, Object object2) {
//         if(object == object2){
//             return true;
//         }
//         return false;
//     }
// }

// public class genericquestion {
//     public static void main(String[] args) {
//         // Specify the generic type when creating the object
//         pair<?> p = new pair<>(4, 5);

//         // Call the compare method and print the result
//         System.out.println(p.compare(p.getA(), p.getB()));
//     }
// }

class Pair<T, U> {
    private T first;
    private U second;

    // Constructor to initialize the pair with two values
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Getter method to retrieve the first value
    public T getFirst() {
        return first;
    }

    // Getter method to retrieve the second value
    public U getSecond() {
        return second;
    }

    // Method that compares the values and returns true if they are equal
    public boolean isEqual() {
        return first.equals(second);
    }
}

public class genericquestion {
    public static void main(String[] args) {
        // Create a Pair of Integer values
        Pair<Integer, Integer> intPair = new Pair<>(10, 10);
        System.out.println("Integer Pair: " + intPair.getFirst() + ", " + intPair.getSecond());
        System.out.println("Are the values equal? " + intPair.isEqual());

        // Create a Pair of String values
        Pair<String, String> stringPair = new Pair<>("hello", "world");
        System.out.println("String Pair: " + stringPair.getFirst() + ", " + stringPair.getSecond());
        System.out.println("Are the values equal? " + stringPair.isEqual());

        // Create a Pair with different types (Integer and String)
        // Note: This is valid due to the use of generic type parameters
        Pair<Integer, String> mixedPair = new Pair<>(42, "forty-two");
        System.out.println("Mixed Pair: " + mixedPair.getFirst() + ", " + mixedPair.getSecond());
        // Uncommenting the line below would result in a compilation error due to type safety.
        // System.out.println("Are the values equal? " + mixedPair.isEqual());
    }
}
