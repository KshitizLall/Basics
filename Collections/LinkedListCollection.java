import java.util.*;

public class LinkedListCollection {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Kshitiz");
		list.add("Lall");
		list.add("CSE");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
