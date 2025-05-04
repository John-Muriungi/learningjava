public class Lesson4IfStatements {
    public static void main(String []args){

//NB WHEN TESTING A CONDITION USE DOUBLE EQUAL SIGN  IE (==)this is great for integers
// OR YOU CAN REPLACE THIS WITH [.equals("the string")]
//        if statements => performs aBLOCK OF CODE WHEN A CONDITION IS TRUE

// THE CONDITION IS A BOOLEAN IE.IT CAN BE TRUE OR FALSE
      /*  if(CONDITION){
            STATEMENT
        }
        */
        int age=10;
        String weather="sunny";

        if(weather.equals("sunny")){
            System.out.println("its sunny today.put 0n some light clothes and  sunglasses for style");


        }
        /*
        if... else
        when the if condition is wrong the else block is executed instead
        syntax: if(condition){
        statement;
        }else{
        statement;}

         */
        System.out.println("######################################");
        System.out.println("this is the result of if---else statement");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        weather ="cloudy";
        if (weather.equals("sunny")){
            System.out.println("its sunny today.put 0n some light clothes and  sunglasses for style");
        }else{
            System.out.println("hey its not sunny try  carrying something heavy today");
        }

        /*
        //if-else-if
        It checks multiple conditions in sequence, the first true  condition's block is executed.
        if(condition){
        statement
        } else if(condition){
        statement
        }else if(condition){
        statement
        }



         */
        System.out.println("#################################");
        System.out.println(" output of the if-else-if statement");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        weather ="rainy";
        if(weather.equals("sunny")){
            System.out.println("its sunny today.put 0n some light clothes and  sunglasses for style");
        } else if(weather.equals("cloudy")){
            System.out.println("its cloudy  today.Carry some clothes just in case");
        }else if(weather.equals("rainy")){
            System.out.println("its Rainy today!!Put on a rain coat don't forget your umbrella");
        }




    }
}
