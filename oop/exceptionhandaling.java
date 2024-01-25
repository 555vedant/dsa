package oop;
import java.io.FileNotFoundException;
import java.io.IOException;

public class exceptionhandaling {
    public static void main(String[] args) {
        try {
            // Code that may throw exceptions
            int result = divide(10, 0); // Change divisor to a non-zero value
            System.out.println("Result: " + result);
        } catch (Exception exception) {
            // Handle Exception
            
            System.err.println("Error: " + exception.toString());
        } finally {
            // Cleanup code
            System.out.println("Finally block: Cleanup code here");
        }
    }

    // Custom method that may throw an exception
    private static int divide(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Cannot divide by zero");
        }
        return a / b;
    }
}

