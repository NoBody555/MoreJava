
public class PassByValueRef {
	int a =5;
	int x;
	int y;
	PassByValueRef(int x, int y){
		this.x=x;
		this.y=y;
		
	}
	
	void makingChanges(PassByValueRef objj){
		//PassByValueRef makingChanges(PassByValueRef objj) {
	int temp;
	 temp=x;
	objj. x=y;
	objj. y=temp;
	
	
	//return objj;
	 
	}
	public static void main(String[] args) {
		
		PassByValueRef pv = new PassByValueRef(10,9);
		System.out.println(pv.x+" "+ pv.y);
	  PassByValueRef pv1;
	  pv1=pv;
	  
		pv1.makingChanges(pv1);
		System.out.println(pv1.x+" "+pv1.y);
	 // pv = pv.makingChanges(pv);
	  System.out.println("***AFTER SWAPPING***");
	  System.out.println(pv.x+" "+ pv.y);
	
	}

}
