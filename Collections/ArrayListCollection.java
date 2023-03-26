import java.util.ArrayList;
import java.util.*;

public class ArrayListCollection {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Kshitiz");
		list.add("Lall"); 
		list.add("Computer Science and Technology");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());;
		}
	}
	
}