package recursion;

public class removingspecificcharfromstring {
    static StringBuilder upadatedstring(StringBuilder stringBuilder, char c){
        for(int i =0 ; i<stringBuilder.length(); i++){
            if (stringBuilder.codePointAt(i)==c) {
                stringBuilder.deleteCharAt(i);
                
                
            }
        }
        return stringBuilder;
        
     
        
       
    }
    
    public static void main(String[] args) {
        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append("vedvant");
        char c='v';
        // upadatedstring(stringBuilder,c);
        System.out.println("the updated string after removing given charecter is " +  upadatedstring(stringBuilder,c));
     


        
    }
}
