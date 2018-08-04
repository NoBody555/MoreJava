
public class RaceRowmincol {
	public static void main(String[] args) {
		int min;
		int par[][]= {{3,6,9,9,4,0,5},{7,6,1,14,-3,2,2}};
		
		int mincolumn=0;
		int maxcolumn =0;
		min= par[1][0];
		
		for(int i=1; i<par.length; i++) {
			
			for(int j=0; j<par[i].length;j++) {
				
				if(par[i][j]<min) {
					
					min = par[i][j];
					mincolumn=j;
				}
				
			}
			
			
			
		}
		System.out.println("min value is "+min);
		System.out.println("min column is "+mincolumn);
		System.out.println("**************************");
		
		int max;
		max=par[1][mincolumn];//
		System.out.println("this is value yo: "+par[1][mincolumn]);
		   int k=0;
		    while(k<7) {
		    	if(par[1][k]>max) 
		    		
		    		max=par[1][k];
		    	 else k++;
		    	}
		    	System.out.println("maximum value is "+max);
		    }

		
		   
		

}
