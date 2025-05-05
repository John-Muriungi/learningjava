public class Theprintfmethod {
    public static void main (String [] args ){
        // working with the printf()

        /*
        printf()=> this is a method  used to format output.
        with this method we have to manually add a new line everytime \n
         %[flags][width][.precision][specifier-character]
         [flag]

         [.precision] . limits the number of decimals in a  double.. look at precision  deeper below




            specifier characters ...
           String >%s
           char >%c
           double > %f
           int > %d
           boolean >%b;

               */
        String name= "John Muriungi" ;
        char firstLetter= 'J';
        int age = 22;
        double height =5.3;
        boolean isEmployed= false;
        System.out.printf(" your name is %s\n", name);
        System.out.printf("Your first letter is %c \n", firstLetter);
        System.out.printf("you are %d\n", age);
        System.out.printf("you are %f tall\n", height);
        System.out.printf("Employed: %b \n",isEmployed);

        //using two variables
        System.out.print("two variables in printf\n ");
        System.out.printf("%s is %d years old\n",name,age);

        System.out.println("##########>>>>>>>>>>>>>");
        System.out.println("working with precision on the %f");


        // working with precision
        //normally when  using the %f we usually have six digits as the output to change that we use presicion
        //for one digit %.1f, for two %.2f;

        double price1=9000.99;
        double price2 =100000.15;
        double price3= -54000.01;

        System.out.printf("%.1f\n",price1);
        System.out.printf("%+.2f\n",price2);
        System.out.printf("%+.4f\n",price3);


        // flags

     //   + = output a plus
        System.out.printf("%+.2f",price1);


     //   , = comma grouping
        System.out.println("comma grouping");
        System.out.printf("%,.2f",price1);

     //   (= negative numbers enclosed in ()
        System.out.println("parenthesisi () for the negative");
        System.out.printf("%(.2f\n",price1);
        System.out.printf("%(.2f\n",price2);
        System.out.printf("%(.2f\n",price3);

       // space = display a minus if negative,space if positive
        System.out.printf("% .2f\n",price1);
        System.out.printf("% .2f\n",price2);
        System.out.printf("% .2f\n",price3);

//[width]
        int id1=1;
        int id2=23;
        int id3=456;
        int id4=7890;

        System.out.printf("%d\n",id1);
        System.out.printf("%d\n",id2);
        System.out.printf("%d\n",id3);
        System.out.printf("%d\n",id4);


//        0= zero padding
        // the second number is the maximum number of digits available
        System.out.println("zero padding");

        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);
//        number = right justified padding
        System.out.println("right padding .. rather than having these zeros we have spaces ");
        System.out.printf("%4d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);
//        negative number =left justified padding

        System.out.printf("%-4d\n",id1);
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);

    }
}
