class AVLTree 
{
    private class Node 
    {
        int data,height;
	Node left,right;
        
        public Node(int data) 
        {
            this.data = data;
            this.height = 1;
	}
    }

    private Node root;
    
    void insert(int data)
    {
        this.root = insert(this.root,data);
    }
    
    private Node insert(Node node,int data)
    {
        if(node==null)
        {
            Node temp = new Node(data);
            return temp;
        }
        if(data>node.data)
        {
            node.right = insert(node.right,data);
        }
        else if(data<node.data)
        {
            node.left = insert(node.left,data);
        }
        
        node.height = Math.max(height(node.left),height(node.right));
        
        int bf = bf(node);
        
        //LL case
        if(bf>1 && data<node.left.data)
        {
            return rightRotate(node);
        }
        
        //RR Case
        else if(bf<-1 && data>node.right.data)
        {
            return leftRotate(node);
        }
        
        //LR Case
        else if(bf>1 && data>node.left.data)
        {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        
        //RL Case
        else if(bf<-1 && data<node.right.data)
        {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        
        return node;
    }
    
    private int height(Node node)
    {
        if(node==null)
            return 0;
        return node.height;
    }
    
    private int bf(Node node)
    {
        if(node==null)
            return 0;
        return height(node.right)-height(node.left);
    }
    
    private Node rightRotate(Node node)
    {
        Node left = node.left;
        Node temp = left.right;
        
        left.right = node;
        node.left = temp;
        
        left.height = Math.max(height(left.left),height(left.right));
        node.height = Math.max(height(node.left),height(node.right));
        return left;
    }
    
    private Node leftRotate(Node node)
    {
        Node right = node.right;
        Node temp = right.left;
        
        right.left = node;
        node.right = temp;
        
        right.height = Math.max(height(right.right),height(right.left));
        node.height = Math.max(height(node.left),height(node.right));
        return right;
    }
}
