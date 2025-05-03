

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lesson1Variables {


        public static void main (String [] args){
//            variables in java
            /*
            two main branches  ie. primitive and reference variables
            primitive => stored directly  in memory (stack)
                        they include    boolean-  //can only contain true or false
                                        char -16bits  char single characters surrounded by single quote
                                        byte- 8 bits
                                        short 16bits
                                        int  32bits integers , contain whole numbers
                                        long 64bits
                                        float  32bits
                                        double  64bits numbers but can contain a decimal


            reference - store memory address to that points to the heap
             they include: strings=>series of characters surrounded by double quotes
                            array
                            objects

             */

//            declaring a variable
            int age;
//            assigning a  value
            age=10;
            char grade ='A';
            boolean isStudent= true;
            double price= 19999.99;
            char currency ='$';
            System.out.println(age);
            System.out.println(grade);
            System.out.println(isStudent);


            //strings
            System.out.println("Strings");
            String name=" John muriungi ";
            String email="funny@342@gmail.com";
            String color="red";


            /////////////////////////////////////////////
            System.out.println(name);
            System.out.println("hello "+name);//cocantenation
            System.out.println("hello "+name+" you are "+age+ " years old");



    }
}