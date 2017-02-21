package practice;

public class Node {

	public int val;
	public Node next;
	
	public Node()
	{
		this.next=null;
	}
	public Node(int x)
	{
		this.val=x;
		this.next=null;
	}
	
	public void printAll()
	{
		Node temp=this;
		if(temp.next==null)
		{
			System.out.println("null");
			return ;
		}
		while(temp.next!=null)
		{
			temp=temp.next;
			System.out.print(temp.val+" ");
		}
		System.out.println("");
	}
	public boolean delete(int a)
	{
		Node preTemp=this;
		Node temp=this.next;
		while(temp!=null)
		{
			if(temp.val==a)
			{
				preTemp.next=temp.next;
				return true;
			}
			preTemp=temp;
			temp=temp.next;
		}
		return false;
	}
	public boolean find(int a)
	{
		Node temp=this;
		while(temp.next!=null)
		{
			temp=temp.next;
			if(temp.val==a)
			{
				return true;
			}
		}
		return false;
	}
	public boolean insert(int a) {
		
		Node head = this;
		Node newNode = new Node(a);
		if(!this.find(a))
		{
			if(this == null)
			{
				head.next=newNode;
			}
			else {
				newNode.next=head.next;
				head.next=newNode;
			}
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
