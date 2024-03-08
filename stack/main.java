package stack;
//as i implimneted custom stack we can do it using inbuild interface and generic stuff !
public class main {
    public static void main(String[] args){
        cutomstack1 c1 =new cutomstack();
        c1.push(1);
        c1.push(2);
        c1.push(3);
        c1.push(4);
        c1.push(5);
        System.out.println(c1.pop());
        System.out.println(c1.pop());
        System.out.println(c1.pop());
        System.out.println(c1.pop());
        System.out.println(c1.pop());
        System.out.println(c1.pop());

    }
    
}
