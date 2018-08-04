import java.util.ArrayList;

public class uniquenumber1 {
	
	
	
	public static void main(String[] args) {
		
		
		
		
	
	
	
		int arr[]= {5,3,6,7,6,9,2,9,2,3,5,5,3};
		  ArrayList<Integer> dc= new ArrayList<Integer>();
		  for(int i=0; i<arr.length;i++) {
			  int k=0;
			  if(!dc.contains(arr[i])) {
				  
				  dc.add(arr[i]);
				  
				  k++;
				  
				  for(int j=i+1; j<arr.length; j++) {
					  
					  if(arr[i]==arr[j]) {
						  
						  k++;
					  }
				  }
				  
				  
				  System.out.println("number "+arr[i]+" occurs");
				  System.out.println(k + " times");
				  
				  if(k==1) {
					  System.out.println(arr[i] + " is a unique number");
				  }
			  }
			  
		  }
		  
		
		
	}

}
