public class VarargsVariableArguments {
    public static void main(String[]args){
        /*varargs=> variable arguments
                    allow method to accept a varying number of arguments
              they   make  methods  more  flexible, no need for overloaded methods
              method overload is having a method with same names but different parameters
                java packs the arguments into an array
                add > ...(ellipsis)

         */
//        System.out.println(add(1,2,3,3));
        System.out.println(average(1,2,2,23));
        System.out.println(average());//passing no arguments

    }
//    static int add(int... numbers){
//
//
//    int sum=0;
//
//    for(int number:numbers){
//        sum+=number;
//    }
//
//    return  sum;
//
//    }
    static double average(double... numbers){
        double sum =0;
        if(numbers.length==0){
            System.out.print("no argument passed hence answer is");
            return 0;
        }

        for(double number: numbers){
            sum+=number;

        }
    return sum / numbers.length;
    }
}

