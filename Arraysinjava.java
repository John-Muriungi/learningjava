import java.util.Arrays;

public class Arraysinjava {
//    array is a collection of values of homogenous data type
//    => variable that  can store more than one  value
//    it's a reference type of data type ... stores the memory address not the values
//
//     datatype [] nameOfArray={"values", "values", "values", "values"};
//    String [] fruits= {"apple","orange","banana", "coconut"};
// the values in an array are called elements
//   they   are accessed using index numbers  with the first index being index 0
//    fruits[1]

    public static  void main(String []args){

//  creating an array
        String [] fruits= {"apple","orange","banana", "coconut"};

//        printing an arrays out= arraybname[index]
        System.out.println(fruits[0]);



//        changing value of a given index
        fruits[0]="Guava";
        System.out.println("changed value of index 0");
        System.out.println(fruits[0]);



//        getting the lenth of an array== to numbmerr of elements in an array

        int length= fruits.length;
        System.out.println("the elngth of the array is:"+length);


        //        printing out all the elements of an array
                        // FOR LOOP
        System.out.println("Printing all elements of an array using for loop");
        for(int i =0; i<fruits.length;i++){
            System.out.println(fruits[i]);

        }

                // ENHANCED FOR LOOP/for each loop
        System.out.println("Printing all elements of an array using an enhanced for loop /for each loop");
        for (String fruit: fruits){
            System.out.println(fruit);
        }


//        Sorting arrays
//        we use the Sort method in the Array class
//        we therefore have to import the arrays class
        Arrays.sort(fruits); // sorts  alphabetically

//        filling an array with a given value...
//        Arrays.fill(arrayName,value);
        Arrays.fill(fruits,"Pineapple");
        for (String fruit: fruits ){
            System.out.println(fruit);
        }







    }
}
