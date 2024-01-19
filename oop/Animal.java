package oop;
class Calculator {
    int result;

    void add(int x, int y) {
        // System.out.println("result of the opration as below");
         result = x + y; // Invokes the add method and sets the result using this
         System.out.println(result);
    }
    void sub(int z , int s ){
        result =z-s;
        System.out.println(result);
    }
}


class InnerAnimal {
    void eat(){
        System.out.println("animal eats and they only living for eating the stuff");

    }
}
class dogo extends InnerAnimal{
    int age;
    public void bark(int age) {
        // this.age=age;

        System.out.println("dog barks so louder" +"and its age is " + age);
        
    }
    @Override
    void eat() {
        // TODO Auto-generated method stub
        super.eat();
    }
}
/**
 * InnerAnimal
 */
public class Animal {
    public static void main(String[] args) {
        InnerAnimal ia=new InnerAnimal();
        ia.eat();
        dogo dog1 = new dogo();
        dog1.eat();
        dog1.bark(12);
        Calculator cal =new Calculator();
        cal.add(1, 2);
        cal.sub(3, 1);
        


    }

    
}
