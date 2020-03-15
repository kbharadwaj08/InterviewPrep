public class reverseWordString {
    public static void main(String[] Args)
    {
        String str = "Hello Damn World!"; //Input String
        String[] arr = str.split(" "); //Splitting the String in Array
        StringBuffer sb = new StringBuffer(); //Defining string buffer

        for(int i=arr.length-1;i>=0;i--)
        {
            sb.append(arr[i]);
            sb.append(" ");
        }

        System.out.print(sb);
    }
}
