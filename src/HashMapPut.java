import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* hastable is thread safe i.e it cannot be access at the same time by mutiple users, once resources realeas 
 *  others can use it,one by one. There is no iterator in hashtable, we use enuemerator. Hashmap accepts
 *  null values where as hashtable don't.
1 */
public class HashMapPut {
public static void main(String[] args) {
	
	HashMap<Integer, String> hash = new HashMap<Integer, String>();
	hash.put(0, "amjapa");
	hash.put(4, "Derek");
	hash.put(334, "Bucky");
	hash.put(2, "care");
	hash.put(1, "dumbos");
	hash.put(11, "");//null value but this is not  possible with hashtable.
	System.out.println(hash);
	System.out.println(hash.get(334));
	Set st = hash.entrySet();
	  Iterator itr =  st.iterator();
	  //create a hashtap and pass the table to the SET collection print the value seperately using the iterator
	  
	  while(itr.hasNext()) {
		  //casting into the map
		  Map.Entry me =(Map.Entry) itr.next();
		  System.out.println(me.getKey());
		  System.out.println(me.getValue());
	  }
	 
}
}
