import java.util.Arrays;
import java.util.Scanner;

public class RemovingElement {
	
	static Scanner userInput = new Scanner(System.in);
	public static void removeElement() {
		System.out.println("Enter the number of the index to be removed");
		int index = userInput.nextInt();
		
		int Tarray[]= {1, 2, 3, 4, 5, 6, 7, 8 ,9 ,10, 11, 23, 32, 43 ,34, 232 ,12, 123, 443, 5342 };
		//new array will copy the values till the index, not includin the index
		int newArray[] = Arrays.copyOfRange(Tarray, 0, index);
		//copying all elements, excluding the index 
		int newArray1[]=Arrays.copyOfRange(Tarray, index + 1, Tarray.length);
		
		for(int i=0; i<newArray.length;i++) {
			System.out.print(newArray[i]+ " ");
		}
		for(int i=0; i<newArray1.length;i++) {
			System.out.print(newArray1[i]+" ");
		}
	}
	public static void main(String[] args) {
		removeElement();
	}

}
