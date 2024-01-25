package oop;

public class projectbankingsystem {
    /**
     * 
     */
    class customer {
        String name;
        String address;
       private int cID;
       String saccounttype;
       String caccounttype;

     
      public void name(String n) {
        this.name=n;

        
      }
      public void address(String add) {
        this.address=add;

        
      }
      public void setter(int ID){
        this.cID=ID;

      }
      public int get() {
        return cID;

        
      }
      public void saccounts(String type) {
        this.saccounttype=type;

        
      }
      public void caccounts(String type) {
        this.caccounttype=type;

        
      }
      



    
        
    }
    class accounts extends customer{
         int accountnumber;
        int balance;
        
          public void deposite(int n ) {
            this.balance=balance+n;
            System.out.println("your current balance after the deposite of certain amount is" + this.balance);

            
          }
          public void withdraw(int n ){
            if (n< balance) {
                this.balance=balance-n;
                System.out.println("now your balence is after withdraw" +this.balance );
                
            }
          }
          public void balancecheck() {
            this.balance=balance;
            System.out.println("the balance is " + balance);

            
          }

       
       


    }
    class saccounts extends accounts{
        private double intrestrate;
        public saccounts(int accountnumber , int balance ,customer c , double intrestrate){
                 
        }
    }

     class caccounts extends accounts{


     }

     class bank extends customer{
        //this method is for opning account in which everspecific account
        public void openaccount(String accname) {
            
            
        }
     }
}
