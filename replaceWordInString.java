//Replace a substring inside a string by another one ?
public class replaceWordInString {

    public static void main(String[] a)
    {
        String input = "Selenium is the best Automation Tool";
        String searchWord = "best";
        String replaceWord = "bestest";
        StringBuffer sb = new StringBuffer();

        System.out.println(input);

        String[] arr = input.split(" ");

        for(int i=0; i<=arr.length-1;i++)
        {

            if(arr[i].equals(searchWord))
                sb.append(replaceWord);
            else
                sb.append(arr[i]);

            sb.append(" ");
        }

        System.out.println(sb);
    }
}
