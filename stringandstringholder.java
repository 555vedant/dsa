/**
 * stringandstringholder
 */
public class stringandstringholder {

    public static void main(String[] args) {
        // String series="";
        // for(int i =0 ; i<26; i++){
        //     char ch =(char)('a' +i);
        //     series=series+ch;
        // }
        // System.out.println(series);
     
        // System.out.printf("hey ! dear my name is %s and i want your %s" , "vedant" ,"kasar");
       StringBuilder builder =new StringBuilder();
       builder.append("vedant");
       builder.append("");
       builder.append("kasar");
       System.out.println(builder.toString());
    }
}