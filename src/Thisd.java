
public class Thisd {
	int a = 10;
	public void calculation() {
		
		int a = 5;
		System.out.println(a);
		int cal = this.a+a;// cannot use this keyword in static context
		System.out.println(cal);
		
	}
public static void main(String[] args) {
	Thisd td = new Thisd();
   td.calculation(); 
	
	
}
}
