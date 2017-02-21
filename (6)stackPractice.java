package practice;
import java.io.*;
import java.util.*;

public class stack 
{
	public static int judge(char ch)
	{
		int prenum;
		if(ch=='(')
		{
			prenum=3;
		}
		else if(ch==')')
		{
			prenum=4;	
		}
		else if(ch=='*')
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
	public static void main(String[] args)
	{
		Stack mystack= new Stack();
		String temp;
		char ch;
		int chk=0;
		char[] tempArr;
		Object cont;
		
		int prenum;
		Scanner scan = new Scanner(System.in);      // 문자 입력을 인자로 Scanner 생성
		temp=scan.nextLine();
		tempArr=temp.toCharArray();
		
		for(int i=0; i<temp.length();i++)
		{
			prenum=judge(tempArr[i]);
			if(prenum==10)
			{
				System.out.print(tempArr[i]);
			}
			else//연산자인경우
			{
				if(prenum==3)
				{
					mystack.push(tempArr[i]);
				}
				else if(prenum==4)
				{
					while(!mystack.isEmpty())
					{
						ch=(char)mystack.pop();
						if(ch!='(')
						{
							System.out.print(ch);
						}
					}
				}
				else
				{
					if(mystack.isEmpty())
					{
						mystack.push(tempArr[i]);
					}
					else
					{
						ch=(char)mystack.pop();
						if(ch=='(')
						{
							mystack.push(ch);
							mystack.push(tempArr[i]);
						}
						else
						{
							if(judge(ch)>=prenum)
							{	
								System.out.print(ch);
								/*
								while(!mystack.isEmpty())
								{
									ch=(char)mystack.pop();
									if(ch!='(')
									{
										System.out.print(ch);
									}
								}
								*/
								mystack.push(tempArr[i]);
							}
							else
							{
								mystack.push(ch);
								mystack.push(tempArr[i]);
							}
						}
					}
				}				
			}
		}			
	}
}