package helloworld;
import java.util.Scanner;
public class p1_1 
{
	public static void main(String[] args)
	{
		String message;
		char charArray[];
		charArray=new char[30];
	    Scanner scan = new Scanner(System.in);      // ���� �Է��� ���ڷ� Scanner ����
		System.out.print("enter your name:");
		message = scan.nextLine();            // Ű���� ���� �Է�
		charArray=message.toCharArray();	
		System.out.print("your name is ");
		if(message.length()<30)
			for(int i=0; i<charArray.length; i++)
				System.out.print(charArray[i]);	
		else
			System.out.print("Too long!");	
	}	
}