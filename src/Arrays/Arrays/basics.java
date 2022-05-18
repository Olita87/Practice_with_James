package Arrays.Arrays;

import java.util.Arrays;

public class basics {
    public static void main(String[] args) {

        int [] arr = new int[3];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        System.out.println(Arrays.toString(arr));// Arrays.toString (is a must to be able to print an Array
        System.out.println(arr[0]);

        String [] arr1 = new String[arr.length];
        arr1[0]= "one";
        arr1[1]="two";
        arr1[2]= "three";

        System.out.println(arr1[0].charAt(0));

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        for (int i = arr.length-1; i >=0; i--) {
            System.out.println(arr[i]);

        }


    }
}
