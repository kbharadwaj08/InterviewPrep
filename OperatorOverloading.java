public class OperatorOverloading {

    void print(int a, int b)
    {System.out.println("SUM = " + (a+b));}

    void print(String s1, String s2)
    { System.out.println("Concatinated String : " + (s1+s2));    }
}

class Main2{
    public static void main(String[] Args)
    {
        OperatorOverloading a = new OperatorOverloading();
        a.print(2,3);
        a.print("The","Boss");
    }
}
