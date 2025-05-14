package LearningWithExercises;

import java.util.Random;
import java.util.Scanner;

public class DiceRolling{
    public static void main(String []args){
//     java dice roller program

        Scanner scanner= new Scanner(System.in);
        Random random= new Random();
        int numberOfDice;
        int total=0;


        // get number of dice from the user
        System.out.print("enter the number of dice to roll: ");
        numberOfDice= scanner.nextInt();
        if (numberOfDice > 0) {
            for (int i=0; i<numberOfDice; i++){
                int roll= random.nextInt(1, 7);
                printDie(roll);
                System.out.println("Rolled "+roll);
                total+=roll;
            }
            System.out.println("total: "+total);
        }
        else{
            System.out.println("number of dice must be greater than zero");
        }

    }
    static void printDie(int roll){
        String dice1= """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                
                """;
        String dice2= """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                
                """;
        String dice3= """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                
                """;
        String dice4= """
                 -------
                | ●    ●|
                |       |
                | ●    ●|
                 -------
                
                """;
        String dice5= """
                 -------
                | ●    ●|
                | ●    ●|
                | ●    ●|
                 -------
                
                """;
        String dice6= """
                 -------
                | ●    ●|
                |   ●   |
                | ●    ●|
                 -------
                
                """;

        switch (roll){
            case 1-> System.out.println(dice1);
            case 2-> System.out.println(dice2);
            case 3-> System.out.println(dice3);
            case 4-> System.out.println(dice4);
            case 5-> System.out.println(dice5);
            case 6-> System.out.println(dice6);
            default -> System.out.println("invalid roll");
        }

    }
}
