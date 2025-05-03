package LearningWithExercises;
import java.util.Scanner;

public class Exercise1 {
//    write a program that takes in the number of family members, then asks  each member's age  then calculates the  total  family age and the average of there ages ;


public  static void main (String [] args ) {
//     initialize variables  here
    int age = 0;
    int totalAge = 0;
    double averageAge = 0;
    byte numberOFMembers = 0;


    Scanner input = new Scanner (System.in);

    System.out.print("enter number of members in your family :");
    numberOFMembers = input.nextByte();

    byte x;
 
       
        System.out.print("Enter the first person's age:");
        age = input.nextInt();
        input.nextLine();
        totalAge += age;
        x=1;
  while (x <numberOFMembers){
         System.out.println("Enter the next age");
        age=input.nextInt();
        totalAge+=age;
        x++;

    }
  averageAge= totalAge/numberOFMembers;
    System.out.println("the total number of peples in your family is: "+x+" Their total age is: "+totalAge +"\n"+" the average age is: "+averageAge);


}
}
