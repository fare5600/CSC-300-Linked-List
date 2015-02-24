
public class Driver 


{
	public static void main(String[] args) throws Exception
	{
		LinkedList ll = new LinkedList();
		ll.display();
		ll.addFront(13);
		ll.addFront(18);
		ll.addFront(11);
		ll.addAtIndex(19, 4);
		ll.addAtIndex(60,9);
		ll.addEnd(7);
		ll.addEnd(14);
		ll.display();
		ll.removeEnd();
	}
	//hello world!!

}
