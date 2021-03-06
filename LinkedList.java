public class LinkedList 

{

protected Node head;
private Node tail;

protected int count;

public LinkedList()

{

this.head = null;
this.tail = null;
this.count = 0;

}

public Node get(int index)

{

//int count = this.count();
{
	if(index==0)
	{
		return head;
	}
	else if (index==this.length()-1)
	{
		return tail;
	}
	else if(index < 0 || index > this.length()-1)
	{
		System.out.println("index out of bounds");
	}
	else
	{
		Node currNode= head;
		for (int i = 0; i < index; i++);
		{
			currNode = currNode.getNextNode();
		}
	return currNode;
	}
	
//if(index >= count || index < 0)

{
//System.out.println("Illegal Index");
//return -1;
}
//else
//{
//Node curr = head;
//for(int i = 0; i < index; i++)
{
//curr = curr.getNextNode();
}
//return curr.getPayload();
}
//return count;
return head;
}
//public int count()
{
//return this.count;
}

public void display()
{
if(head == null)

{

System.out.println("Empty List");

}

else

{

Node currNode = this.head;

while(currNode.getNextNode() != null)

{

System.out.print(currNode.getPayload() + "->");

currNode = currNode.getNextNode();

}

System.out.println(currNode.getPayload() + "-> null");

}

}

public void addAtIndex(int payload, int index)

{
	if(index == 0)
	{
		this.addFront(payload);
		}
	else if(index == this.length())
	{
		this.addEnd(payload);
	}
	else if(index <0 || index > this.length()-1)
	{
		this.addEnd(payload);
	}
	
	else
	{
		Node currNode = head;
		for (int i=0; i <index-1; i++)
		{
			currNode = currNode.getNextNode();
			
		}
		Node n= new Node(payload);
		n.setNextNode(currNode.getNextNode());
		currNode.setNextNode(n);
	}

}
private int length() {
	// TODO Auto-generated method stub
	return 0;
}

public void addFront(int payload)

{

Node n = new Node(payload);

if(head == null)
{
head = n;
tail = n;

}

else

{

n.setNextNode(head);
head.setPrevNode(head);


head = n;
tail = n;

}

this.count++;

}

public void addEnd(int payload)

{

Node n = new Node(payload);

if(this.head == null)

{

this.head = n;
this.head = n;
}

else

{

tail.setNextNode(n);
n.setPrevNode(tail);
tail = n;

}

this.count++;

}

public Node removeEnd() throws Exception

{
if(head == null)
{
throw new Exception("Can Not Remove End: Empty List");
}
else if(this.count == 1)
{
return this.removeFront();
}
else
{
Node curr = tail;
tail = curr.getPrevNode();
curr.setPrevNode(null);

this.count--;
return RemoveEnd();
}	
}
private Node RemoveEnd() {
	// TODO Auto-generated method stub
	return null;
}
public Node removeAtIndex(int index) throws Exception 
{
	if(tail==null)
	{
		return(null);
	}
		Node currNode = tail;
		try {
			return this.removeFront();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	 if(index == this.length()-1)
	{
		return this.removeEnd();
	}
	else if (index < 0 || index> this.length())
	{
		Node nodeToRemove = head;
		Node currNodes= head;
		for (int i = 0; i < index -1; i++)
		{
			currNodes = currNodes.getNextNode();
		}
		nodeToRemove= currNodes.getNextNode();
		currNode.setNextNode(nodeToRemove.getNextNode());
		nodeToRemove.setNextNode(null); 
	}
	return head;
}
public Node removeFront() throws Exception
{
	if(head == null)
	{
		throw new Exception("Can Not remove Front: Empty List");
	}
	else if (this.count ==1)
	{
		Node payloadToReturn = this.head.getPayload();
		this.head = null;
		this.tail = null;
		this.count = 0;
		return payloadToReturn;
	}
	else
	{
		Node curr = head;
		curr.getNextNode().setPrevNode(null);
		head = curr.getNextNode();
		curr.setNextNode(curr);
	}
//Node currNode = head;
//head=head.getNextNode();
//currNode.setNextNode(null);
//return currNode.getPayload();
	return head;

	}
}

