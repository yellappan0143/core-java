// WRJP MAKE A CALCULATOR AND CREATE A OBJECTS WITH NON -STATIC METHOD
package OOPS;


class Calculator 
{
    public void Addition() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Addition of a+b is" + " " + c);
    }

    public void Subraction() {
        int a = 10;
        int b = 20;
        int c = a - b;
        System.out.println("Subraction of a - b is" + " " + c);
    }

    public void Multplication() {
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println("Multplication of a * b is" + " " + c);
    }

    public void Division() {
        int a = 10;
        int b = 20;
        int c = a / b;
        System.out.println("Division of a / b is" + " " + c);
    }
    public void Modulus() {
        int a = 10;
        int b = 20;
        int c = a % b;
        System.out.println("Modulus of a % b is" + " " + c);
    }
    public void total() {
        Addition();
        Subraction();
        Division();
        Multplication();
        Modulus();
    }

}

public class object_create {
    public static void main(String[] args) {
            // CREATE MULTIPLE OBJECTS
        //   new Calculator().Addition();
        //   new Calculator().Subraction();
        //   new Calculator().Division();
        //   new Calculator().Multplication();
        //   new Calculator().Modulus();

           // ARE ELSE CALL ONE METHOD / FUNCTIONS

           new Calculator().total();
    }

}
