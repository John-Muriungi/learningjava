import java.util.Scanner;

public class Lesson8ForLoops {
    public static void main(String []args) throws InterruptedException {
//        for loop== code is executed a CERTAIN  number of times

//        SYNTAX
        /*
        for(initialization;condition;iteration){
        code;

        }
        the initialization=> counter, decaring a variable
                            > alsocalled loop control variable
        condition=>result is boolean value,,executed as long as it is true
        iteration=> update of the counter can be ++ or --
         */
//        create a count-down  timer that asks the user to enter the number of seconds for the count down

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the  number of seconds you want to countdown");
        int countdownSeconds= scanner.nextInt();

        for (int i=countdownSeconds;  i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);// thread class used..thats why our main method contaons an execption
        }
        System.out.println("Happy new Year");
// using the increment statement we can increase bu=y a give number eg:
//     by two  i+=2;
//        by four i+=4;
    }
}
