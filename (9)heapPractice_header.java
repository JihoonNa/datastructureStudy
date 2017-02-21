package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class heap 
{		
	int Capacity;//max size
	int Size;//current size
	int[] heapArr;
	public heap(int size)
	{
		this.Size=0;
		this.heapArr=new int[size+1];
		this.Capacity=size;
		System.out.println("heap created!");
	}
	public void PrintAll()
	{
		if(this.IsEmpty())
		{
			System.out.println("Max heap is empty");
		}
		for(int i=1; i<this.Size+1;i++)
		{
			System.out.print(this.heapArr[i]+" ");
		}
		System.out.println("");
		
	}
	public boolean IsEmpty()
	{
		if(this.Size==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void Insert(int x)
	{
		int idx;
		int temp;
		if(this.Size==this.Capacity)
		{
			System.out.println("Max Heap is full!");
			return;
		}
		idx=this.Size+1;
		
		this.heapArr[idx]=x;
		while(idx!=1)
		{
			if(heapArr[idx]>heapArr[this.GetParentIdx(idx)])
			{
				temp=heapArr[idx];
				heapArr[idx]=heapArr[this.GetParentIdx(idx)];
				heapArr[this.GetParentIdx(idx)]=temp;
				idx=this.GetParentIdx(idx);
			}
			else
			{
				break;
			}
		}
		this.Size++;
	}
	public void Delete()
	{
		int idx;
		int temp;
		if(this.IsEmpty())
		{
			System.out.println("Max heap is empty");
		}
		else
		{
			idx=1;
			this.heapArr[1]=this.heapArr[this.Size];
			this.heapArr[this.Size]=0;
			this.Size--;
			while(idx<this.Capacity)
			{
				if(this.heapArr[idx]<this.heapArr[this.GetPriorChild(idx)])
				{
					temp=this.heapArr[idx];
					this.heapArr[idx]=this.heapArr[this.GetPriorChild(idx)];
					this.heapArr[this.GetPriorChild(idx)]=temp;
					break;
				}
			}
		}
	}
	public int GetPriorChild(int idx)
	{
		if(this.heapArr[idx*2]<this.heapArr[idx*2+1])
		{
			return idx*2+1;
		}
		else
		{
			return idx*2;
		}
	}
	public int GetParentIdx(int a)
	{
		return a/2;
	}
	public int GetChildIdx_L(int a)
	{
		return a*2;
	}
	public int GetChildIdx_R(int a)
	{
		return a*2+1;
	}
}
