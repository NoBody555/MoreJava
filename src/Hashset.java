import java.util.HashSet;
import java.util.Iterator;



public class Hashset {
	
	//HashSet, TreeSet,LinkedHashset implements the SET interface.
	//HashSet doesn't have or accept any duplicate values.
	// No guarantee of sequential elements collection or set.
	public static void main(String[] args) {
		
		HashSet<String> hash = new HashSet<String>();
		hash.add("comma");
		hash.add("dumbos");
		hash.add("dumbos");
		hash.add("rise");
		hash.add("rise");
		hash.add("comma");
	System.out.println(hash.contains("lava"));
		System.out.println(hash);
		
		//hash.remove("dumbos");
		//System.out.println(hash);
		System.out.println(hash.size());
		     System.out.println("iterator is empty true of false: " + hash.isEmpty()); 
		Iterator <String> itr= hash.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	System.out.println(itr.hasNext());
	  
		}

}
