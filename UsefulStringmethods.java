import java.util.Locale;

public class UsefulStringmethods {
    public static void main(String [] args){


        String name ="John Muriungi";



//length() method
        int length = name.length();
        System.out.println("the lenth of the string is"+length);

//        charAt() method... it returns a  character of a string at a given index
   char letter =name.charAt(1);
        System.out.println("the last character at index 1 is "+letter);


//indexOf() shows the index of the selected  letter
   int index= name.indexOf("o");
        System.out.println("this shows the index of 'o' "+index);

//   lastIndexOf() shows the last index of
   int lastIndex=name.lastIndexOf("i");
        System.out.println("this shows the last index wher 'i' "+lastIndex);

//        toUpperCase()..
        name=name.toUpperCase();
        System.out.println("the string in  upper case "+name);



//        toLowerCase()...
        name=name.toLowerCase();
        System.out.println("the string in lower case "+name);

//        trim() gets rid of the white space in the string
        String withoutWhiteSpace=name.trim();
        System.out.println(withoutWhiteSpace);

//        replace() will replace the a character of a string with another character ...
//        it takes in two values the first is the charcter to be replaced and the second is the  character to replace it
        String replace=name.replace("o","a");
        System.out.println(replace);


        //methods  that return a boolean value
//        isEmpty();
        System.out.println("this shows if the string is empty:"+name.isEmpty());

//        .contains() checks if the stringhas a said character

       if ( name.contains(" ")){
           System.out.println( "Your name contains spaces");
       }else{
           System.out.println("it does not contain spaces ");
       }

//       equals() checkds if  the two strings are the same
        name="password";
       if (name.equals("password")){
           System.out.println("the name cant be password");
       }else{
           System.out.println("hello "+name);
       }
   }

}
