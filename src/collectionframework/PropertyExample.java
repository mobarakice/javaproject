package collectionframework;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertyExample {

	 
	public static void main(String[] args) {
		 
		Properties p = System.getProperties();
		Set set = p.entrySet();
		
		Iterator i = set.iterator();
		while(i.hasNext()){
			Map.Entry m = (Map.Entry) i.next();
			System.out.println(m.getKey()+" = "+m.getValue());
		}

	}

}
