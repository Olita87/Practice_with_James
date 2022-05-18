package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ModThree {

    /*

Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.


modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true
     */
    public static Boolean modThree(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size() - 2; i++) {
            if (nums.get(i) % 2 == 1 && nums.get(i + 1) % 2 == 1 && nums.get(i + 2) % 2 == 1) {
                return true;
            }
            if (nums.get(i) % 2 == 0 && nums.get(i + 1) % 2 == 0 && nums.get(i + 2) % 2 == 0) {
                return true;
            }
        }


        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 1, 3, 5));
        System.out.println(modThree(arr));
    }
}
