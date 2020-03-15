public class removeWhiteSpaces {

    public static void main(String[] a)
    {
        String input = "Selenium is the best Automation Tool";
        StringBuffer sb = new StringBuffer();

        System.out.println(input);

        for(int i=0;i<=input.length()-1;i++)
            if(input.charAt(i) != ' ')
                sb.append(input.charAt(i));

            System.out.println(sb);

    }
}
