
public class Stack extends LinkedList
{
	private Node top;
	

	public Stack()
	
	{
		this.top = null;
	}

	public void push(int payload)
	{
		Node n = new Node(payload);
		if(this.top==null)
		{this.top=n;
		
		}
		else
		{
			n.setNextNode(this.top);
			this.top=n;
		}
		addFront(payload);
	
	}
	
	public Node pop() throws Exception
	{
		return this.removeFront();
	}
	public Node peek() throws Exception
	{
		if(this.top==null)
	{
		throw new Exception("No stack");
	}
		return top;
	
		
	}
	public void addFront(int payload) 
	{
		Node n = new Node(payload);
		if (head == null);
		{
			head = n;	
			}
		{
			n.setNextNode(head);
			head.setPrevNode(head);
			head = n;
			}
			this.count++;
	}
}

