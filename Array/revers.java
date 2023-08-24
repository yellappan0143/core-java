// WAJP PRINT REVERS NUMBERS FORMATE USING ARRAY CONCEPT 


public class revers {

    public static void check(int[] a) {

        for (int index = a.length - 1; index >= 0; index--) { // THIS CONDITION  DECEREMENT OPERATORS IS USED TO REVERS 
            System.out.print(a[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] List = { 1, 2, 3, 4, 5 };

        check(List);
    }

}
