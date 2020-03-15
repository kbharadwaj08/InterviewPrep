public class primeNumbers{

   public static void main(String[] args){
       int i, mid, flag = 0;

       int n=57;
       mid = n/2;
        //eliminating the 1 and 0 as prime number
       if (n == 0 || n==1)
           System.out.println(n + " is not a prime number");
       //verifying if the given number is a not a prime number
       //if the number is divided and has an remainder equal to zero
       // then it is not a prime number
       else
       {
           for(i=2; i<=mid;i++)
           {
               if(n%i == 0)
               {
                   System.out.println(n+" is not a prime number");
                   flag = 1;
                   break;
               }
           }
       }
        //if the number is not divisble by any other numbers then
       //this condition declares the given number as a prime number.
       if(flag == 0)
           System.out.println(n+" is a prime number");
   }


    
}
