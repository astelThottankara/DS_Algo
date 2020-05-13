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

class BinaryTree
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
        
        static void printInorder(Node source) 
        { 
            if (source == null) 
                return; 

            printInorder(source.left); 
            System.out.print(source.data+" "); 
            printInorder(source.right); 
        } 
        
        static void printPostorder(Node temp)
        {
            if(source==null)
                return;
            printInorder(source.left); 
            printInorder(source.right);
            System.out.print(source.data+" "); 
        }
        
        static void printPreorder(Node temp)
        {
            if(source==null)
                return;
            System.out.print(source.data+" "); 
            printInorder(source.left); 
            printInorder(source.right);
        }
        
        static int depth(Node node)
        {
            if(node==null)
                return 0;
            int left = depth(node.left);
            int right = depth(node.right);
            if(left>right)
                return (left+1);
            else
                return (right+1);
        }
    }
    
    public void delete(int data)
    {
        //Help required here
    }
}
