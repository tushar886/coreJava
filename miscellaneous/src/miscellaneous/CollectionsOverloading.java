package miscellaneous;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsOverloading {
	
	public static String classify(Set<?> s) {
		return "Set";
	}
	
	public static String classify(List<?> s) {
		return "List";
	}
	
	public static String classify(Collection<?> s) {
		return "Collection";
	}
	
	public static void main (String args[]) {
		
		Collection<?>[] collections = { new HashSet<String>(), new ArrayList<String>(), new HashMap<String, String>().values()};
		
		for (Collection<?> coll : collections) {
			System.out.println(classify(coll));
		}
	}
}
