import java.util.Scanner;

public class UsefulStringMethods_SubString {
    public  static void main(String [] args){
//        substring()= a method that is used to extract a portion if  a string
//        .substring(Start, end);the  start is the beginning index its inclusive, the end is ending index its exclusive
//        NOTE: the index start at 0




        // String email="jm1232@gmail.com";
        // String userName= email.substring(0,6);
        // System.out.println("the username is "+userName);
       // String domain=email.substring(7,16);
        // if you want all the characters that come after the said index  you just enter the index no need of the ending index
//        the domain above can  be written as :
//        domain=email.substring(7);
       // System.out.println("the domain is "+domain);





        /* EXERCISE EMAIL SLICER PROGRAM

           write a program tha asks the user to enter their email.then the system takes in the  email and first checks
           if it has the "@" character  then it displays the username and the domain
           otherwise it informs the user it Should contain the '@' character
         */


        Scanner input= new Scanner( System.in);
        String userEmail;
        String userName;
        String  domain;

        System.out.print("Hello there!\n" +
                "Enter your email  here :");
        userEmail=input.nextLine();
        if(userEmail.contains("@")){
                    userName=userEmail.substring(0,userEmail.indexOf("@"));
                    domain=userEmail.substring(userEmail.indexOf('@')+1);
            System.out.println("the username is: " +userName);
            System.out.println("the domain is: "+ domain);
        }else {
            System.out.println(" your email MUST contain the '@' character ");
        }






}
}
