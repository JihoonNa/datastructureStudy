package practice;

public class Con_Btree {

	Node root = new Node();
	
	public void print(Node node, char a)
	{
		if(a=='i')
		{
			inorder(node);
		}
		else if(a=='p')
		{
			preorder(node);
		}
		else if(a=='o')
		{
			postorder(node);
		}
		else
		{
			System.out.println("???????");
		}
		System.out.println("");
	}
	public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }
	
	public void preorder(Node root){
        if(root!=null){
        	System.out.print(root.val + " ");
        	preorder(root.left);
            preorder(root.right);
        }
    }
	public void postorder(Node root){
        if(root!=null){
        	postorder(root.left);
            postorder(root.right);
            System.out.print(root.val + " ");
        }
    }
    public void find(int x){
    	Node temp = root;
        while(temp!=null){
            if(x<temp.val) temp = temp.left;
            else if(x>temp.val) temp = temp.right;
            else
            {
            	System.out.println(x + " is in the tree"); 
            	return;
            }
        }
        System.out.println(x + " is not in the tree");
    }
    

	public Node insert(Node node,int a)
	{
		Node temp = node;
		Node newNode = new Node(a);
		if(temp==null)
		{
			return newNode;
		}
		else if (temp.val>newNode.val)
		{
			temp.left=insert(temp.left,a);
			return temp;
		}
		else if(temp.val<newNode.val)
		{
			temp.right=insert(temp.right,a);
			return temp;
		}
		else
		{
			System.out.println("Element "+ a +" already exists");
			return temp;
		}
	}
	

	public Node findMin(Node node)
	{
		Node temp=node;
		if(temp.left==null)
		{
			return null;
		}
		else
		{
			temp.left=findMin(temp.left);
			return temp;
		}
	}
	public Node delete(Node node,int a)
	{
		Node temp = node;
		Node newNode = new Node(a);
		if(temp==null)
		{
			System.out.println("is not in");
			return temp;
		}
		else if (temp.val>newNode.val)
		{
			temp.left=delete(temp.left,a);
			return temp;
		}
		else if(temp.val<newNode.val)
		{
			temp.right=delete(temp.right,a);
			return temp;
		}
		else
		{
			System.out.println("delete!!!!!!");
			if(temp.right==null||temp.left==null)
			{
				if(temp.right==null&&temp.left==null)
				{
					return null;
				}
				else
				{
					if(temp.right==null)
					{
						return temp.left;
					}
					else
					{
						return temp.right;
					}
				}
			}
			else
			{
				Node intemp;
				intemp=temp.right;
				while(intemp.left!=null)
				{
					intemp=intemp.left;
				}
				temp.val=intemp.val;
				return findMin(temp);
				}

		}
	}


}
