public class JavaMethods {
    //        method block of reusable code that is executed when called ()
//creating a method
/*
void methodNmae(){
    statements
    }
    since the method will be called in the main method which is static then the  static key wordis used in  creatin the new mwthod hence
     static void methodName(){
         statement
         }
 */
    public static void main (String []args){


//calling the method
    happyBirthday();
//    calling method with parameters ,, passing arguments to method call
// the argument  can also be a variable in the calling method  as lomg as its set in the  parameter
        int age=25;
        happyBirthday2("john",age);

//        calling the method with return
        double result =square(3);
        System.out.println(result);

        System.out.println(getFullname("john ","Muriungi"));

//age check
        if(ageCheck(age)){
            System.out.println("You may sign up now");
        }
        else{
            System.out.println("You have  to be 18+");
        }



    }
    static void happyBirthday(){
        System.out.println("Happy birthday to you!");
        System.out.println("Happy birthday dear you!");
        System.out.println("you are X years old");
        System.out.println("Happy birthday to you!\n");

    }
//    method with parameters
//    remember to pass the data type on the parameters
//    parameters   are comma separated
//    the name of the parameters can be different from the arguments name
//   as long as the data type and the order remain eg String name could be person and it will still workout

    static void happyBirthday2(String name, int age){

        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n",name);
        System.out.printf("you are %d years old\n",age);
        System.out.println("Happy birthday to you!\n");
    }
//using a method that returns something
//    use the  datatype in the method header insteadof void
//    eg double  square()
static double  square(double number){
    System.out.println("using a method that returns a value:  ");
     return number *number ;
}

// a  method that returns the full name
    static  String getFullname(String first, String last){
        return first +" "+last;
    }
//    method to check age of someone
    static  boolean ageCheck(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }


}
