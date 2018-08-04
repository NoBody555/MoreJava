import java.util.Scanner;

//wap if array contains specific element or not
public class IFarrcontainsspecificvalue {
	
	
	  
	public static boolean contains(int passingarr[], int item) {
		
		for(int n: passingarr){
			if(n==item) {
				
				System.out.println("element "+item+" is present");
				return true;
			}
			
		}
		System.out.println("Element "+item+" isn't present");
		return false;
	}
	
	
	public static void main(String[] args) {
		int [] arr = new int[]{5,6,99,89,90,53,73};
		System.out.println(contains(arr,99));
		System.out.println(contains(arr,399));
		System.out.println(contains(arr,89));
		
	}

}
