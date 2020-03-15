//print all the possible premutations of the given string
public class generatePermutations {

    public static void main(String[] Args)
    {
        String str = "ABC";
        int n = str.length();
        generatePermutations p = new generatePermutations();
        p.permute(str,0,n-1);
    }

    public void permute(String str, int l, int r) {

        if(l==r)
            System.out.println("The permutations of the given string are: "+str);
        else
        {
            for(int i=l;i<=r;i++)
            {
                str = swap(str,l,i);
                //System.out.println(str);
                permute(str,l+1,r);
                str= swap(str,l,i);
                //System.out.println(str);
            }
        }

    }

    public String swap(String str, int i, int j) {

        char temp;
        char[] ca = str.toCharArray();
        temp = ca[i];
        ca[i] = ca[j];
        ca[j]=temp;

        return String.valueOf(ca);

    }
}
