import java.util.ArrayList;

public class PrintingUniquNumber {
	
	public static void main(String[] args) {
		int arr[] = {5,4,6,3,3,5,6,2,1,5,5,2,4,4,5,5,4,5,9};
		
		ArrayList<Integer> ai = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			
			int k=0;
			if(!ai.contains(arr[i])) {
				ai.add(arr[i]);
				k++; 
				
				
				for(int j=i+1;j<arr.length; j++) {
					
					if(arr[i]==arr[j])
						k++;
					
					
						
				}
				System.out.println("value "+arr[i]+" occurs");
				if(k>1)
				System.out.println(k+ " times");
				if(k==1) {
					 System.out.println(k+" time");
					System.out.println(arr[i] + " is a unique number");
				}
				
			}
		}
		
	}

}
