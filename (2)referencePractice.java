package helloworld;
import java.io.*;
import java.util.Scanner;

public class p1_2 
{
	public static void main(String[] args)
	{
		int arr1[];
		int index;
		String s;
		try 
		{
			Scanner scan = new Scanner(new File("integer_input.txt"));
	        arr1 = new int[6];
	        int cnt = 0;
	        while (scan.hasNext()) 
	        {
	            arr1[cnt++] = scan.nextInt();   
	        }
	        index=(int)Math.ceil((float)arr1.length/2.0);
	        for(int i=0; i<index;i++)
	        {
	        	swap(arr1,i,arr1.length-1-i);
	        }
	        BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
	        for(int i=0; i<arr1.length;i++)
	        {
	        	out.write(String.valueOf(arr1[i]));
	        	out.write(" ");
	        	}
	        out.close();
		} 
		catch (IOException e) 
		{
		        System.err.println(e); 
		        System.exit(1);
		}
		
	}
	public static void swap(int[] arr,int x, int y)
	{
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
}
