package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		
		String temp;
		String [] tempArray;
		heap maxheap =null;
		
		try 
		{
			Scanner scan = new Scanner(new File("input.txt"));
			while (scan.hasNext()) 
	        {
				temp=scan.nextLine();
				tempArray=temp.split(" ");
				
				switch (tempArray[0])
				{
			      case "n"    : maxheap=new heap(Integer.parseInt(tempArray[1]));
			      				break;
			                   
			                   
			      case "i"   : maxheap.Insert(Integer.parseInt(tempArray[1]));
			      				break;
			                   
			                   
			      case "p"  : maxheap.PrintAll();
			      				break;
			                      
                  			   
			      case "d"  : maxheap.Delete();
			      				break;
                  			   
                  			   
			      default    : System.out.println("???????????");
			                   	break;
			                   
			    }
				
	        }
				
		
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		
	}

}