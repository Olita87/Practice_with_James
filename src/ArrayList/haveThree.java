package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class haveThree {
    /*
    Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.


haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false

     */

    public static Boolean hasThree (ArrayList <Integer> nums) {
        int count = 0;

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == 3 && nums.get(i + 1) != 3) {
                count++;
            }
            if (nums.get(i) == 3 && nums.get(i + 1) == 3) {
                return false;
            }
        }
        if (nums.get(nums.size() - 1) == 3) {
            count++;

        }
        if (count == 3) {
            return true;


        }
        return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(3, 1, 3, 1, 3));
        System.out.println(hasThree(arr));
    }


}
