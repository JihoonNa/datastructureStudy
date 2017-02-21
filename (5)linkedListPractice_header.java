package list.linkedlist.implementation;

public class LinkedList {
	private Node head;
	private class Object
	{
		private String studentID;
		private String studentName;
		public Object(String ID,String Name)
		{
			this.studentID=ID;
			this.studentName=Name;
		}
	}
	private class Node
	{
		private Node next;
		private Object data;
		public Node(String id, String name)
		{
			Object elementData = new Object(id,name);
			this.data=elementData;
			this.next=null;
		}
		public String toString()
		{
			return String.valueOf(this.data.studentName);
		}
	}
	public void addFirst(String id, String name)
	{
		Node newNode=new Node(id,name);
		newNode.next=head;
		head=newNode;
	}
	public void showAll()
	{
		Node temp;
		temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data.studentID+" "+temp.data.studentName+" ");
			temp=temp.next;
		}
		System.out.println(" ");
	}
	
	public void insert(String id, String name)
	{
		Node newNode=new Node(id,name);
		int index;
		Node temp=head;
		if(Find(id)!=1000)
		{
			System.out.println("There already is an element key "+id+". Insertion failed.");
			return ;
		}
		else
		{
			index=FindBetter(id);
			if(index==0)
			{
				newNode.next=head;
				head=newNode;
			}
			else
			{
				for(int i=0; i<index-1;i++)
				{
					temp=temp.next;
				}
				newNode.next=temp.next;
				temp.next=newNode;
			}
			System .out.println("Insertion Success : "+id);
			
		}
	}
	public int FindBetter(String id)
	{
		int num;
		num=0;
		Node temp;
		temp=head;
		while(temp!=null)
		{
			if(Integer.parseInt(temp.data.studentID)>Integer.parseInt(id))
			{
				return num;
				
			}
			temp=temp.next;
			num++;
		}
		return num;
	}
	
	public int Find(String id)
	{
		int num;
		num=0;
		Node temp;
		temp=head;
		while(temp!=null)
		{
			if(temp.data.studentID.matches(id))
			{
				return num;
				
			}
			temp=temp.next;
			num++;
		}
		return 1000; 
	}
	
	public void Delete(String id)
	{
		Node temp;
		Node pre_temp;
		temp=head;
		pre_temp=head;
		while(temp!=null)
		{
			if(temp.data.studentID.matches(id))
			{
				if(temp==head)
				{
					System.out.println("Deletion success : "+id);
					head=temp.next;
					return;
				}
				System.out.println("Deletion success : "+id);
				pre_temp.next=temp.next;
				return;
			}
			pre_temp=temp;
			temp=temp.next;
		}
		System.out.println("Deletion failed: element "+id+" is not in the list");
	}
	public Node node(int index)
	{
		Node x= head;
		for(int i=0; i<index;i++)
		{
			x=x.next;
		}
		return x;
	}
}
