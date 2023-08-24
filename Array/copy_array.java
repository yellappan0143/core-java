//WAJP  COPY THE GIVEN ARRAY AND PAST ARRAY 

class copy_array {

    public static void check(int[] array) {

        int[] result = new int[array.length]; // CALCULATE THE ARRAY LENGTH

        for (int i = 0; i <= array.length - 1; i++) {
            // COPY THE GIVEN ARRAY
            result[i] = array[i];
            System.out.print(result[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] pass = { 10, 20, 30, 40 };
        check(pass);

    }

}
