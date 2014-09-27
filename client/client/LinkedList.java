package client;


public class LinkedList
{
	
	private node head;
	private int listCount;
	
	
	public LinkedList()
	{
		
		head = new node(null);
		listCount = 0;
	}
	
	public void add(Object data)
	
	{
		node temp = new node(data);
		node current = head;
		
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		
		current.setNext(temp);
		listCount++;// increment the number of elements variable
	}
	
	public void add1(Object data, int index)
	
	{
		node temp = new node(data);
		node current = head;
		
		for(int i = 1; i < index && current.getNext() != null; i++)
		{
			current = current.getNext();
		}
		temp.setNext(current.getNext());
		current.setNext(temp);
		listCount++;// increment the number of elements variable
	}
	
	public void size()
	{
		System.out.println(listCount);
	}
	
	public void display()
	{
		node current = head.getNext();
		String output = "";
		while(current != null)
		{
			output +=  current.getData().toString()  + "->";
			current = current.getNext();
		}
		System.out.println(output);
	}
	
	
}

