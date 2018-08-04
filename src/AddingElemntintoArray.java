import java.util.ArrayList;
import java.util.Scanner;

public class AddingElemntintoArray {
	static Scanner userInput = new Scanner(System.in);
	public static  void addingElement() {
	System.out.println("enter the position of the element and element you want to insert");
	
		
		int index = userInput.nextInt();
		int element = userInput.nextInt();
		
	
	int[] items = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 23, 32, 43, 34, 232, 12, 123, 443, 5342 };
	ArrayList<Integer> list = new ArrayList<Integer>();
	for(int i=0; i<items.length;i++) {
		list.add(items[i]);
		
	}
	list.add(index, element);
	System.out.println(list);
	
	}
	
	public static void main(String[] args) {
		
		addingElement();
		
	}

}
