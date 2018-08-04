
public class ObjectPassingasARguments {
 int a =5;
 
	void changeObject(ObjectPassingasARguments ob) {
		//ob.a=a++;
		ob.a++;
	}
	
	
	
	
		
		
		
	
	  
	
	public static void main(String[] args) {
		
		ObjectPassingasARguments obj = new ObjectPassingasARguments();
		System.out.println(obj.a);
		obj.changeObject(obj);
		System.out.println(obj.a);
		
	}
}
