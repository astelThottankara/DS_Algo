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
    
    public void insertAtStart(int data)
    {
        Node n = new Node();
        n.data = data;
        n.next = head;
        head = n;   
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
