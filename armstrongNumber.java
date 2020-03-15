import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;
//An Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits.
public class armstrongNumber {
    public static void main(String[] Args)
    {
        int a,c=0,temp;
        int n = 1633; //checking if the n is armstrong number
        temp = n; //storing it to verify later if the sum is equal to n

        int order = orderOf(n);
        System.out.println("number of digits in the given number is: "+order);

        while(n>0)
        {
            a=n%10; //collecting each digit as a remainder of the given number n
            n=n/10; //moving the decimal point to the left after collecting the digit as remainder
            c= c + powerOf(a,order); //taking the cube value of the digit collected and adding it to check the sum of digits;
        }

        if (temp == c)
            System.out.println(temp+" is an Armstrong Number");
        else
            System.out.println(temp+" is NOT an Armstrong Number");
    }

    public static int orderOf(int n) {

        int digits =0;
        while(n!=0)
        {
            n = n/10;
            digits++;
        }
        return digits;
    }

    public static int powerOf(int i,int multiplier) {

        int value = (int) Math.pow(i,multiplier);

        return value;
    }
}
