import java.util.ArrayList;

public class PrintinuniqueNumbersagain {

	public static void main(String[] args) {

		int a[]= {5,4,5,6,5,4,3,5,4,6};
		//creating an empty array (ary)
		ArrayList <Integer> ary = new ArrayList <Integer> ();
		for(int i=0; i<a.length;i++) {
			//k is declared inside the loop to reset and restart after done with one value of the array
			// k =0 count will reset to zero for another value in the array, it keeps happening till the end of the loop
			int k=0;// k is used to increment the counter after storing a value to see if its  repeated?
			// if it is repeated, then k increments from 1 to as many times as the value is repeated, for example...
			// 4,9,0,7,4,8,0,6,3,4. how many times 4 is repeated first stores one 4 i.e k=1 then scan the rest of the array 
			//to see if it is repeated or not, if it is repeated increment the k based on how many times 4 is repeated.
			if(!ary.contains(a[i])) {
				
				
				ary.add(a[i]);
				
				k++;
				//i + is used to keep track of the number is added and  count from there onwards
				for(int j=i+1; j<a.length; j++) {
					
					if(a[i]==a[j])
						k++;
				}
				
				System.out.println("value of " + a[i] + " occurs");
				if(k>1) 
				System.out.println(k+ " times");
				
				if(k==1) {
					System.out.println("occurs only "+k + " time");
					System.out.println(a[i] + " is a unique number");
				     
				}
				}
		}
		
			
		
	}
}
