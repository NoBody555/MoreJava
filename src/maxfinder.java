//finding out the maximum value
public class maxfinder {
	public static void main(String[] args) {
	int array[][] ={{2,4,5}, {3,0,17}, {1,10,2}};	
	int	min=array[0][0];
	int mincolumn =0;
    int len = array.length;
				
	     for(int i=0; i<len; i++) {
	    	 
	    	 for(int j=0; j<3; j++) {
	    		 
	    		 if(array[i][j]<min) {// @ array[1][1] =0  
	    			 min = array[i][j];// 
	    			 //identified the minimum number's coloumn: mincolumn = j;
	    			  mincolumn = j;// j=1; so mincolumn =1 since j=1 
	    		 }
	    	 }
	     }
	    	 
	    	 
	    	 int max =array[0][mincolumn];//since the column will be remain the same i.e (1)
	    	                              //  column  is going to be 0 1, 1 0, 2 1 since we already know max value is in 1 column
	    	 
	    	 /* columns| 0  1   2
	    	  * -------------------
	    	  *   (r:0)| 2   4   5
	    	  *   (r:1)| 3   0  17
	    	  *   (r:2)| 1  10   2
	    	  */
	        int	 k=0;
	    	  while(k<3) {
	    		  if(array[k][mincolumn]>max) {
	    			  max = array[k][mincolumn];
	    			  
	    			  
	    		  }
	    		  k++;
	    		  
	    	  }
	    	  System.out.println("the minimum value is: " + min);
	    	   System.out.println("maximum value in the second coloumn: " + max);
	    		  
	    		  
	    	  
	    	 
	     

     }
}
