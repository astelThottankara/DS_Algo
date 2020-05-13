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
    Node root;
    
    public BST()
    {
        root = null;
    }
    
    Node search(Node root,int key)
    {
        if(root==null || root.data==key)
            return root;
        if(root.data>key)
            return search(root.left,key);
        return search(root.right,key);
    }
    
    void insert(int key)
    {
        root = insertBase(root,key);
    }
    
    Node insertBase(Node root,int key)
    {
        if(root==null)
        {
            root = new Node(key);
            return root;
        }
        if(root.data>key)
            root.left = insertBase(root.left,key);
        else if(root.data<key)
            root.right = insertBase(root.right,key);
        return root;
    }
    
    public static Node deleteNode(Node root, int value)
	{
	    if (root == null)  return root; 
        if (value < root.data) 
            root.left = deleteNode(root.left, value); 
        else if (value > root.data) 
            root.right = deleteNode(root.right, value); 
        else
        { 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
            root.data = minValue(root.right); 
            root.right = deleteNode(root.right, root.data); 
        } 
  
        return root; 
	}
	
	static int minValue(Node root)
    {
        int min = root.data;
        while(root.left!=null)
        {
            root = root.left;
            min = root.data;
        }
        return min;
    }
    
    void printInorder()
    {
        inorderBase(root);
    }
    
    void inorderBase(Node node)
    {
        if(node!=null)
        {
            inorderBase(node.left);
            System.out.print(node.data+" ");
            inorderBase(node.right);
        }
    }
}
