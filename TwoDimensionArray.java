public class TwoDimensionArray {
//    multidimensional arrays
//    2D  arrays=> an array where each element  is an array
//                  useful for matrix of data

    public static void main(String [] args){


        String [][] groceries={     {"fruits", "orange","banana"},
                                    {"potato", "onion", "carrot"},
                                     {"chicken", "pork","fish"}
                                };
//        accessing a single element
//        groceries[i][j]
//        the fist index represents row the second represents columns

         groceries[0][0]="pineapple";
         groceries[2][1]="egg";


        for(String[]foods:groceries){
            for(String food:foods){
                System.out.print(food+" ");
            }
            System.out.println();

        }
        char [][]telephone={{'1','2','3'},
                            {'4','5','6'},
                             {'7','8','9'},
                             {'*','0','#'}};
        for (char []numbers:telephone){
            for(char number :numbers){
                System.out.print(number+" ");
            }
            System.out.println();
        }






    }

}
