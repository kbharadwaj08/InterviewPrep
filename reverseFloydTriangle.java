public class reverseFloydTriangle {
    public static void main(String[] Args)
    {
        int i,j,n=9,num=1; // here n represents the depth of the floyd's triangle and num represents the numbers

        int start_val = n *(n+1)/2; // this gives us the last number of the floyd's triangle to start with a depth of n

        System.out.println("Floyd's reverse Triangle:- ");

        for(i=n;i>=1;i--)
        {
            for(j=i; j>=1; j--)
            {
                System.out.print(start_val+ " ");
                start_val--;
            }
            System.out.println();
        }
    }
}
