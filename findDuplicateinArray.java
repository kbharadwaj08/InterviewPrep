public class findDuplicateinArray {
    public static void main(String[] Args)
    {
        int[] arr = {3,4,5,6,3,4};
        int i,j;

        for(i=0;i<arr.length;i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println("Duplicate found for: " + arr[i]);
            }
        }
    }
}
