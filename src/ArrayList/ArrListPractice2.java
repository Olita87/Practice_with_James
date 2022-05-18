package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrListPractice2 {


    /*

Given an array of ints length 3, return the sum of all the elements.


sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));

        int one=list.get(0);
        int two= list.get(1);
        int three= list.get(2);
        int sum =one+two+three;
        System.out.println(sum);
    }
}
