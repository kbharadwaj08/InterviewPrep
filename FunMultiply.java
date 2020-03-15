class FunMultiply {

    void print(int a, int b)
    {
        System.out.println(a*b);
    }

    void print(int a, int b, int c)
    {
        System.out.println( a*b*c); }
}

class Main1{
    public static void main(String[] Args)
    {
        FunMultiply a = new FunMultiply();
        a.print(2,3);
        a.print(2,3,4);
    }
}