import java.util.Iterator;

class LinkedList implements Iterable<Integer>{
    private Node head;
    public void add(int value){
         head = new Node(value, head);
    }
    public void showRec(){
        if (head == null)
        return;
        head.showRec();
    }
   
    public void addToEnd(int value){
        if (head == null)
            this.add(value);
        else
        {
            Node run = head;
            while (run.getNext() != null){
                run= run.getNext();
            }
            run.setNext(new Node(value, null));
        }
    }
    public Iterator<Integer>  iterator(){
    	return new LIterator(this.head);
    }
    
    public Integer min() {
    	if (head == null) {
            return null;
        }
    	Integer min = head.getValue();
        for (Integer value : this) {
            if (value.compareTo(min) < 0) {
                min = value;
            }
        }
        return min;
    }
    	

public Integer max() {
    if (head == null) {
        return null; 
    }

    Integer max = head.getValue();
    for (Integer value : this) {
        if (value.compareTo(max) > 0) {
            max = value;
        }
    }
    return max;
}
    }
  
