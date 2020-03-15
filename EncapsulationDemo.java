//java program to demostrate Encapsulation

public class EncapsulationDemo {

    private String gname;
    private int groll;
    private int gage;

    public int getAge()
    {  return gage; }

    public String getName()
    { return gname; }

    public int getRoll()
    {  return groll;  }

    public void setAge(int age)
    {
        gage = age;
    }

    public void setName(String name)
    { gname = name; }

    public void setRoll(int roll)
    { groll = roll;}

}

class TestEncapsulation{

    public static void main(String[] Args)
    {
        EncapsulationDemo ed = new EncapsulationDemo();
        ed.setAge(15);
        ed.setName("Kiran");
        ed.setRoll(64);

        System.out.println("The Age is : "+ed.getAge());
        System.out.println("The Name is : "+ed.getName());
        System.out.println("The Roll is : "+ed.getRoll());

        //direct access of Gname, groll, gage is not possible
        //it can be accessed only via public methods
    }
}
