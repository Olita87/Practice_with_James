package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class pre4 {

  /*  Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.


    pre4([1, 2, 4, 1]) → [1, 2]
    pre4([3, 1, 4]) → [3, 1]
    pre4([1, 4, 4]) → [1]

   */

    public static ArrayList<Integer> ints (ArrayList<Integer> nums){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i)==4){
                break;
            }else{
                list.add(nums.get(i));
            }

        }
        return list;

    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 4, 1));
        System.out.println(ints(nums));

    }
}
