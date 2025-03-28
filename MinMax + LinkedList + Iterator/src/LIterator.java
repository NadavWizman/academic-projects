import java.util.Iterator;

public class LIterator implements Iterator<Integer>{
	private Node head;
	public LIterator(Node head) {
		this.head = head;
	}
	
	public boolean hasNext(){
		return head != null;
	}
	public Integer next() {
		Integer x = head.getValue();
		head = head.getNext();
		return x;
	}

}