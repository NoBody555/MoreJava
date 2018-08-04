import java.util.Arrays;

public class AddingElementToArray {
	public static void main(String[] args) {
		
	
	int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	
	AddingElementToArray bc = new AddingElementToArray();
	
	int index =4;
	int newValue = 6;
	         // String pc = Arrays.toString(my_array);
	         // System.out.println("orignal Arrays "+pc);
           System.out.println("Orignal Arrays "+Arrays.toString(my_array));
           System.out.println(my_array.length-1);
           
           
	          for(int i=my_array.length -1; i>index; i--) {
	        	  //looping continues until no longer index is greater than the i(array.lenght-1)
	        	  //array[5] = array[5-1]
	        	//  my_array[i]= my_array[i-1];
	        	  //commented if you want still works
	        	  my_array[i]= my_array[i-1];
	          }
	          my_array[index] = newValue;
	          System.out.println("updated array: "+Arrays.toString(my_array));
	          
	          
	}
}
