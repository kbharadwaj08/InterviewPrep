public class palindromString {

    public static void main(String[] a)
    {
        String input = "hooooot";
        String rev = "";

        for(int i=input.length()-1; i>=0;i--)
        {
            rev = rev+ input.charAt(i);
        }
        if(rev.equals(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
