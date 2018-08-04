import java.util.ArrayList;

public class understandme {
	
	public static void main(String[] args) {
		int a[]= {5,4,6,9,2,5,3,5,4,6,3};
		//creating an Empty array
		ArrayList<Integer> ac= new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			int k =0;
			
			 //we want to push a unique element or number in the empty array
			//then we check if the new array contains the a[] number ,if it does we are going to move forward
			//without pushing number into the new array
			if(!ac.contains(a[i])) {
				//adding a number to new array from old array
				//after adding 5 for example we are incrementing the counter
				
				ac.add(a[i]);
				k++;
				
				//after incrementing i+1 means leaving that no(5 for example).
				//check the rest of the arraylist to see if that number(5 of example) occurs  or repeat again
				for(int j=i+1;j<a.length;j++) {
					
					if(a[i]==a[j]) {
						
						
						//if you found the match increment the k value
						
						k++;
					}
					
					
					
				}//once it done looping means check the whole array  print out the number and how 
				//many time it occurs
				System.out.println("number "+a[i]+" occurs");
				System.out.println(k + " times");
				 
		        if(k>1) {
		        	System.out.println(a[i]+" is not a unique number");
		        	System.out.println("***************************");
				       
		        }
		        
				
			
			//checks if any number that was store in k is equals to 1 
			if(k==1) {
				System.out.println(a[i]+" is  a unique number");
				System.out.println("***************************");
			       
		
			}
			//we will do the same for the next number in the loop
			// once it is done looping, once it finishes jumps out of the loop
			
			}
			
		}
		
		
	}

}
