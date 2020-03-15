import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class implementingSets {

    public static void main(String args[])
    {
        Set<String> hashSet= new HashSet<String>();
        String input = "Geeks for Geeks Example Set";
        String[] inputSplit = input.split(" ");

        for(int i=0; i<inputSplit.length;i++) {
            hashSet.add(inputSplit[i]);
        }

        System.out.print(hashSet);

        Set<String> treeSet = new TreeSet<String>(hashSet);
        System.out.println(treeSet);
    }
}
