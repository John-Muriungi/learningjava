import java.util.Scanner;

public class UserInputIntoArrays {
    public static void main(String [] args){
//        before assigning values in the  compiler must now the size of the arrays
// instantiating an empty array
        String[] foods= new String[3];

//        assigning the  values manually
//        foods[0]="Pizza";
//        foods[1]="taco";
//        foods[2]="hamburger";


//        allowing user to enter the values
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i < foods.length; i++) {

            System.out.println("Enter a food");
            foods[i]=scanner.nextLine();

        }

        for (String food : foods ){
            System.out.print(food+ " ");
        }



    }

}
