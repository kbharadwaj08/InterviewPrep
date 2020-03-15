public class palindromeNumber {

    public static void main(String[] Args)
    {
        int r, rev=0;
        int n = 45540554; //number to be checked for palindrome
        int temp = n; //storing the number for later comparision

        while(n>0)
        {
            r=n%10; //here we are collecting the last digit which will be remainder of the modulos function
            rev = (rev * 10)+ r; //here we are reversing the given number n
            n=n/10; // one the digits from the right end is collected we remove it by moving the decimal point to the left.

        }

        if(temp == rev)
            System.out.println(temp+" is a palindrome");
        else
            System.out.println(temp+" is not a palindrome");


    }
}
