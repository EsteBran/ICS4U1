package abstractDataTypes;

public interface QueIntADT {
	
	public void enque (int i); //insert an element at the end of the queue
	public void deque (int i); //remove and return the first element of the queue, if the queue is not empty
	public int peek(int i); //return the element of the queue without removing it, if the queue is not empty
	public int size(); //return the number of elements in the queue
	public boolean isEmpty(); //return true if queue is empty, otherwise return false
	public boolean isFull(); //return true if queue is full, otherwise return false
	

}
