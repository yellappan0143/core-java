// WAJP GENERATE A ELECTRIC BILL.BELOW 200 RETURN ZERO.TAKE USER INPUTS
import java.util.Scanner;

public class electric_bill {

    public static void EB(int[] EB_bill) {
       
        for(int i =0 ; i<= EB_bill.length-1; i++)
        {
            if(EB_bill[i]>=0 && EB_bill[i]<=200)
            {
                System.out.println("bill = "+ 0);
            }
             if(EB_bill[i]>=201 && EB_bill[i]<=300)
            {
                double bill = EB_bill[i]*6;
                bill = bill + bill *0.18;
                System.out.println("bill = for " +EB_bill[i]+"units is = "+ bill );
            }
             if(EB_bill[i]>=301 )
            {
               int bill = EB_bill[i]*7;
                System.out.println("bill = for " +EB_bill[i]+"units is = "+ bill);
            }
            else{
                System.out.println("");
            }
        }


      
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.println("How Many Bill To Pay");

        // int no_of_bill = sc.nextInt(); // SIZE OF ARRAY
        System.out.println("enter no of bills ");
        int no = sc.nextInt();
         System.out.println("enter units");
        int[] units = new int[no]; // ARRAY BUCKETS

        System.out.println("Enter the amount");

        for (int j = 0; j <= units.length - 1; j++) {

            units[j] = sc.nextInt(); // TAKE THE ARRAY INTO SCANNER INPUTS

        }

        EB(units);

        sc.close();

    }
}
