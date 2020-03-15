public class reverseWords {

    public static void main(String[] args)
    {
        String input = "Selenium Automation";
        String rev = " ", Temp = " ";
        //split the input string based on char " " and add the words to array
        String[] arr = input.split(" ");
        //assign each word to temp variable and then reverse it
        for(int i=0;i<=arr.length-1;i++)
        {
            Temp = arr[i];
            // reverse each word
            for(int j=Temp.length()-1;j>=0;j--)
            {
                rev=rev+Temp.charAt(j);
            }
            rev = rev + " ";
        }
       System.out.println(rev);
    }

}
