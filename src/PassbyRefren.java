
public class PassbyRefren {
	int a;
	int b;
	PassbyRefren(int a, int b){
		
		this.a=a;
		this.b=b;
	}

	void swap(PassbyRefren obj) {
	
	   int temp=a;
	   obj.a=b;
	   obj.b=temp;
	   
	
	}
	
	
	public static void main(String[] args) {
		
		PassbyRefren pr = new PassbyRefren(5,7);
		
		System.out.println("before calling the method swap: " +pr.a+ " " + pr.b);
		System.out.println("calling the method swap now");
		pr.swap(pr);
		System.out.println("after calling the method swap: "+pr.a+ " " +pr.b);
		
	}
}
