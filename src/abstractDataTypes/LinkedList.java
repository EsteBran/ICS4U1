package abstractDataTypes;

public class LinkedList implements ListIntADT{



	ListNode head;


	@Override
	public int get(int i) { //gets the data at position i, if i exceeds the size of list it just gets the last element
		int counter = 0;
		ListNode n = head;

		if (n.next != null) {
			n = n.next;
			counter++;

			if (counter == i) {
			return
			}
		}





		return 0;
	}

	@Override
	public void insert(int i, int j) {

		ListNode node = new ListNode(j);
		node.next = null;


		
	}

	@Override
	public void remove(int i) {

		
	}

	@Override
	public void removeAt(int i) {

		
	}

	@Override
	public void replace(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		} else {return false;}
		
	}

	@Override
	public boolean isFull() {
		return false;
	}

}
