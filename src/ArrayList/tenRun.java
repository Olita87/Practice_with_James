package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class tenRun {


    /*

For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.


tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
     */

     public static ArrayList<Integer> tenRUn (ArrayList<Integer> list){

         for (int i = 1; i < list.size(); i++) {
             if(list.get(i)%10!=0){
                 if(list.get(i-1)%10!=0){
                     continue;
                 }else{
                     list.set(i,list.get(i-1));
                 }

             }

         }
return list;


     }

    public static void main(String[] args) {
        ArrayList<Integer> arrList= new ArrayList<>(Arrays.asList(2, 10, 3, 4, 20, 5));
        System.out.println(tenRUn(arrList));
        }
    }


