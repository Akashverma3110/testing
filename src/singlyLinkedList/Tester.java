package singlyLinkedList;

public class Tester {
	
	public static void main(String[] args) throws Exception
	{
		SinglyLinkedList s=new SinglyLinkedList();
		s.addAtPosition(10, 0);
		s.addAtPosition(15, 3);
		s.addAtPosition(30, 1);
		s.addAtPosition(750, 2);
		s.show();
		s.Sum();
		s.printReverse();
		s.removeAll();
		
	}

}
