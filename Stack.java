
public class Stack extends LinkedList
{
	public Stack()
	
	{
		super();
	}

	public void push(int payload)
	{
		addFront(payload);
	
	}
	public void push(char payload)
	{
		this.addFront(payload);
	}
	public Node pop() throws Exception
	{
		return this.removeFront();
	}
	public Node peek()
	{
		return this.get(0);
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

