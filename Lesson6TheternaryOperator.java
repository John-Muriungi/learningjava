public class Lesson6TheternaryOperator {
    public static void main( String [] args ){

        /*      ternary operator
        ? = return 1 of 2 values if a condition is true
         variable=(condition) ? ifTrue:ifFalse;
         consider it as a simpler version of if else  statement


         */
        int score=50;
        System.out.print("Testing using  if statement: ");
        if(score >=65){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
//THIS CAN BE REPLACED WITH A TERNARY OPERRATOR

        System.out.print("Testing using the ternary operator: ");
        String passOrFail=(score >=65)?"PASS":"FAIL";
        System.out.println(passOrFail);

    }
}
