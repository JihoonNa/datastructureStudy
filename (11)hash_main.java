package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

    	int size ;
    	int m ;
    	double A ;
    	
    	Node[] table;
    	String temp;
		String [] tempArray;
		Scanner scan;
		try {
			scan = new Scanner(new File("input9.txt"));
			
			temp=scan.nextLine();
			size=Integer.parseInt(temp);
			m=size;
			temp=scan.nextLine();
			A=Double.parseDouble(temp);
			

	    	table=new Node[size];
	    	for(int i=0; i<size; i++)
	    	{
	    		table[i]=new Node();
	    	}

	    	
			while (scan.hasNext()) 
	        {
				temp=scan.nextLine();
				tempArray=temp.split(" ");
				int commendNum;
				int location;
				boolean q;
				switch (tempArray[0])
				{
			      case "i"    : commendNum=Integer.parseInt(tempArray[1]);
			    	  			location=calculateIdx(commendNum,m,A);
			    	  			q=table[location].insert(commendNum);
			    	  			if(q)
			    	  				System.out.println("inserted : "+commendNum+" in node "+location);
			      				break;
			                   
			                   
			      case "f"   :  commendNum=Integer.parseInt(tempArray[1]);
  	  							location=calculateIdx(commendNum,m,A);
  	  							q=table[location].find(commendNum);
  	  							if(q==true)
  	  								System.out.println("found : "+commendNum+" in node "+location);
  	  							else
  	  								System.out.println("null");
  	  							break;
			                   
			                   
			      case "p"  : 	for(int i=0; i<size; i++)
			    	  				table[i].printAll();
			    	  			break;
			                      
	              
			      case "d"  : 	commendNum=Integer.parseInt(tempArray[1]);
								location=calculateIdx(commendNum,m,A);
								q=table[location].delete(commendNum);
								if(q==true)
  	  								System.out.println("delete : "+commendNum+" in node "+location);
  	  							else
  	  								//System.out.println("null");
								break;

			     		   
			      default    : 	break;
			                   
			    }
	        }
	    	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		    	
    	
    }
    public static int calculateIdx(int k, int m, double A)
    {
    	return (int) Math.floor((double)m*((double)k*A%1.0));
    }
}
