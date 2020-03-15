import java.util.Arrays;
import java.util.HashMap;

//Count the number of occurrences of each character in a string
public class countOccurance {

   public static void main(String[] args)
   {
       String str = "bcdebcaaa";
       HashMap<Character,Integer> map = new HashMap<Character, Integer>();
       int maxCount = 0;
       Character maxChar = ' ';
       Character currentChar;

       for(int i=0;i<str.length();i++) {
           currentChar = str.charAt(i);

           if(map.containsKey(currentChar))
               map.put(currentChar,map.get(currentChar)+1);
           else
               map.put(currentChar,1);

       }

       System.out.println(map);
   }
}
