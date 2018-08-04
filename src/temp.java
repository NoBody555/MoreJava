import java.nio.charset.MalformedInputException;
import java.util.Arrays;
import java.util.Scanner;

public class temp {
	
	public static void removeElement() {
		System.out.println("Input the number of index of the element to be removed: ");
		Scanner input=new Scanner(System.in);
		int index = input.nextInt();
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 23, 32, 43, 34, 232, 12, 123, 443, 5342 };
		int[] newArray1 = Arrays.copyOfRange(array, 0, index);
		int[] newArray2 = Arrays.copyOfRange(array, index + 1, array.length);
	
		for (int i = 0; i < newArray1.length; i++) {
			
		System.out.print(newArray1[i] + " ");
		
		}
		//System.out.println("length of this array is "+newArray1.length);
		for (int i = 0; i < newArray2.length; i++) {
		System.out.print(newArray2[i] + " ");
		}
		
		
		}
	
	public static void main(String[] args) {
		removeElement();
	}

}
