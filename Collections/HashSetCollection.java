import java.util.*;

public class HashSetCollection {
	public static void main(String[] args) {
		HashSet<String> hash = new HashSet<String>();
		hash.add("FC Barcelona");
		hash.add("Lionel");
		hash.add("Messi");
		
		Iterator<String> itr = hash.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
