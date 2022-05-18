package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class alone {

    /*

We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it. Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.


notAlone([1, 2, 3], 2) → [1, 3, 3]
notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
notAlone([3, 4], 3) → [3, 4]
     */

    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>(Arrays.asList(1, 2, 3, 2, 5, 2));
        System.out.println(nums(list,2));



        }

        public static ArrayList<Integer> nums (ArrayList<Integer> list, int x){

            for (int i = 1; i <list.size()-1 ; i++) {
                if(list.get(i)==x){
                   int before= list.get(i-1);
                   int after = list.get(i+1);
                   if(before>after){
                       list.set(i,before);
                   }else{
                       list.set(i, after);
                   }
                }

            }
        return list;
        }

    }




