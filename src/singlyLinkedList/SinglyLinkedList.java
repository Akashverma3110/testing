package singlyLinkedList;

public class SinglyLinkedList {

	private Node head,tail;
     private int []arr;
     private int size,top=0;
	 
	public SinglyLinkedList()
	{
	     head=tail=null;	
	}
	
	public boolean isFull()
	{
		return top==size-1;
	}
	public boolean isEmpty()
	{
		return head==tail;
	}
	public void show()
	{
		Node trav=head;
		while(trav.getNext()!=null)
		{
			System.out.println(trav.getData()+ " ");
			trav=trav.getNext();
		}
	}

	public void addAtPosition(int val,int pos)
	{ 
		Node newnode=new Node();
		newnode.setData(val);
		newnode.setNext(null);
		if(isFull())
			System.out.println("overflow");
		
		if(pos==0)
		head=newnode;
		if(pos>0)
		{
		Node trav=new Node();
		trav=head;
		int i=2;
		if(i<pos)
		{
			trav=trav.getNext();
			i++;
		}
		newnode.setNext(trav.getNext());
		trav.setNext(newnode);
		top++;
		}
		if(isEmpty())
			System.out.println("Underflow");
	}
	
	
	public void removeAll() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Underflow");
		}
		else
		{
			head=tail=null;
		}
	}
	public void Sum()
	{    
	    int sumAll=0;
		Node trav=new Node();
		trav=head;
		while(trav.getNext()!=null)
		{
			sumAll+=trav.getData();
			trav=trav.getNext();
		}
		System.out.println("the sum of all the members of linkedlist is"+sumAll);
	}
	
	public void printReverse()
	{
		Node trav=new Node();
		trav=tail;
		int []z=new int[50];
		int i=0;
		while(trav.getNext()!=null)
		{
			z[i]=trav.getData();
			i++;
			trav=trav.getNext();
		}
		for(int j=z.length-1;j>=0;j--)
		{
			System.out.println(z[j]+" ");
			
		}
	}
}
