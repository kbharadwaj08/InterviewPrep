//this was the program during interview @ impelsys

public class floydsTriangleAlteration {

    public static void main(String[] args)
    {
        int rows = 10;
        int count=1;

        while(count<= rows)
        {
            for(int i=1;i<=count;i++)
            {
                System.out.print("*");
            }
            count++;
            System.out.println();
        }

    }
}
