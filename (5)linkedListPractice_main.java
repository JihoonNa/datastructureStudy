package list.linkedlist.implementation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		LinkedList numbers = new LinkedList();
		try 
		{
			Scanner scan = new Scanner(new File("lab3_input.txt"));
			String temp;
			String [] tempArray;
			String [] tempIdName;	
			
			
			while (scan.hasNext()) 
	        {
				temp=scan.nextLine();
				tempArray=temp.split(" ");
				if(tempArray[0].matches("p"))
				{
					break;
				}
				else if(tempArray[0].matches("i"))
				{	
					tempIdName=tempArray[1].split("\t");
					numbers.insert(tempIdName[0], tempIdName[1]+" "+tempArray[2]);
					System .out.print("Current List>");
					numbers.showAll();
				}
				else
				{
					tempIdName=tempArray[1].split("\t");
					numbers.Delete(tempIdName[0]);
					System .out.print("Current List>");
					numbers.showAll();
				}
				//numbers.addFirst(idNum,FirstName+LastName);
	        }
			  
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
