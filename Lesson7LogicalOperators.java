public class Lesson7LogicalOperators {
    public static void main(String []args ){
        /* LOGICAL OPERATORS IN JAVA
            - They allow us to check or modify more than one condition.They include :
            && = AND checks more than one condition.. all the tested condition should be true
            || = OR..tests  between two conditions .. one of them must be true for the code to be executed
            ! = NOT... checks to see if the condition is not true/ false


         */

        double temp=2000;
        boolean isSunny=true;
        if (temp<=30 && temp>=0 && isSunny){
            System.out.println("the weather is amazing today ");
            System.out.println("its sunny outside");
        }
        else if (temp <=30 && temp>=0 && !isSunny){
            System.out.println("The Weather is Good \n" +
                    "Its Cloudy outside ☁");
        }
        else if (temp>30||temp<0){
            System.out.println("The weather is bad 😢");
        }

    }
}
