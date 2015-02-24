public class Node 

	{

	private Node nextNode;

	private Node payload;

	public Node(Node payload)

	{

	this.payload = payload;

	this.nextNode = null;

	}

	 

	public Node(int payload2) {
		// TODO Auto-generated constructor stub
	}



	public Node getNextNode() 

	{

	return this.nextNode;

	}

	 

	public void setNextNode(Node nextNode) 

	{

	this.nextNode = nextNode;

	}

	 

	public Node getPayload() {

	return payload;

	}



	public void add(Node n) 
	{
		
		if(this.nextNode ==null)
			{
			this.nextNode = n;
			// TODO Auto-generated method stub
			}
		else
		{
	this.nextNode.add(n);
		
		}

	}
	}




