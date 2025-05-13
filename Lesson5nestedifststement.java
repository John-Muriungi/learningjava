import java.util.Scanner;

public class Lesson5nestedifststement {
    public static  void main (String [] args){
        /*
        nested if statement... this  control statement contains if statements within if statement
the nested condition is only when the condition is true if found in the if block,
if its is in the else block then is executed if the condition is false
 the nested if my comprise of if() statement
 else if statement  and also the else statement.
         */




        /*
        write a program tha a bank uses to determine the credibility of a customer...
        the criteria for  f=giving credit is
            1.The customer must have credit score > 700;
            2. the customer must have salary > 45000;
               if less by just 10000 and meets all the other conditions approve, but it needs at least 1 guarantor trustee
               if less by just 20,000 and meets all other conditions approve, but  the client need 5 guarantors
            3. must be employed for years >=2 years

         the system should ask for input of the credit score monthly salary and the years of employment
          use if statement to create / build  ths program

         */

        int creditScore=0;
        double monthlySalary=0,
                yearsWorked=0;

        Scanner userInput=new Scanner(System.in);


        System.out.print(" enter your credit Score here please: ");
        creditScore= userInput.nextInt();


        System.out.print("Enter the number of years you have been employed: ");
        yearsWorked= userInput.nextDouble();

        System.out.print("Enter your monthly salary: ");
        monthlySalary= userInput.nextDouble();




        if(creditScore>700){
            if (yearsWorked>=2){
                if(monthlySalary>45000){
                    System.out.println("Congratulations!! You qualify for the loan applied ");

                }else if (monthlySalary >= 35000){
                    System.out.println("allowed ON CONDITION that there is at least one grantor  ");
                }else if(monthlySalary <35000 && !(monthlySalary<25000)) {
                    System.out.println("loan granted  only on condition that you have at least 5 grantors ");
                }else {
                    System.out.println("Denied on account of low monthly income");
                }
            }
        }else{
            System.out.println("Denied, low credit Score!!");
        }




    }
}
