// COUNT EVEN AND ODD NUMBERS USING ARRAY CONCEPT

public class count_oe { // OE MEANS ODD AND EVEN

    public static void checkout(int[] A) {
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i <= A.length - 1; i++) {

            if (A[i] % 2 == 0) // THIS IF CONDITION IS FILTER THE EVEN NUMBERS

                countEven++; // TOTAL COUNT THE EVEN NUMBERS
            else
                countOdd++; // TOTAL COUNT THE ODD NUMBERS

        }
        System.out.println("Count Of Even Numbers " + countEven);
        System.out.println("Count Of Odd Numbers " + countOdd);

    }

    public static void main(String[] args) {
        // INITILIZATION OF ARRAYS
        int[] Arrya_List = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21 };
        checkout(Arrya_List);
    }
}
