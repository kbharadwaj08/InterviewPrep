public class findCommonInArray {

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6};
        int[] arr1 = {8,6,4,9,2};

        for(int i=0; i<= arr.length-1 ; i++)
            for(int j=0; j<= arr1.length-1; j++)
                if(arr[i] == arr1[j])
                    System.out.print(arr[i]+",");
    }
}
