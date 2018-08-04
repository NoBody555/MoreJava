import java.util.ArrayList;

public class uniquenumber {
	
	public static void main(String[] args) {
		
	
	
int [] arr=new int [] {5,9,6,7,5,6,6,7,7,5,5};

       ArrayList<Integer> ac = new ArrayList<Integer>();
       
       for(int i=0; i<arr.length; i++) {
    	   int k=0;
    	   
    	   if(!ac.contains(arr[i])) {
    		   
    		   ac.add(arr[i]);
    		   k++;
    		   for(int j=i+1; j<arr.length; j++) {
    			   
    			   if(arr[i]==arr[j]) {
    				   
    				   k++;
    			   
    			   }
    			   
    			  
    		   }
    		   System.out.println("number " +arr[i] + " occurs ");
    		   System.out.println(k +" times");
    		   
    		   
    		   if(k==1)
				   System.out.println(arr[i]+"is a unique number");
    		   
    	   }
    	   
       }
	}

}
