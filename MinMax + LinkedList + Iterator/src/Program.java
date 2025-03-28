import java.util.Iterator;

public class Program
{
	public static void main(String[] args) {
	 LinkedList l = new LinkedList();
	 l.add(8);
	 l.add(7);
	 l.add(9);
	 l.addToEnd(5);
	 System.out.println(l.min());
	 System.out.println(l.max());
	
 
	 
	 
	 
	 for (Integer x : l)
		 System.out.print(x);
	 
	 
	}
}
