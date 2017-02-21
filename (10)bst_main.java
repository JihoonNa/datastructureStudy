package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
    	Con_Btree bt = new Con_Btree();
    	String temp;
		String [] tempArray;
	
		Scanner scan;
		try {
			scan = new Scanner(new File("input.txt"));
			while (scan.hasNext()) 
	        {
				temp=scan.nextLine();
				tempArray=temp.split(" ");
				
				switch (tempArray[0])
				{
			      case "i"    : bt.root=bt.insert(bt.root,Integer.parseInt(tempArray[1]));
			      				break;
			                   
			                   
			      case "pi"   :  bt.print(bt.root,'i');
			      				break;
			                   
			                   
			      case "pr"  : bt.print(bt.root,'p');
			      				break;
			                      
	              
			      case "po"  : bt.print(bt.root,'o');
								break;

			      case "d"  : bt.root=bt.delete(bt.root, Integer.parseInt(tempArray[1]));
			      				break;
	              			   
			      case "f"  : bt.find(Integer.parseInt(tempArray[1]));
			      				break;
	          			   
			      default    : System.out.println("???????????");
			                   	break;
			                   
			    }
	        } 


	       

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
}
