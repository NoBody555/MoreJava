
class wrap{
	
	int a; int b;
	
	wrap(int a, int b){
		this.a=a;
		this.b=b;
		
		
	}
	void swap(wrap obj) {
		int temp=a;//temp =5
		a=b;//a=7
		b=temp;//5
		
		
	}
	
}
public class Swapcallbyvalue {
	
public static void main(String[] args) {
	
	wrap cr = new wrap(5, 7);
	System.out.println("b4 swapping a is: "+cr.a+" b4 swapping b is "+cr.b);
	
	cr.swap(cr);
	System.out.println("after swapping a is: "+cr.a+" after swapping b is "+cr.b);
	
}
}
