
public class AddingComplexnumbers {
	int x,y;
	
	 AddingComplexnumbers(){}
 AddingComplexnumbers(int x, int y){
	
	
	
		this.x=x;
		this.y=y;
		
		
	}
	
	
	   AddingComplexnumbers  ChangingValues(AddingComplexnumbers m, AddingComplexnumbers n){
		   
		 AddingComplexnumbers sum = new AddingComplexnumbers();
        
		 
		 sum.x= m.x+n.x;
		 sum.y=m.y+n.y;
	    	 
	        return sum;	 
	     }
public static void main(String[] args) {
	AddingComplexnumbers ac = new AddingComplexnumbers(5,9);
	AddingComplexnumbers obj0= new AddingComplexnumbers(1,1);
	
	AddingComplexnumbers obj = new AddingComplexnumbers();
	//obj=ac;
	obj = obj.ChangingValues(ac, obj0);
	System.out.println("value of m is "+obj.x +" the value of n is: "+obj.y);
	
	
}
}


