
class late{
	
	int a;
	//constructor created with one argument
	late(int a){
		this.a=a;
		
	}
	
  late	incrbyTen(){// method is created of late 
	  
	  //when you are returning an object from the Method, you need to specify what type the object is
	  //...making return type as the class name i.e late that means this Method(incrbyten) will 
	  //return the object of the late class
	  late temp = new late(a+10);
	  
	return temp;
		
		
	}
	
}



public class ReturningObject {
	public static void main(String[] args) {
		late obj = new late(2);
	 System.out.println(obj.a);
		late obj3;
		late obj2;
		obj3=obj;
		obj.incrbyTen();// this will get the value 12 but it won't get stored in the object itself,that's why storing it into another object
	
		//storing above step in variable obj2
		
		System.out.println("the value of obj is "+ obj.a);//2
	
		obj2= obj.incrbyTen();
		System.out.println("the value of obj2 is "+ obj2.a);//12
		
		obj2=obj2.incrbyTen();//12 is getting stored into new variable obj2
		System.out.println("the new value of obj2 is "+obj2.a);//22
	}
 

}
