

class ryght{
	//int a; int b;
	/*ryght(){
		
		
	}*/
	
	//in passy by refrence creates an object of class type
	void swap(int a, int b) {
		//a=5; b=1;
		int temp =a;
		a=b;
		b=temp;
		System.out.println("value of a: "+a+"\nvalue of b: "+b);
		
	}
}
public class Callbyvalue {
	
	
public static void main(String[] args) {
		
		ryght ryt = new ryght();
		//right ar= new right();
		
		//Callbyvalue cv = new Callbyvalue();
		int a =10; int b=5;
		System.out.println("Before callthe value of a is :" +a+" and b is before call:" +b);
	      ryt.swap(a,b);
		System.out.println("After call the value of a is :" +a+" and b is after call:" +b);
		//cv.swap(i, j);
		
	}
}
