package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class post4 {
    /*

Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.


post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]
     */

    public static ArrayList<Integer> ints (ArrayList<Integer> nums){
        ArrayList<Integer> list = new ArrayList<>();
int indexOfFour= -1;

        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i)==4){
                indexOfFour=i;
            }

        }if(indexOfFour==-1){
            return list;

        }
        for (int i = indexOfFour+1; i < nums.size(); i++) {
            list.add(nums.get(i));

        }
        return list;

    }

    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(2, 4, 1, 2));
        System.out.println(ints(nums));
    }

}

