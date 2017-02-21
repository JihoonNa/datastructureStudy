
package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Dijkstra {
 
    static int[][] ad;
    static int[] distance;
    static int[] pathWay;
    static boolean[] visit;
    static int infoNum;
    static int vertexNum;
    static final int inf = 1000000;
    
    public static void shortestPath(int start, int end)
    {
       distance[start] = 0;
       for( int j = 0; j < vertexNum; j++)
        {
            int min = inf+1; 
            int index = -1;
            
            for(int k = 1; k <= vertexNum; k++)
            {
                if(visit[k] == false && min > distance[k])
                {
                    min = distance[k];
                    index = k;
                    
                }
            }

            visit[index] = true; 

            for(int l = 1; l <= vertexNum; l++)
            {
                if(ad[index][l] != 0 && distance[l] > distance[index] + ad[index][l])
                {
                      distance[l] = distance[index] + ad[index][l];
                      pathWay[l]=index;
                }    
            }
            
            
        }
        
	   	System.out.print("distance is : ");
	    System.out.println(distance[end]);
	    System.out.print("pathway is : ");
	    int Next=end;

	    while(true)
	    {
    	  System.out.print(Next+" ");
    	  Next=pathWay[Next];
    	  if(Next==start)
    	  {
    		  System.out.println(Next+" ");
    		  break;
    	  }
    	  
	    }
    }
    
    public static void main(String[] args) 
    {
    	Scanner scan;
		try 
		{
			scan = new Scanner(new File("input12.txt"));
			String temp = scan.nextLine();
			String[] vertexArray = temp.split(" ");
			vertexNum=vertexArray.length;
			
	        temp = scan.nextLine();
	        String[] edgeInfo = temp.split(" ");
	        infoNum=edgeInfo.length;
	        
	        
	        ad = new int[vertexNum+1][vertexNum+1];
	        distance = new int[vertexNum+1];
	        visit = new boolean[vertexNum+1];
	        pathWay = new int[vertexNum+1];
	        
	        for(int i = 1; i <= vertexNum; i++)
	        {
	            distance[i] = inf; 
	        }
	        
	        for(int i = 0; i < infoNum; i++)
	        {
	            String [] edgeIntInfo=edgeInfo[i].split("-");
	            ad[Integer.parseInt(edgeIntInfo[0])][Integer.parseInt(edgeIntInfo[1])]=Integer.parseInt(edgeIntInfo[2]);
	        }
	        
	        shortestPath(2,6);
    
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		
    }
}

