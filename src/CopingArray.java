import java.util.Arrays;

public class CopingArray {
	
	public static void main(String[] args) {
		
		int myArray [] = {1,2,3,4,5,6,7,8,9,10};
		int newArray[] = new int[10];
		
		System.out.println("Source array"+Arrays.toString(myArray));
		
		for(int i=0; i<myArray.length;i++) {
			
			newArray[i] = myArray[i];
		}
		System.out.println("new Array "+Arrays.toString(newArray));
	}

}
