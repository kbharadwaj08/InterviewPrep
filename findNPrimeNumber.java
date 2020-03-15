//Program to find sum of prime numbers between 1 to n

public class findNPrimeNumber {

    public static void main(String[] args)
    {
        int n=30;
        System.out.println("THe list of prime numbers between 0 to "+n+" are: ");
        sieve(n);
    }

    public static void sieve(int n) {

        boolean arr[] = new boolean[n+1];

        for(int i =0; i<=n; i++)
            arr[i] = true;

        for(int p=2; p*p <= n;p++)
        {
            if(arr[p] == true)
            {
                for(int i=p*p;i<=n;i=i+p)
                    arr[i] = false;
            }
        }

        for(int k=2;k<=n;k++)
        {
            if(arr[k] == true)
                System.out.println(k);
        }
    }
}
