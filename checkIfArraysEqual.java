public class checkIfArraysEqual {

    public static void main(String[] args)
    {
        int a[]={22,3,44,25,19,48};
        int b[]={22,3,25,19,48};
        int flag =1;

        if(a.length != b.length)
            System.out.println("The Two arrays are not equal!");
        else
        {
            for(int i=0;i<=a.length-1;i++)
            {
                if(a[i] != b[i])
                    flag = 0;
            }

            if(flag == 1)
                System.out.println("The two given arrays are equal");
            else
                System.out.println("The two given arrays are not equal");
        }


    }
}
