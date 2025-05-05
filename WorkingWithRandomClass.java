import java.util.Random;// importing the  Random class

public class WorkingWithRandomClass {
    public static void main(String[]args){

        Random random= new Random();
        int number;
        // ths will return a very huge number
        number= random.nextInt();
        System.out.println(number);
//        to limit the number
        int number1=random.nextInt(1,6);
        /*
        //one being the origin and 6 being the bound ,,,
         from 1 to 6, the first parameter is the origin/the  starting  and the second value is the bound / the end
        the first number is inclusive
        the second number is exclusive i.e: no matter how many times you run  program>
                                            you will never have the second number as a value
        so for random numbers between 1 and 10.. we will have the  random.nextInt(1,11);
         */

        System.out.println(number1);
        //generating doubles
        System.out.println("Working with random doubles ");
        double number2;
        number2= random.nextDouble();
        System.out.println(number2);


        System.out.println("Working with booleans ");
        boolean isworking;
        isworking= random.nextBoolean();
        System.out.println(isworking);
    }
}
