package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		
		String temp;
		String [] tempArray;
		circularQ que =null;
		
		try 
		{
			Scanner scan = new Scanner(new File("expr_input.txt"));
			while (scan.hasNext()) 
	        {
				temp=scan.nextLine();
				tempArray=temp.split(" ");
				
				switch (tempArray[0])
				{
			      case "n"    : que=new circularQ(Integer.parseInt(tempArray[1]));
			      				break;
			                   
			                   
			      case "f"   : que.PrintFirst();
			    	  			break;
			                   
			                   
			      case "r"  : que.PrintRear();
			    	  			break;
			                   
			                   
			      case "e"  : que.Enqueue(Integer.parseInt(tempArray[1]));
			    	  			break;
                  			   
                  			   
			      case "d"  : que.Dequeue();
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