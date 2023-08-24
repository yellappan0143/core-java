// WAJP PRINT EVEN AND ODD NUMBERS USING ARRAY CONCEPT

class array_eo { // EO - MEANS EVEN AND ODD 

    public static void check(int[] Array) {

        System.out.println("Even Numbers : ");
        // PRINT EVEN NUMBERS
        for (int i = 0; i <= Array.length - 1; i++) {
            if (Array[i] % 2 == 0) { // THIS IF CONDITION IS FILTER THE EVEN NUMBERS
                System.out.println(Array[i]);
            }
        }

        System.out.println("Odd Numbers : ");
        for (int j = 0; j <= Array.length - 1; j++) {
            if (Array[j] % 2 != 0) // THIS IF CONDITION IS FILTER THE ODD NUMBERS
            {
                System.out.println(Array[j]);

            }
        }

    }

    public static void main(String[] args) {
        int[] Passing = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        check(Passing);

    }

}