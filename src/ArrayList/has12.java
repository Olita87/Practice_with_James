package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class has12 {
    /*

Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.


has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true

     */

    public static Boolean has12 (ArrayList<Integer> arr1){

        for (int i = 0; i < arr1.size()-1; i++) {
            if(arr1.get(i)==1){
                for (int j = i+1; j < arr1.size(); j++) {
                    if(arr1.get(j)==2){
                    return true;

                }

                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer>new1= new ArrayList<>(Arrays.asList(1,3,2));
        System.out.println(has12(new1));
    }

}
