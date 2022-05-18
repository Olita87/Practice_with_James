package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeCodingBet {

    /*

Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.


commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true

     */
    public static void main(String[] args) {

        ArrayList<Integer> arrList1=new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> arrList2= new ArrayList<>(Arrays.asList(7,3));

        int firstIndexOf1=arrList1.get(0);
        int firstIndexOf2=arrList2.get(0);
        int lastIndexOf1=arrList1.get(arrList1.size()-1);
        int lastIndexOf2=arrList2.get(arrList2.size()-1);

        if(firstIndexOf1==firstIndexOf2||lastIndexOf1==lastIndexOf2){
            System.out.println("True");
        }else{
            System.out.println("False");
        }



    }


    }



