
public class testingMaxfinder {
    
	//print a maximum number of the third/last column
	public static void main(String[] args) {
		int min;
		int mincolumn = 0;
		int arrie [][] = {{2,5,6,19},{7,1,0,6},{8,22,4,-9}};
	
		
		min =arrie[0][3];
		System.out.println(arrie[0][3]);//9
		for(int i=0; i<arrie.length; i++) {
			
			
			  for(int j=3; j<arrie[i].length; j++) {
				  
				  if(arrie[i][j]<min) {//0
					  min =arrie[i][j];//0
					  mincolumn= j;//this step is not valid,since we are targeting the last col i.e 3
				  }
			  }
		}
		System.out.println(min);
		System.out.println(mincolumn);
		int max = arrie[0][mincolumn];
		
		  int k=0;
		  while(k<3) {
			  
			  if(arrie[k][mincolumn]>max)
				  max=arrie[k][mincolumn];
			  else k++;
				  
		  }
		 System.out.println(max);
		
		
		
	}
}
