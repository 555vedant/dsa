package oop;
// Generic Box class
class Box<v> {
    //there one more exist named wildcard which will only you a specfic kind of type that will be into the box ex -> Number
    //check sysntax of this stuff by your own
    private v content;

    public void put(v item) {
        this.content = item;
    }

    public v get() {
        return content;
    }

  
}


public class generics {
    public static void main(String[] args) {
        // Creating a Box for numbers
        Box<Integer> numberBox = new Box<>();
        numberBox.put(42);
        System.out.println("Number in the box: " + numberBox.get());

        // Creating a Box for words
        Box<String> wordBox = new Box<>();
        wordBox.put("Hello, Generics!");
        System.out.println("Word in the box: " + wordBox.get());


        Box<Double> floatbox =new Box<>();
        floatbox.put(2.33333);
        System.out.println("float value in box is " + floatbox.get());

        
    }
}
