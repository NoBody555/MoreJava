import java.util.ArrayList;

public class ArraylistExample {
	// ArrayList, LinkedList,vector are Implementing LIST interface.
	//array has fixed size whereas ArrayList is dynamic means you can add value at..
	  //...any index of your choice
	// Arraylist can have duplicate values unlike hashcode.
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	
	list.add("amjapa");
	list.add("java");
	list.add(0, "Bucky");
	list.add("amjapa");
	System.out.println(list);
	//list.remove(2);
	//System.out.println(list);
	System.out.println(list.contains("java"));
	System.out.println(list.indexOf("Bucky"));
	System.out.println(list.isEmpty());
	System.out.println(list.size());
	
	
}
}
