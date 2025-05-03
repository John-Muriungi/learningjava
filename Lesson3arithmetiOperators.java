public class Lesson3arithmetiOperators {
    public static void main(String[]args){
/*
there   arithmetic operators include
    - addition +
    -subtraction -
    multiplication*
    division /
    modulus %
 */
        double num1=10.0;
        double num2= 3.0;
        double output=0;

        output=num1 + num2;
//        output= num2 - num2;
//         output = num1 / num2;
//         output=num1 * num2;
//         output=num1 % num2;

        System.out.println(output);

//ARGUMENT ASSIGNMENT OPERATOR
        /*
        - addition +=
    -subtraction -=
    multiplication *=
    division /=
    modulus %=
         */

        int x =100;
        int y =20;

        x+=y; //same as x= x + y;
//        x-=y; //same as x= x - y;
//        x*=y; //same as x= x * y;
//        x/=y; //same as x= x / y;
//        x%=y; //same  sa x = x % y;
//
        System.out.println(x);

//INCREMENT AND DECREMENT  OPERATORS

   int a=1;
   a++;//icreament
//   a--;//decrement
        System.out.println(a);

        //ORDER OF OPERATIONS [P-E-M-D-A-S]
        /*
        PARENTHESIS
        EXPONENTS  
        MULTIPLICATION
        DIVISION
        ADDITION
        SUBTRACTION
         */

double result = 3+4*2/2.0;
        System.out.println("the result of the  calculation is " +result);



    }
}
