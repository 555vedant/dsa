package FileHandaling; // Fixed the package name

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class streams {
    public static void main(String[] args) {
        // try (InputStreamReader i = new InputStreamReader(System.in)) {
        // System.out.println("Enter some characters (Ctrl+D to end):");
        // int letter;
        // while ((letter = i.read()) != -1) { // Read until EOF
        // System.out.print((char) letter + "\n");
        // // System.out.println("\n");
        // }
        // } catch (IOException e) {
        // System.out.println("Error: " + e.getMessage());
        // }

        // ---------------------------
        // now if we wanted to read char stream using the standrd input (keyboard)
        // bytestream we can wrapp it out

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        //where new FileReader(file.txt) is also kind of character stream 
    }
}
