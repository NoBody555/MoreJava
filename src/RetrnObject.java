//returning object from the method
public class RetrnObject {
	int x;
	
	public RetrnObject(int x) {
		this.x=x;
		
		
		
	}//when you are returning object from the method, you've to specify, what is the  type of  the object?
	// making return type as the class name Retrnobject, that means 
	//this method will return the object of this class retrnObject.
 RetrnObject updatingtheValue(){
	 
	 RetrnObject cp = new RetrnObject(x-5);
	 //returning object cp from the method
	 return cp;
		
		
	}
 
 public static void main(String[] args) {
	RetrnObject cr = new RetrnObject(15);
	System.out.println("Befor updating the value of x is: " +cr.x);
	RetrnObject cr1;
	//cr = cr.updatingtheValue();
	//cr1 =cr;
	
	//cr1.updatingtheValue();
	 cr1 = cr.updatingtheValue();
	//cr = cr.updatingtheValue();
	System.out.println("after updating the value of x is: "+cr1.x);
	   
}

}
