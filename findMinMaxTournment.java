public class findMinMaxTournment {

    static class Pair{
        int min;
        int max;
    }

    public static void main(String[] Args)
    {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        Pair minmax = tournamentMethod(arr,0,arr.length-1);
        System.out.println("MAX in the array is: "+minmax.max);
        System.out.println("MIN in the array is: "+minmax.min);
    }

    public static Pair tournamentMethod(int[] arr, int high, int low) {
        Pair minmax = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();
        int mid;

        if(high == low)
        {
            minmax.max = arr[low];
            minmax.min = arr[low];
            return minmax;
        }

        if(high == low+1)
        {
            if(arr[low] > arr[high])
            {
                minmax.min = arr[high];
                minmax.max = arr[low];
            }
            else
            {
                minmax.min = arr[low];
                minmax.max = arr[high];
            }

            return minmax;
        }

        mid = (low + high)/2;
        mml = tournamentMethod(arr,low,mid);
        mmr = tournamentMethod(arr,mid,high);

        if(mml.min < mmr.min)
            minmax.min = mml.min;
        else
            minmax.min = mmr.min;

        if(mml.max > mmr.max)
            minmax.max = mml.max;
        else
            minmax.max = mmr.max;

        return minmax;

    }
}
