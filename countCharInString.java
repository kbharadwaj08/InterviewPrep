//Occurrence of character in a String

public class countCharInString {

    static final int MAX_SIZE = 256;

public void countChar(String str)
{
    int[] count = new int[MAX_SIZE];
    int len = str.length();


    for(int i=0;i< len;i++)
        count[str.charAt(i)]++;

    char ch[] = new char[len];
    for(int i =0;i<len;i++) {
        ch[i] = str.charAt(i);
        int find = 0;
        for(int j=0; j<=i;j++) {
            if (str.charAt(i) == ch[j])
                find++;
        }
         if(find == 1)
             System.out.println("Character count of "+str.charAt(i)+" is " +count[str.charAt(i)]);
    }

}

public static void main(String[] args)
{
    String str = "varu is also know as duru";
    countCharInString obj = new countCharInString();
    obj.countChar(str);
}

}
