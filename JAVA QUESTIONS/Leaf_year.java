// WAJP TO FIND A LEAF YEAR BU USING IF ELSE CONDITION STATEMENT
 class Leaf_year
 {
    public static String leaf_years(int year) {
        if(year%4==0 || (year%100==0 && year%400==0) )
        {
             return"This year is "+year+" a leaf year";
            }else{
            return"This year is "+year+" not a leaf year";
        }
    }

    public static void main(String[] args) {
         System.out.println(leaf_years(2000));
         System.out.println(leaf_years(2001));
         System.out.println(leaf_years(2002));
         System.out.println(leaf_years(2004));
         System.out.println(leaf_years(2005));
       
    }
 }