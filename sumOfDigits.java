public class sumOfDigits {

   static int sum = 0;
    public static void main(String[] Args)
    {
        int n = 55555; // the number for which the sum of its digits to be calculated
        System.out.println("The sum of digits "+n+" is "+caldigits(n));
    }

    public static int caldigits(int n) {
        if(n == 0)
            return sum;
        else {
            sum = sum + n % 10; //each digit is picked from the remainder and added to the sum
            caldigits(n/10);// here the decimal point is moved to left on each recurrsive iteration.
        }
        return sum;
    }
}
