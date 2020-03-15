import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class findTheNearestPrimeNumber {

    public static void main(String[] args) throws java.lang.Exception {
        try {

            int realNo;
            Scanner sc = new Scanner(System.in);
            realNo = sc.nextInt(); // reading the real number

            findNearest(realNo);


        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static boolean isPrime(int n) {
        int mid = n / 2;

        if (n == 0 || n == 1)
            System.out.println(n + " itself is a prime number"); //verifying given number is 0 and 1, which are prime numbers

        for (int i = 2; i <= mid; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void findNearest(int realNo) {

        int l = realNo - 1, r = realNo + 1;
        int lflag = 0, rflag = 0;
        while (l > 0 && r < 100) {

            /* if (remainder == 0) {
                System.out.println(remainder);
                System.out.println(realNo + " itself is a prime number"); //verifying if the given number itself is a prime number
                break;
            }*/
            if (isPrime(l)) {
                lflag = 1;
            }
            else
                l--;
            if (isPrime(r)) {
                rflag = 1;
            }
            else
                r++;

            if (lflag == 1 && rflag == 1)
                break;
        }
        if (realNo - l >= r - realNo) {
            System.out.println("The nearest prime number to the input is: " + r + " which is " + (r - realNo) + " away from the input number " + realNo);
            System.out.println("while is also available " + l + " which is " + (realNo - l) + " away from the input number " + realNo);
        } else {
            System.out.println("The nearest prime number to the input is: " + l + " which is " + (realNo - l) + " away from the input number " + realNo);
            System.out.println("While is also available " + r + " which is " + (r - realNo) + " away from the input number " + realNo);

        }

    }
}


