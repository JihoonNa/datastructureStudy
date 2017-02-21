package practice;
import java.io.*;
import java.util.*;

public class stack 
{
	public static int judge(char ch)
	{
		int prenum;
		if(ch=='*')
		{
			prenum=2;	
		}
		else if(ch=='/')
		{
			prenum=2;	
		}
		else if(ch=='%')
		{
			prenum=2;	
		}
		else if(ch=='+')
		{
			prenum=1;	
		}
		else if(ch=='-')
		{
			prenum=1;	
		}
		else
		{
			prenum=10;
		}
		return prenum;
	}
	public static int oper(int y, int x, char op)
	{
		switch (op) 
		{
	      case '*'    : return x*y;
	      case '/'    : return x/y;
	      case '%'    : return x%y;
	      case '+'    : return x+y;
	      case '-'    : return x-y;
	      default    : System.out.println("?");
	                   return 1;
	    }
	}
	public static void main(String[] args)
	{
		Stack mystack= new Stack();
		String temp;
		int tempint;
		int oper_1;
		int oper_2;
		char[] tempArr;
		int prenum;
		
		Scanner scan = new Scanner(System.in);      // 문자 입력을 인자로 Scanner 생성
		temp=scan.nextLine();
		tempArr=temp.toCharArray();
		
		for(int i=0; i<temp.length();i++)
		{
			
			prenum=judge(tempArr[i]);
			if(prenum==10)
			{
				mystack.push(tempArr[i]);
			}
			else//연산자인경우
			{
				oper_1=Integer.parseInt(String.valueOf(mystack.pop()));
				oper_2=Integer.parseInt(String.valueOf(mystack.pop()));
				tempint=oper(oper_1,oper_2,tempArr[i]);
				mystack.push(tempint);	
			}
		
		}
		System.out.println(mystack.pop());
	}
}