

//import Scanner class  to allow  use scanner
import java.util.Scanner;

public class Lesson2UserInput {
    public static  void main (String [] args){

//        create scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("enter your name dwag.. input  two  names:");
        String name= input.nextLine();
        System.out.println(name);

//        nextLine reads Strin of characters including spaces
//        next() only takes the string of characters before a whitespace
        // using next()
       /* System.out.print("enter your name try  using two names:");
        String noSpaces= input.next();
        System.out.println(noSpaces);*/

//        to get integer   input
        System.out.print("enter your age here:");
        int age=input.nextInt();
        System.out.println(age);
//for double
        System.out.println("whats your height: ");
        double height= input.nextDouble();
        System.out.println(height);
//        for boolean
        System.out.println("are you a student(true/false):");
        boolean isStudent =input.nextBoolean();
        if(isStudent){
            System.out.println("you are a student");
        }else {
            System.out.println("you are not a student");
        }


        System.out.println("//////////////////*********/////");
        System.out.println("Hey "+name +" you are. it's "+isStudent+" you are a student " + age +" years old.  And "+height+" tall.");





        // COMMON  ISSUES
        Scanner in =new Scanner(System.in);
        System.out.println(" enter the total of colors captured");
        int total= in.nextInt();
        in.nextLine();// comment this out and run the program to see . this here solves the issue of skiping the line  prompting the user to enter their favourite color
         System.out.println("Enter your favourite color");
        String color= in.nextLine();

        System.out.println("You have selected "+total+" colrs.your favourite color is: "+ color);


        // done when  you are done using the Scanner Class
        input.close();
        in.close();
    }
}
