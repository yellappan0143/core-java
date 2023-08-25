// WAJP FIND THE ELEMENT WHICH IS MAXMIUM AND MINIUM TO GIVEN ARRAY LIST

class Q1_Array
{
    public static void maximum(int[]a) {
        int max= a[0];
        int min= a[0];
        for(int i=0;i<a.length;i++) //  JUST CHECK THE ITERATION
        {
            if(a[i]>=max) // FILTER THE CONDITION  MAXIMUM
            {
                max=a[i]; //  THIS CONDITION IS JUST HOLD THE MAXMIUM VALUE AFTER CHECKING THE LIST OF ARRAY WHICH IS MAXMIUM
            }

            if(a[i]<= min) // FILTER THE CONDITION  MINIUM 
            {
                min=a[i]; //  THIS CONDITION IS JUST HOLD THE MINIUM VALUE AFTER CHECKING THE LIST OF ARRAY WHICH IS MAINIUM
            }
        }
        System.out.println("Maximum element of array is = "+max);
        System.out.println("Minium element of array is = "+min);
    }

    public static void main(String[] args) {
        // INITILIZATION  THE ARRAY
        int [] array = {25,12,11,10,57,74,90};
        maximum(array);
    }
}