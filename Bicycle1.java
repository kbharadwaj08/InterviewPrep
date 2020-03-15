interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle1 implements Vehicle {

    int speed;
    int gear;

        public void changeGear(int newGear)
    { gear = newGear;}

    public void speedUp(int increment)
    {speed = speed + increment; }

    public void applyBrakes(int decrement)
    {speed = speed - decrement;}

    public void printStates()
    {
        System.out.println("Speed: "+ speed+"gear: "+ gear);
    }

}

class Bike implements Vehicle{

    int speed;
    int gear;

    public void changeGear(int newGear)
    { gear = newGear;}

    public void speedUp(int increment)
    {speed = speed + increment; }

    public void applyBrakes(int decrement)
    {speed = speed - decrement;}

    public void printStates()
    {
        System.out.println("Speed: "+ speed+"gear: "+ gear);
    }
}

class GFG
{
    public static void main(String[] args)
    {
        Bicycle1 bicycle1 = new Bicycle1();
        bicycle1.changeGear(4);
        bicycle1.speedUp(5);
        bicycle1.applyBrakes(1);
        bicycle1.printStates();

        Bike bike = new Bike();
        bike.changeGear(14);
        bike.speedUp(15);
        bike.applyBrakes(11);
        bike.printStates();

    }
}
