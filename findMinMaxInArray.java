
//finding min and max in an array
public class findMinMaxInArray
{

    static class Pair{
        int min;
        int max;
    }

    public static void main(String[] args)
    {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        Pair minmax = getMinMax(arr,arr.length);
        System.out.println("min number in the array is: "+minmax.min);
        System.out.println("Max number in the array is: "+minmax.max);
    }

    public static Pair getMinMax(int[] arr, int length) {

        Pair minmax = new Pair();
        int n= length-1,i;

        if(n == 1)
        {
            minmax.min = arr[0];
            minmax.max = arr[0];
            return minmax;
        }

        if(arr[0]>arr[1])
        {
            minmax.min = arr[1];
            minmax.max = arr[0];
        }
        else
        {
            minmax.min = arr[0];
            minmax.max = arr[1];
        }

        for(i=2;i<=n;i++)
        {
            if(arr[i] > minmax.max)
                minmax.max = arr[i];
            else if(arr[i] < minmax.min)
                minmax.min = arr[i];
        }

        return minmax;

    }


}
