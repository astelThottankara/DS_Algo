import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int data;
    Node left;
    Node right;
       
    public Node(int key)
    {
        this.data = key;
        this.left = null;
        this.right = null;
    }
}

class BST
{
    static Node root;
    
    public void insert(int data)
    {
        if(root==null)
        {
            root = new Node(data);
            return;
        }
        Node node = root;
        Queue<Node> q = new LinkedList<Node>(); 
        q.add(node);
        while(!q.isEmpty())
        {
            node = q.peek();
            q.remove();
            if(node.left==null)
            {
                node.left = new Node(data);
                break;
            }
            else
                q.add(node.left);
            
            if(node.right==null)
            {
                node.right = new Node(data);
                break;
            }
            else
                q.add(node.right);
        }
    }
}
