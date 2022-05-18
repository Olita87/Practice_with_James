package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Has77 {
    /*

Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.


has77([1, 7, 7]) → true
has77([1, 7, 1, 7]) → true
has77([1, 7, 1, 1, 7]) → false

     */
    public static Boolean has77(ArrayList<Integer> arrList) {
        for (int i = 0; i < arrList.size()-1; i++) {
            if(arrList.get(i)==7&&arrList.get(i+1)==7){
                return true;

            }

        }
       return false;

    }


    public static void main(String[] args) {
        ArrayList<Integer>arr1=new ArrayList<>(Arrays.asList(1,7,1));
        has77(arr1);

        System.out.println(has77(arr1));

    }
}
