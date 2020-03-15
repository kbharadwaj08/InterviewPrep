import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

//remove duplicates from arraylist using Using LinkedHashSet
public class removeDuplicates {

public static void main(String[] args)
{
    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

    System.out.println("List of numbers before removal: "+list);

    ArrayList<Integer> newlist = removeDuplicatesHashMap(list);

    System.out.println("List of numbers after removal: "+newlist);
}

    public static <T> ArrayList<T> removeDuplicatesHashMap(ArrayList<T> list) {

        Set<T> newSet = new LinkedHashSet<T>();

        newSet.addAll(list);

        list.clear();

        list.addAll(newSet);

        return list;

    }

}
