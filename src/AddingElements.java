import java.util.ArrayList;
import java.util.Scanner;

public class AddingElements {
	static Scanner userInput = new Scanner(System.in);
	public static void AddinElement() {
		System.out.println("Enter the position of the element and the Element itself");
		int index = userInput.nextInt();
		int element = userInput.nextInt();
		int[] items = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 23, 32, 43, 34, 232, 12, 123, 443, 5342 };
		//creating an Empty Array
		
		    ArrayList<Integer> alist= new ArrayList<Integer>();
		    for(int i=0; i<items.length;i++) {
		    	//adding element from item into alist i.e new empty array
		    	alist.add(items[i]);
		    }
		    
		//add one element at the index provided by the users
		alist.add(index, element);
		System.out.println(alist);
		
		
		
		
	}
	public static void main(String[] args) {
		AddinElement();
	}

}
