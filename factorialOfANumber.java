public class factorialOfANumber {

    public static void main(String[] Args)
    {
        int fact=0;
        int n = 9; // the factorial of the number to be calculated
        fact = factorial(n); // calculating the factorial of a number recurssivly;
        System.out.println("Factorial of "+n+" is "+fact);


    }

    private static int factorial(int n) {
        if(n == 0)
            return 1;
        else
            return (n * (factorial(n-1))); //here we are calculating the factorial of given n recurrsively , once the n reaches zero, if will fall to if branch and 1 is returned.
    }

}
