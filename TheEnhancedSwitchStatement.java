import java.util.Scanner;

public class TheEnhancedSwitchStatement {
    public static void main(String[] args) {
//        enhanced switch statement=  used to replace many else if statement
//          it's a java 14 feature

     /*   String day = "Sunday";
        if(day.equals("Monday")){
            System.out.println("Today is a weekday");
        }else if (day.equals("Tuesday")){
            System.out.println("Today is a weekday");
        }
        else if(day.equals("Wednesday")){
            System.out.println("Today is a weekday");

        }
        else if (day.equals("Thursday")){
            System.out.println("Today is a weekday");
        } else if (day.equals("Friday")) {
            System.out.println("Today is a weekday");

        } else if (day.equals("Saturday")) {
            System.out.println("it is the Weekend");

        } else if (day.equals("Sunday")) {
            System.out.println("it is the Weekend");
        }
        else{

            System.out.println(day+"is not a valid day");
    }


    THIS ALL CODE CAN BE REPLACED WITH THE ENHANCED SWITCH STATEMENT
      */

//        ENHANCED SWITCH STATEMENT
        System.out.print("enter the day of the Week:");
        Scanner scanner= new Scanner(System.in);
        String day=scanner.nextLine();
        scanner.close();
        switch(day){
            case "Monday"-> System.out.println("it is a weekday");
            case "Tuesday"-> System.out.println("its a weekday");
            case "Wednesday"-> System.out.println("its a weekday");
            case "Thursday"-> System.out.println("its a weekday");
            case "Friday"-> {
                // curly braces allow you to  enter
                System.out.println("its a weekday");
            }
            case "Saturday"-> System.out.println("its a weekday");
            case "Sunday"-> System.out.println("its a weekday");
            default ->System.out.println(day+" is not a day");
        }
//        the default block is the same as the else statement
//        the above program can be written as
        switch(day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday"->
                    System.out.println("out put of the second advanced Switch satement: \n" +
                            "its a weekday");
            case "Saturday","Sunday"->
                    System.out.println("out put of the second advanced Switch satement: \n" +
                            "its a weekday");
            default ->
                    System.out.println(day+" is not a day");
        }
    }
}

