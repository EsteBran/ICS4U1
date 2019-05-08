package abstractDataTypes;

public class LinkedList implements ListIntADT{

	public ListNode head;
	public int listSize;

	public LinkedList() {
		head = new ListNode(0);
		listSize = 0;
	}
	

	@Override
	public int get(int i) { //gets the data at position i, if i exceeds the size of list it just gets the last element
		ListNode current = head;
		int jump;
		
		if (i > listSize || i < 1) {
			System.out.println("index out of bounds of list");
		} else {
			jump = 0;
			while (jump < i -1) {
				
			}
		}
		
	return 0;
	}

	@Override
	public void insert(int i, int j) {
		ListNode end = new ListNode(j);
		ListNode current = head;
		int jump;
		
		if (i > listSize || i < 1) {
			System.out.println("Add Failed: index out of bounds of size of linked list!");
		}
		else {
			jump = 0;
			while (jump < i -1) {
				current = current.next;
				jump++;
			}
			end.next = current.next;
			current.next = end;
			listSize++;
		}
		
		
	}

	@Override
	public void remove(int i) {

	ListNode current = head;
	while (current.next !=null ) {
		if (current.data == i) {
			current.next = current.next.next;
			listSize--;	
		}
		current = current.next;
	}
		
	}

	@Override
	public void removeAt(int i) {
		ListNode current = head;
		int jump;
		if (i > listSize || i < 1) {
			System.out.println("Remove Failed: index out of bounds of size of linked list!");
		}
		else {
			jump = 0;
			while (jump < i -1) {
				current = current.next;
				jump++;
			}
			current.next = current.next.next;
			listSize--;
		}
		
	}

	@Override
	public void replace(int i, int j) {
		ListNode current = head;
		int jump;
		if (i > listSize || i < 1) {
			System.out.println("Remove Failed: index out of bounds of size of linked list!");
		}
		else {
			jump = 0;
			while (jump < i -1) {
				current = current.next;
				jump++;
			}
			current.data = j;
			
		}
		
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
