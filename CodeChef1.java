import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef1
{
    public static void main (String[] args) throws java.lang.Exception
    {
       try {
           int n = 0;
           Scanner sc = new Scanner(System.in);


           while (true) {
               n = sc.nextInt();
               if (n == 42)
                   break;
               else
                  System.out.println(n);
           }
       }
       catch(Exception e)
        {
            System.out.println(e);
        }

    }
}