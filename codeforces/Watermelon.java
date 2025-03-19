public class Watermelon{
    public boolean check(int w){
        if((w & 1) ==1){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        
        Watermelon w = new Watermelon();
       if(w.check(8)){
           System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
    }
}