public class JavaOverloadedMethods {
//    overloaded methods = methods that share the same name
//                        but different parameters
//                        signature=name+parameters
//    no two methids can shaare the same signature
    public static void main(String [] args){

        System.out.println("the  answer is: "+add(4,6)+"\n\n");;
        System.out.println("teh answer is:"+add(7,3,5)+"\n\n");

    }

    static double add(double a, double b){
        System.out.println("this is the first method");
        return a+b;
    }
    static double add(double a, double b,double c){

        System.out.println("this is the second method");
        return a+b+c;
    }
}
