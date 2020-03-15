import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class operationsOnSet {


    public static void main(String[] args) {
        Set<Integer> a = new HashSet<Integer>();
        Set<Integer> b = new HashSet<Integer>();

       //List<Integer> lista = {1, 3, 2, 4, 8, 9, 0};
        //int[] listb = {1, 3, 7, 5, 4, 0, 7, 5};

        a.addAll(Arrays.asList(new Integer[]{1, 3, 2, 4, 8, 9, 0}));
        b.addAll(Arrays.asList(new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}));


        //To Find Union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println(union);

        //To find Intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println(intersection);

        //To find the symmetric difference
        Set<Integer> difference =  new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.println(difference);

    }



}
