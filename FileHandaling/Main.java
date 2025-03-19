package FileHandaling;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create
        try {
        File fo = new File("new-file.txt");
        fo.createNewFile();
        } catch (IOException e) {
        System.out.println(e.getMessage());
        }

        // write in the file
        // try {
        // FileWriter fw = new FileWriter("new-file.txt");
        // fw.write("सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज, अहं त्वां सर्वपापेभ्यो
        // मोक्षयिष्यामि मा शुच:");
        // fw.close();
        // } catch (IOException e) {
        // System.out.println(e.getMessage());
        // }

        // reading from a file
        // try (BufferedReader br = new BufferedReader(new FileReader("new-file.txt")))
        // {
        // while (br.ready()) {
        // System.out.println(br.readLine());
        // }
        // } catch (IOException e) {
        // System.out.println(e.getMessage());
        // }
        // here we will try to read the same file using the filereader
        try {
            FileReader fileReader = new FileReader("new-file.txt", StandardCharsets.UTF_8);

            // change the encoding starategy here

            int data;
            System.out.println("Reading with FileReader:");
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
            fileReader.close();

            System.out.println("\n\nReading with BufferedReader:");
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // create
        // try {
        // File fo = new File("random.txt");
        // fo.createNewFile();
        // if(fo.delete()) {
        // System.out.println(fo.getName());
        // }
        // } catch (IOException e) {
        // System.out.println(e.getMessage());
        // }

    }
}