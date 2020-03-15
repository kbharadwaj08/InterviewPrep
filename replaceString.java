//Replace a character in the string with another given string like "test"
public class replaceString {

    public static void main(String[] args)
    {
        String input = "Selenium is the best Automation Tool";
        StringBuffer sb = new StringBuffer();

        System.out.println("String before replacement: "+input);

        for(int i=0; i<=input.length()-1;i++)
        {
            if(input.charAt(i) == ' ')
                sb.append("Test");
            else
                sb.append(input.charAt(i));
        }
        System.out.println("String after replacment: "+sb);
    }
}
