//THis is to explain inheritance feature in OOPS
class Bicycle {

    //these are the fields on the bicycle class
    public int speed;
    public int gears;

    //this is a constructor class for the bicycle
   public Bicycle(int gears, int speed)
   {
       this.gears=gears;
       this.speed=speed;
   }

   public void applyBrake(int decrement)
   {
       speed -= decrement;
   }

   public void speedUp(int increment)
   {
       speed +=increment;
   }

   public String toString()
   {
       return("No of gears are " + gears + "\n" + "speed of bicycle is: "+ speed);
   }

}

class MountainBike extends Bicycle{

    public int seatHeight;

    public MountainBike(int gears,int speed, int startHeight)
    {
        super(gears, speed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    public String toString()
    {
        return(super.toString() + "\n Seat Height = " + seatHeight);
    }
}

class Test
{
    public static void main(String[] Args)
    {
        MountainBike mb = new MountainBike(3,100,5);
        System.out.println(mb.toString());
    }
}
