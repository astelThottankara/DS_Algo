public class Node 
{
    int data;
    Node next;
}

public class LinkedList 
{
    Node head;
    
    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head==null)
            head = node;
        else
        {
            Node n = head;
            while(n.next!=null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
    
    public static Node insert(int position,int data)
    {
        Node node = new Node();
        node.data = data;
        if(head==null)
            return node;
        else
        {
            Node n = head;
            int i=0;
            while(i++<(position-1))
                n = n.next;
            node.next = n.next;
            n.next = node;
            return head;
        }  
    }
    
    public static Node remove(Node head, int position) 
    {
        Node node1 = head;
        Node node2 = head;
        if(position==0)
        {
            head = node1.next;
            return head;
        }
        while(position-->1)
        {
            node1 = node1.next;
            node2 = node2.next;
        }
        node2 = node2.next;
        node1.next = node2.next;
        return head;
    }
    
    public void display()
    {
        Node n = head;
        while(n.next!=null)
        {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
}
