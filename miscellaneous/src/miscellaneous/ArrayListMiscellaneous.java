package miscellaneous;

import java.util.ArrayList;

public class ArrayListMiscellaneous {

	public static void main(String[] args) {
		
		ArrayList obj = new ArrayList<>(4);
		obj.add(new Integer(0));
		obj.add(new Integer(20));
		obj.add(new Integer(0));
		
		obj.removeAll(obj);
		
		System.out.println(obj.isEmpty());
		
		ArrayList obj2 = new ArrayList<>();
		obj2.add("A");
		obj2.add("B");
		obj2.add("C");
		
		obj2.ensureCapacity(3);
		obj2.trimToSize();
		
		System.out.println(obj2.size());

	}

}
