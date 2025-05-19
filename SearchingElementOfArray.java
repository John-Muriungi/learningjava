import java.util.Scanner;

public class SearchingElementOfArray {
    public static void main(String [] args){
//         Searching the  elements of an array

        int []numbers={1,3,2,45,5};
        int target=4;
        boolean isFound=false;
//        using linear search

        for (int i = 0; i < numbers.length ; i++) {
            if (target == numbers[i]) {
                System.out.println("Element found at  index: " + i);
                isFound=true;
                break;

            }


        }
        if(!isFound){
            System.out.println("Element was not found");
        }

//        Searching a String element of an array and allowing a user to search the fruit of their choice
        Scanner scanner=new Scanner(System.in);
        String target1;
        boolean fruitFound=false;
        String [] Fruits={"Apples", "Orange", "Banana"};

        System.out.print("Enter a fruit to search: ");
        target1= scanner.nextLine();


        for (int i = 0; i < Fruits.length; i++){


            if (target1.equalsIgnoreCase(Fruits[i])){
                System.out.println("The element "+ target1 +" was found at index: "+i);
                fruitFound=true;
                break;
            }
            if (!fruitFound){
                System.out.println("Fruit not found");
                break;

            }


        }


        scanner.close();

    }
}
