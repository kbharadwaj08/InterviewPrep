public class Parent {

    void print()
    {
        System.out.println("This is Parent Class");
    }

}

class subclass1 extends Parent{
    void print()
    {

        System.out.println("This is subclass1");
    }
}

class subclass2 extends Parent{
    void print()
    {System.out.println("This is subclass2");}
}

class Main3{
    public static void main(String[] Args)
    {
        Parent a = new Parent();
        a.print();
        a = new subclass1();
        a.print();
        a = new subclass2();
        a.print();
    }
}


