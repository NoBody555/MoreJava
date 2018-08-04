import java.util.ArrayList;

public class Printuniquenumb {
	
public static void main(String[] args) {
	
	
	int a[]= {5,4,5,6,5,4,3,5,4,6};
	ArrayList<Integer> ab = new ArrayList<Integer>();
	//creating Empty array 
	for(int i=0; i<a.length;i++){
		int k=0;
	
	   if(!ab.contains(a[i])){
		   
		   ab.add(a[i]);
		   
		   k++;
		   //to loop through rest of the numbers( that's why i+1) in the above array
		   for(int j=i+1;j<a.length;j++) {
			   
			  //comparing the new number with the old number that was pushed
			   //by using if statement
			   if(a[i]==a[j]) {
				   
				   k++;// if numbers are same increment and move to the rest of the no. in array
				   
				   
				   
			   }
			   
			  
			  }
                 System.out.println("value of " + a[i]+ " occurs ");
                 if(k>1)
	              System.out.println(k + " times");  
	              
	             
		   if(k==1) {
			   System.out.println(k+" time");
			   System.out.println(a[i] +" is a unique number");
		   }
		   
	   }
	   
			   
	   
			 
		   }
	
	
	}
}
	   
	
	

	


