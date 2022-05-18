package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class twoTwo {
    /*

Given an array of ints, return true if every 2 that appears in the array is next to another 2.


twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false

     */

    public static Boolean twoTwo (ArrayList<Integer> nums){

        for (int i = 0; i < nums.size(); i++) {
       if(nums.get(i)==2){
           i++;
           if(nums.get(i)!=2){
               return false;
           }
       }
        }


        return true;

    }

    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(4, 2, 2, 3));
        System.out.println(twoTwo(arr));
    }
}
