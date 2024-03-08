package stack;

public class mainofdynamic {
    public static void main(String[] args) {
        //here you can also use customstack d1 = new dynamicstack();
        //because parent can be used as reference 

        dynamicstack d1= new dynamicstack();
        d1.push(1);
        d1.push(2);
        d1.push(4);
        System.out.println(d1.pop());

    }
}
