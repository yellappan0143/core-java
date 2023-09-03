package OOPS;

class Account 
{ 
    // DATA MEMBERS
    long AcNo = 56789l;                       
    String Name = "Madesh";
    String Branch = "BTM";
    String IFSC = "ID000123";
    double Balance = 0.0;
    static String BankName = "Indian Bank";

    public void displaydetails() 
    {
        System.out.println(AcNo);
        System.out.println(Name);
        System.out.println(Branch);
        System.out.println(IFSC);
    }

      // FUNCTION MEMBER OR METHOD
    public static void displaybank() 
    {
        System.out.println(BankName);
    }

    // FUNCTION MEMBER OR METHOD
    public void deposite(double amt) 
    {
        if (amt >= 0) {
            Balance = Balance + amt;
            System.out.println("Current Balance is " + Balance);
        } else {
            System.out.println("Invalid Amount");
        }
    }
     // FUNCTION MEMBER OR METHOD
    public void withdraw(double amt) 
    {
        if (amt >= 0 && Balance >= amt) 
        {
            Balance = Balance - amt;
            System.out.println("current Balance " + Balance);
        } 
        else{
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        // OBJECT CREATION TO OVER COMES THIS USE REFERENCE VARIABLES

        // new Account().displaydetails();  // <-- AVOID THIS OBJECT CREATION

        // REFERENCE VARIABLES
        Account Madesh = new Account();
        Madesh.displaydetails();
        Madesh.deposite(5000);
        Madesh.withdraw(500);

        System.out.println("--------------------------");
        Account Fire = Madesh;
        Fire.displaydetails();
        Fire.withdraw(4000);

    }
}
