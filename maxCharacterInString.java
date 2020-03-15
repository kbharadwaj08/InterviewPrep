//Find out maximum repeating character in a string?
public class maxCharacterInString {
    static final int ASCII_SIZE = 256;

    public static void main(String[] a)
    {
        maxCharacterInString maxChar = new maxCharacterInString();
        System.out.println("maximum occuring character in the given string is : "+maxChar.findMaxOccChar("ccaaabbr"));

    }

    public char findMaxOccChar(String str) {

        int count[] = new int[ASCII_SIZE];
        //Iterating through the array with the string characters
        int len = str.length();
        for(int i=0;i<len;i++)
            count[str.charAt(i)]++;

        int max=-1;
        char result = ' ';
        //iterating through array to find the max repeated character via count
        for(int i=0; i<len; i++)
        {
            if(max < count[str.charAt(i)])
            {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }

        }
        return result;

    }
}
