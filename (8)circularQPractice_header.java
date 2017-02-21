package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class circularQ {
	
	int front;
	int rear;
	int[] queArr;
	int qsize;
	public circularQ(int size)
	{
		this.qsize=size;
		queArr=new int[size+1];
		this.front=0;
		this.rear=0;
		System.out.println("queue created!");
	}
	public boolean IsEmpty()
	{
		if(this.front==this.rear)
			return true;
		else
			return false;
	}
	public boolean IsFull()
	{
		if(this.NextPosIdx(this.rear)==this.front)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	void Dequeue()
	{
		if(!this.IsEmpty())
		{
			this.front=this.NextPosIdx(this.front);
			this.queArr[this.front]=0;
		}
		else
		{
			System.out.println("Queue already empty!");
		}
		
	}
	void Enqueue(int x)
	{
		if(!this.IsFull())
		{
			this.rear=this.NextPosIdx(this.rear);
			this.queArr[this.rear]=x;
		}
		else
		{
			System.out.println("Queue is full!!");
		}
	}
	public void PrintFirst()
	{
		System.out.println(this.queArr[this.front+1]);
	}
	public void PrintRear()
	{
		System.out.println(this.queArr[this.rear]);
	}
	public int NextPosIdx(int x)
	{
		if(x==this.qsize)
		{
			return 0;
		}
		else
		{
			return x+1;
		}
	}

}
