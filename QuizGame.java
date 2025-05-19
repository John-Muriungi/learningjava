package LearningWithExercises;

import java.util.Scanner;

public class QuizGame {
    public static void main(String [] args){

            //java quiz game
        //question array[]
        //options array[][]
        //declare variables
        //welcome message
        //question message
//        question(loop
//        options
        // get guess from user
        //check our guess
        //display final score

        String []questions={
                "What is the main function of a router?",
                "Whic part of a computer is considered the brain?",
                "What yearwas facebook launched?",
                "Who is known as the father of computers",
                "What was the first programming language?"
        };
        String [][] options={
                {"1. Storing files ","2. Encrypting data","3. Directing office traffic","4. Managing passwords"},
               {"1. CPU ","2. hardDrive ","3. RAM ","4. GPU"},
                {"1. 2000 ","2. 2004 ","3. 2006","4. 2008 "},
                {"1. Steve Jobs ","2. Bill Gates ","3.Alan Turing ","4. Charles Babbage "},
                {"1. COBOL ","2. C ","3. Fortran ","4. Assembly "}
        };
        int[]answers={1,2, 3, 4,3};
        int score=0;
        int guess;

        Scanner scanner=new Scanner(System.in);
        System.out.println("******************************************");
        System.out.println("Welcome to java Quiz game! ");
        System.out.println("******************************************");

        for (int i=0;i< questions.length;i++){
            System.out.println(questions[i]);
            for (String option:options[i]){
                System.out.println(option);
            }
            System.out.println("Enter your guess:");
            guess=scanner.nextInt();

            if (answers[i]==guess){
                System.out.println("******************************************");
                System.out.println("Correct!");
                System.out.println("******************************************");
                score++;
            }
            else {
                System.out.println("******************************************");
                System.out.println("Wrong");
                System.out.println("******************************************");
            }


        }
        System.out.println("Your score is "+score+" out of "+questions.length);





        scanner.close();






    }
}
