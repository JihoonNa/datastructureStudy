package helloworld;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class p1_4 
{
	public static void main(String[] args) throws IOException
	{
		Person[] personList;
		String line;
		String[] arr;
		Scanner scan = null;
		try {
			scan = new Scanner(new File("student_information.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int num=Integer.parseInt(scan.nextLine());
		
		personList=new Person[num];
		
		for(int i=0; i<personList.length;i++)
		{
			line = scan.nextLine();
            arr = line.split(" ");
			personList[i]=new Person(arr[0],Integer.parseInt(arr[1]),arr[2]);
		}
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new FileWriter("output.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        for(int i=0; i<personList.length;i++)
        {
        	out.write(personList[i].name+" "+personList[i].id+" "+personList[i].major+"\r\n");
        	
        }
        out.close();
		
		
	}
	
}
class Person
{
	String name;
	int id;
	String major;
	public Person(String name, int id, String major)
	{
		this.name=name;
		this.id=id;
		this.major=major;
	}
}
