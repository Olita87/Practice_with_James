package String_practice;

import java.util.ArrayList;

public class ArrayListProblems<listOne> {

    public static void main(String[] args) {
        ArrayList<Integer> listOne = new ArrayList<>();
        listOne.add(1);// at index 0
        listOne.add(2);
        listOne.add(3);
        listOne.add(4);// at index 3
        listOne.remove(3);
        listOne.add(0);

        int num1 = listOne.get(0);
        int num2 = listOne.get(3);
        listOne.add(0, num2);
        listOne.add(4,num1);


        System.out.println(listOne);


    }


}