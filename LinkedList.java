//Basics of LinkedList


class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.length();
        list.insert(1);
        list.insert(3);
        list.insert(5);
        list.insert(1);
        list.insertAt(list.head.next,5,4);
        list.suffix(7);
        list.suffix(9);

        list.show();
        list.length();

        list.delete(5);
        list.delete(7);

        list.show();
        list.length();

        list.insert(11);
        list.suffix(14);
        list.insertAt(list.head.next,3,12);


        list.show();
        list.length();
    }

    public void length() {

        int count =0;
        Node temp = head;

        if(temp == null)
        {
            System.out.println("list is empty");
            return;
        }
        while ( temp.next != null)
        {
            count++;
            temp = temp.next;
        }

        System.out.println("Length of the list is: "+ (count+1));
        return;

    }

    public void delete(int i) {



        Node temp = head , prev_node = null;

        if( temp != null && temp.data == i)
        {
            head = temp.next;
            return;
        }

        while(temp != null && temp.data != i)
        {
            prev_node = temp;
            temp = temp.next;
        }

        if(temp == null)
        {
            System.out.println("Element not found!!");
            return;
        }

        prev_node.next = temp.next;

    }

    public void suffix(int d) {

        if(head == null)
        {
            System.out.println("The list cannot be null");
            return;
        }

        Node new_node = new Node(d);

        new_node.next = head;

        head = new_node;

    }

    public void insertAt(Node pos,int at, int d) {

        if( pos == null )
        {
            System.out.println("Linked List cannot be null");
            return;
        }

        Node temp = new Node(4);


        while( pos.data != at)
            pos = pos.next;

        temp.next = pos.next;
        pos.next = temp;

        return;
    }

    public void insert(int d) {

        Node new_node = new Node(d);
        if(head == null)
        {
            head = new Node(d);
            return;
        }

        new_node.next=null;

        Node last = head;

        while(last.next != null)
        last = last.next;

        last.next = new_node;
        return;

    }

    public void show() {
        Node n = head;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();
    }


}