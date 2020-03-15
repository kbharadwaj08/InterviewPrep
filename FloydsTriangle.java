public class FloydsTriangle {
    public static void main (String[] Args)
    {
        int i,j,n=15, num=1; //n represents the depth of the floyd's triangle

        System.out.println("Floyd's Triangle :-");

        for(i=1;i<=n;i++) { //outer loop controls the number of number being printed in each row
            for (j = 1; j <= i; j++) { //inner loop controls the number being printed in each row
                System.out.print(num + " ");
                num++; //after each print the number is incremented for printing next number
            }
            System.out.println();// after the inner loop exits , this add a new line for the triangle
        }
    }
}
