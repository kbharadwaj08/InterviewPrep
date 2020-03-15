//How to Remove Duplicates from ArrayList in Java

import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicatesArrayList {

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
        System.out.println("List of number before removal: "+list);

        ArrayList<Integer> newlist = removeDuplicates(list);

        System.out.println("List of Numbers after removal: "+newlist);
    }

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {

        ArrayList<T> newlist = new ArrayList<T>();

        for(T element : list)
        {
            if(!newlist.contains(element))
                newlist.add(element);
        }

        return newlist;
    }


}
