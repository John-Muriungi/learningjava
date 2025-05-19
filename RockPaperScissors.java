package LearningWithExercises;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static  void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        String [] choices={"Rock",  "paper", "scissors"};
        String playersChoice;
        String computerChoice;
        String playAgain="yes";

      do {
          System.out.print("Enter your move(Rock, paper, scissors): ");
          playersChoice=scanner.nextLine().toLowerCase();
          if (!playersChoice.equals("rock")
                  &&!playersChoice.equals("paper")
                  &&!playersChoice.equals("scissors")){
              System.out.println("Invalid choice");
              continue;
          }
          computerChoice=choices[random.nextInt(3)];
          System.out.println("computer choice: "+computerChoice);
          if(playersChoice.equals(computerChoice)){
              System.out.println("It's a tie");
          } else if ((playersChoice.equals("rock")&&computerChoice.equals("scissors"))||
                  (playersChoice.equals("paper")&&computerChoice.equals("rock"))||
                  (playersChoice.equals("scissors")&&computerChoice.equals("paper"))) {

              System.out.println("You win!");


          }else {
              System.out.println("You loose!");
          }
          System.out.println("play again(yes/no)");
          playAgain=scanner.nextLine().toLowerCase();
      }while(playAgain.equals("yes"));

        System.out.println("Thanks for playing");
    }

}
