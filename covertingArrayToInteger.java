public class covertingArrayToInteger {

    public int convertArrayToInt(int arr[])
    {
        int n=arr.length;
        int num=0;

        for(int i=0;i<=n-1;i++)
        {
            num= num*10 + arr[i];
        }
        return num;
    }

    public int[] convertIntToArray(int num, int s)
    {
        int[] arr = new int[s];
        int temp=0;
        for(int i=s-1;i>=0;i--)
        {
            temp=num%10;
            arr[i]=temp;
            num=num/10;
        }
        return arr;
    }

    public void printArray(int arr[])
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int arr[]={9,5,5,6};
        int num=0;
        covertingArrayToInteger obj = new covertingArrayToInteger();

        System.out.print("Input Array : ");
        obj.printArray(arr);
        num=obj.convertArrayToInt(arr);

        System.out.println("Converted Array to Integer: "+num);
        num=num+1;
        System.out.println("Sum after adding the value by 0ne : "+num);

        int[] brr = obj.convertIntToArray(num,arr.length);
        System.out.print("final output Array : ");
        obj.printArray(brr);

    }

}
