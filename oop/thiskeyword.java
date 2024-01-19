package oop;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        // Using 'this' to differentiate between instance variables and parameters
        this.name = name;
        this.age = age;
    }
    //if there should be any parameter inside the methos printdetails or any local vaiable then we cant acces to only name we must need of this.name to acces modified value of name

    void printDetails() {
        // just see if i add local varible then it is throwing error 
        //so thats why use of this keyword is nessacay for refaring the instance variabels
        // String name;

        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age: " + this.age);
    }
}
public class thiskeyword {

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        student1.printDetails();

        Student student2 = new Student("Bob", 22);
        student2.printDetails();
    }
}
