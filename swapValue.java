public class swapValue {
    //swap value without using the third variable
    public static void main(String[] Args)
    {
        int a=15, b=19;

        System.out.println("Before Swap => a:"+a+" b:"+b );
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap => a:"+a+" b:"+b);
    }

}
