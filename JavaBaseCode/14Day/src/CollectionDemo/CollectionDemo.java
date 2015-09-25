package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {
	
	/**
	 * ×Ö·û´®±éÀú
	 */
	public static void Demo1() {
		ArrayList list=new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		Iterator itr=list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
	}
}
