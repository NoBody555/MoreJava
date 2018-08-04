


 class Mylife extends PassByReference  {
	
	int a, b;
	Mylife(int a, int b){
		
		this.a=a; 
		this.b=b;
	}
	  
	  void swap(Mylife obj){
		  // obj is of reference-type in the java i.e when we pass a object(mf here for example) to the method,reference will be passed
		  //object is passed here by reference so both(mf and obj)...
		  //...are pointing to the same object changes made by either of these object(mf and obj) will reflect
		  int temp =obj.a;
		  obj.a=obj.b;
		  obj.b=temp;
		  /*
		   *                                                1234 
                        _______mf________                  ------        ____obj______   
                      |_____1234________| ---------------->| 5,7 | <----- | 1234  |     
                                                                          ----------
		   * 
		   */
		  
		  
	  }
	  
	  
	  
	 
}
public class PassByReference {
	
	public void superduper() {
		
		System.out.println("oh yeah");
	}
	
	
	public static void main(String[] args) {
		//PassByReference dfd = new PassByReference();
		//PassByReference dd = new Mylife(5,9);
	    //dd.superduper();
		Mylife mf = new  Mylife(5, 7);
		
		System.out.println("mf.a and mf.b before the call: "+mf.a+" "+mf.b);
		//mf is having an object inside it and that object is getting passed
		System.out.println("calling the swap method");
		
	  mf.swap(mf);
	  System.out.println("mf.a and mf.b after the call to swap method: "+mf.a+" "+mf.b);
	    
	  
		
	}

}

