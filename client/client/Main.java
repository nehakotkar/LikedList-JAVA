package client;


import java.io.*;

public class Main {
   
    public static void main(String args[]) {
	try
	{
		LinkedList l=new LinkedList();  	
		BufferedReader dis = new BufferedReader(new
				InputStreamReader(System.in)); 
       int ch;
       boolean exit=false;
      
       do
       {
    	   System.out.println("\n 1.Add the elemnt to the end of linkedlist");
           System.out.println("\n 2.Add the elemnt to the middele of linkedlist");
           System.out.println("\n 3.Display linkedlist");
           System.out.println("\n 4.Number of Elements LinkedList are");
           System.out.println("\n 5.Exit");
           System.out.println("\n Enter your choice");
           ch=Integer.parseInt(dis.readLine());
	switch(ch)
	{
		case 1:System.out.println(" Enter the element you want to insert \n");
		int no=Integer.parseInt(dis.readLine());
		l.add(no);
		break;
		
		case 2:System.out.println("\n Enter the element you want to insert\n");
		int no1=Integer.parseInt(dis.readLine());
		System.out.println("\n Enter the  position of element \n");
		int pos=Integer.parseInt(dis.readLine());
		l.add1(no1,pos);
		break;

		case 3:System.out.println("\n LinkedList Elements are\n");
			l.display();
			break;
			
		case 4:System.out.println("\n Number of Elements LinkedList are\n");
				l.size();
				break;
		
		case 5:  exit=true;
        		break;	
        		
		
	}
   	}
	while(!exit);

	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
  
    }      
   
}
