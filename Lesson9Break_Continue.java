public class Lesson9Break_Continue {

    //break=break out of loop(STOP)
    //continue= skip current iteration of loop(SKIP)
    public static  void main(String[]args){


        // break
        for (int i =0; i<10; i++){
            if(i==8){
                break;
            }
            //continue
            if(i==5){
                continue;
            }
            System.out.print(i+", ");
        }

    }
}
