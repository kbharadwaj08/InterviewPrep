public class reverseString {
    public static void main(String[]  Args)
    {
        //Reverse the entire string
        String str = "Hello World!";
        String rev = "";

        for (int i = str.length()-1; i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        //split the string based on the " " character
        String[] temp = rev.split(" ");
        StringBuffer sb = new StringBuffer();

        //reverse the words to it original position
        for (int j=temp.length-1; j>=0;j--)
        {
            sb.append(temp[j]);
            sb.append(" ");
        }

        System.out.println("The reversed string is : "+ sb);
    }
}
