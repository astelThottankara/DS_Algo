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
    
    public void insert(int position,int data)
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
