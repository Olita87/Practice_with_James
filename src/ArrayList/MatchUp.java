package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MatchUp {
    /*

Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.


matchUp([1, 2, 3], [2, 3, 10]) → 2
matchUp([1, 2, 3], [2, 3, 5]) → 3
matchUp([1, 2, 3], [2, 3, 3]) → 2
     */

    public static void main(String[] args) {

        ArrayList<Integer> one = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> two = new ArrayList<>(Arrays.asList(2, 3, 10));
        int count = 0;

        for (int i = 0; i < one.size(); i++) {
            int indexesOfOne = one.get(i);
            int indexesOfTwo = two.get(i);
            int sum = indexesOfOne - indexesOfTwo;

            if (sum==-1||sum==1||sum==2||sum==-2){
                count++;
            }
            System.out.println(count);
        }


    }
}
