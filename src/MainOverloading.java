
public class MainOverloading {
	
	public static void main() {
		System.out.println(" Main with no parameters");
	}
	public static void main(String name) {
		name = "with One parameter";
		System.out.println("Main "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       main();
       //main("name");
       MainOverloading.main("name");// static, only class can access the static methods
       
	}
	
	
	

}
