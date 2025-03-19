class test {
    public static int minSteps(int n) {
        if(n ==1 ){
            return 0;
        }
        int ans = 0;
        for(int i=2 ; i<=Math.sqrt(n) ; i++ ){
             if(n % i == 0){
                ans = ans + i;
                n = n /3;
                i=i-1;
                
             }
             
             
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(minSteps(9));
    }
}