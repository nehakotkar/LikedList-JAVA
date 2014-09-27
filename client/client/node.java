package client;


public class node
	{
		
		node next;
		
		Object data;
	
		public node(Object _data)
		{
			next = null;
			data = _data;
		}
		
		
		public node(Object _data, node _next)
		{
			next = _next;
			data = _data;
		}
		
		public Object getData()
		{
			return data;
		}
		
		public void setData(Object _data)
		{
			data = _data;
		}
		
		public node getNext()
		{
			return next;
		}
		
		public void setNext(node _next)
		{
			next = _next;
		}
	}
