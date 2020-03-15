public class secondSmallestinArray {

    public static void main(String[] args)
    {
        int a[] = {65,43,28,5,9,55,21,71,19,3};
        int smallest = a[0];

        for(int i=0;i<a.length-1;i++)
            if(a[i+1] < a[i])
                smallest = a[i+1];
                System.out.println(smallest);
            int secondSmallest = a[0];
            for(int j=0;j<a.length-1;j++)
                if(a[j] < secondSmallest && a[j] != smallest )
                    secondSmallest = a[j];

                System.out.println(secondSmallest);
    }

}
