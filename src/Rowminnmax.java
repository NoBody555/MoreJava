
public class Rowminnmax {

	
	public static void main(String[] args) {
		int min;
		int mincolumn = 0;
		int minrow = 0;
		int arrie [][] = {{2,5,6,19},{7,1,0,6},{8,22,24,-9}};
	
		
		min =arrie[2][0];
		System.out.println(arrie[2][0]);//9
		for(int i=2; i<arrie.length; i++) {
			
			
			  for(int j=0; j<arrie[i].length; j++) {
				  
				  if(arrie[i][j]<min) {//0
					  min =arrie[i][j];//0
					  mincolumn= j;//this step is not valid,since we are targeting the last col i.e 3
				  }
			  }
		}
		
		System.out.println("min value in the last row: "+min);
		System.out.println("Minimum column is: "+mincolumn);
		//int max = arrie[0][mincolumn];
		

       int max = arrie[2][3];
		  int k=0;
		  while(k<4) {
			  
			  
				  
           if(arrie[2][k]>max)
		   max= arrie[2][k];
			  //if(arrie[k][mincolumn]>max)
				 // max=arrie[k][mincolumn];
			  else k++;
				  
		  }
		 System.out.println("max value in the last row: " +max);
		
		
		
	}
}

