import java.util.ArrayList;

public class RepeatedElement {
	public static void main(String[] args) {
		
		int[] array = new int[]{25, 14, 56, 15, 36, 56, 77, 18,18, 29, 49,99};
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		for(int i=0; i< array.length; i++) {
			
			if(!ar.contains(array[i])) {
				
				ar.add(array[i]);
				
				
				
			}
			
		}System.out.println("new array only with unique numbers:"+ar);
		
		
		
	}

}
