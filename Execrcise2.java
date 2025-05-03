package LearningWithExercises;

/*
create a shopping cart program.the user is able to enter the item set  a price for each item  as for the quantity of the product.
The system should give you a total based on the  values entered.
 */

import  java.util.Scanner;
public class Execrcise2 {
    public static void main (String []args ){
 //shoopping cart program
        Scanner scanner = new Scanner (System.in);

        String item;
        double price;
        int quantity;
        char currency ='$';

        System.out.print("what item would you line to buy ");
        item= scanner.nextLine();

        System.out.print("Enter the price for each");
        price=scanner.nextDouble();

        System.out.print("How many would you like :");
        quantity= scanner.nextInt();
        scanner.close();


    }
}
