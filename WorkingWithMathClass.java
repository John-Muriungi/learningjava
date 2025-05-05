
/*
working with the Math class we don't have to import the class since its in java.lang

  Math.PI=PRESENTS THE VALUE OF PI;
  Math.pow(x,y) this is x to the power of y
  Math.abs(x)// gives absolute value of the number x
  Math.sqrt(x) gives the square root of x
  Math.round(x) gives value to the nearest whole integer

  Math.ceil(x) rounds up
  Math.floor(x) rounds down to the smallest whole integer value of a number x
  Math.max(x,y) gives out he biggest number among the two
   MAth.min(x,y) gives out he smallest  number among the two
 */


import java.util.Scanner;



public class WorkingWithMathClass {
    public static  void main (String[] args){
//        System.out.println(Math.PI);
//        System.out.println(Math.pow(2,4));

/*
  write a program where  the system asks which sides value is missing. the user should indicate  hypotenuse with ' c ',
  if i ts the base then it's represented by 'a' if it's the height it's represented by  'b ' .
  The program then asks for the available values depending on the answer given  by the user.
  The program should then calculate the missing sides length  correctly. and give the value back to the  user


the formula is
 c = sqrt(a² + b²)
 b= sqrt(c² - a²)
 a = sqrt(c² - b²)
  */

        double a,b,c;
        char misingSide=' ';

        Scanner userInput=new Scanner(System.in);


        System.out.print("""
         this is a program for calculating the values of missing side of  a right-angled triangle. enter the misiing \s
         for hypotenuse enter 'c'\s
         for base enter 'a'\s
         for height enter 'b'\s
          :""");
        misingSide=  userInput.next().charAt(0);


    // I have used  switch statement for this case
          switch (misingSide){
            case 'a':
               System.out.println(" enter the value of   height b:");
               b=userInput.nextDouble();
                     System.out.println(" enter the value for hypotenuse c:");
                   c = userInput.nextDouble();
                    a = Math.sqrt(Math.pow(c, 2) - Math.pow(b,2));

                System.out.println(" the value of the base "+misingSide +" is: " +a);
                      break;

            case 'b':
                System.out.println(" enter the value of   base a:");
               a=userInput.nextDouble();
                     System.out.println(" enter the value for hypotenuse c:");
                     c=userInput.nextDouble();

                     b= Math.sqrt(Math.pow(c, 2) - Math.pow(a,2));

                      System.out.println(" the value of the base "+misingSide +" is: " +b);;
                   break;
            case 'c':
             System.out.println(" enter the value of   base a:");
               a=userInput.nextDouble();
                     System.out.println(" enter the value for height b:");
                   b=userInput.nextDouble();

                    c = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));

                     System.out.println(" the value of the base "+misingSide +" is: " +c);

                   break;

            default:
                System.out.println("enter a valid value  a, b or c");




         } 


    }
}
