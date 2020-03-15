import java.util.Stack;

public class QueuesTesting {

    public static void main(String[] args)
    {
        Stack<Integer> s1 = new Stack<Integer>();

        s1.push(1);
        s1.push(5);
        s1.push(6);

        System.out.println(s1.peek());
        System.out.println(s1.lastElement());

        s1.capacity();
         }
}
