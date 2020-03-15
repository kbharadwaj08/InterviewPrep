class NewMultiply {

    static int multiply(int a ,int b)
    { return a*b;}

    static double multiply(double a, double b)
    { return a*b; }
}

class Main{

    public static void main(String[] Args)
    {
       NewMultiply a = new NewMultiply();
       System.out.println( a.multiply(2,3));
        System.out.println(a.multiply(3.3,4.4));
    }
}
