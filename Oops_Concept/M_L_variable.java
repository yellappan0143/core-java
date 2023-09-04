// // IF DATA MEMBER AND FUNCTION MEMBER ASSIGNED BY "STATIC" AND "STATIC" ONLY ACCESING MEMBERNAME

// package OOPS;

// public class M_L_variable 
// {

//     // DATA MEMBER IS STATIC
//     static int A = 500;        // STATIC PRIMITIVE VARIABLES
//     static String Sub;        // NON-STATIC REFERENCE VARIABLES


//     // FUNCTION MEMBER OR METHOD IS STATIC
//     public static void test() 
//{
//         int A =100;             // NON-STATIC LOCAL PRIMITIVE VARIABLES
//         String Sub = "SQL";    // NON-STATIC LOCAL REFERENCE VARIABLES

//         System.out.println(A);
//         System.out.println(Sub);

//         System.out.println(M_L_variable.A);    // CALLING FROM DATA MEMBER
//         System.out.println(M_L_variable.Sub);  // CLASSNAME.MEMBERNAME
       

        
//     }

//     public static void main(String[] args) {
//         test();

//     }
// }


// // IF DATA MEMBER AND FUNCTION MEMBER ASSIGNED BY "NON-STATIC" AND "STATIC" WITH THE HELP OF CREATING "OBJECT"

// package OOPS;

// public class M_L_variable 
// {
//     // DATA MEMBER IS NON-STATIC
//      int A = 500;        // NON-STATIC PRIMITIVE VARIABLES
//      String Sub;        // NON-STATIC REFERENCE VARIABLES

//     // FUNCTION MEMBER OR METHOD IS STATIC
//     public static void test() {
//         int A =100;             // NON-STATIC LOCAL PRIMITIVE VARIABLES
//         String Sub = "SQL";    // NON-STATIC LOCAL REFERENCE VARIABLES

//         System.out.println(A);
//         System.out.println(Sub);

//         System.out.println(new M_L_variable().A);    // ACCESSING THE DATA FORM DATA MEMBER 
//         System.out.println(new M_L_variable().Sub);  //  NEW CLASSNAME().MEMBERNAME
        
//     }

//     public static void main(String[] args) {
//         test();

//     }
// }

// IF DATA MEMBER AND FUNCTION MEMBER ASSIGNED BY "STATIC" AND "NON-STATIC" WITH THE HELP OF CREATING "OBJECT"

package OOPS;

public class M_L_variable 
{
    // DATA MEMBER IS STATIC
     static int A = 500;        // STATIC PRIMITIVE VARIABLES
    static String Sub;        // STATIC REFERENCE VARIABLES

    // FUNCTION MEMBER OR METHOD IS NON-STATIC
    public  void test() {
        int A =100;             // NON-STATIC LOCAL PRIMITIVE VARIABLES
        String Sub = "SQL";    // NON-STATIC LOCAL REFERENCE VARIABLES

        System.out.println(A);
        System.out.println(Sub);

        System.out.println(this.A);    // ACCESSING THE DATA FORM DATA MEMBER 
        System.out.println(this.Sub);  //  THIS.MEMBERNAME / NEW CLASSNAME.MEMBERNAME
        
    }

    public static void main(String[] args) { 
        // BY CREATING THE OBJECT IN MAIN METHOD IS NEW CLASSNAME.MEMBERNAME

        new M_L_variable().test();

    }
}

// // IF DATA MEMBER AND FUNCTION MEMBER ASSIGNED BY "NON-STATIC" AND "NON-STATIC" WITH THE HELP OF CREATING "OBJECT"

// package OOPS;

// public class M_L_variable 
// {
//     // DATA MEMBER IS NON-STATIC
//       int A = 500;        // NON-STATIC PRIMITIVE VARIABLES
//       String Sub;        // NON-STATIC REFERENCE VARIABLES

//     // FUNCTION MEMBER OR METHOD IS NON-STATIC
//     public  void test() {
//         int A =100;             // NON-STATIC LOCAL PRIMITIVE VARIABLES
//         String Sub = "SQL";    // NON-STATIC LOCAL REFERENCE VARIABLES

//         System.out.println(A);
//         System.out.println(Sub);

//         System.out.println(this.A);    // ACCESSING THE DATA FORM DATA MEMBER 
//         System.out.println(this.Sub);  //  THIS.MEMBERNAME
        
//     }

//     public static void main(String[] args) { 
//         // BY CREATING THE OBJECT IN MAIN METHOD IS NEW CLASSNAME.MEMBERNAME

//         new M_L_variable().test();

//     }
// }