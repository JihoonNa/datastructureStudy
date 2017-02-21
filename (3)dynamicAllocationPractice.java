package helloworld;

import java.util.Scanner;

public class p1_3 {
	public static void main(String[] args)
	{
		String name;
		String [] arr;
		String a;
		int num;
		String line;
		Scanner scan = new Scanner(System.in);
		a = scan.nextLine();
		num=Integer.parseInt(a);
		arr=new String[num];
		Scanner scan1 = new Scanner(System.in);
		line = scan1.nextLine();
		arr = line.split(" ");
		for(int i=0; i<num;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
