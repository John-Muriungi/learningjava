import java.util.Scanner;

public class Lesson10NestedLoop {
    public static void main(String[]args){
//        nested loop= A loop inside another loop
//                    used often with matrices or DS&A(data structures and algorithms)
//        for (int i = 1; i <=3 ; i++) {
//            for (int j = 0; j < 9; j++) {
//                System.out.print(j+" ");
//
//            }
//            System.out.println(i);
//
//        }

        // creating a matrix
        Scanner scanner=new Scanner(System.in);

        int rows,columns;
        char symbol;
        System.out.print("Enter the number  of rows: ");
        rows= scanner.nextInt();

        System.out.print("Enter the number  of columns: ");
        columns= scanner.nextInt();

        System.out.print("Enter the number  of symbol: ");
        symbol= scanner.next().charAt(0);
        for (int j= 0; j<rows;j++){
        for (int i = 0; i <columns;i++){
            System.out.print(symbol);
        }
            System.out.println();}
    }}
