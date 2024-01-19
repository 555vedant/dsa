package oop;

import java.util.ArrayList;

class Value {
    ArrayList<Integer> list = new ArrayList<>();

    // Constructor
    public Value() {
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }
//lambda expression

        list.forEach((value) -> {
            System.out.println(value* 2);
        });
        
    }
}

public class lambda {
    public static void main(String[] args) {
        // Creating an instance of the Value class
        Value valueInstance = new Value();
    }
}
