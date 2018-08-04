import java.util.Scanner;

public class Calculator {
	static double a;

	static double b;

	static double c;
	static Scanner df = new Scanner(System.in);

	
       public static void main(String[] args) {
    	  // System.out.println("enter some crap");
    	  // String crap = df.nextLine();
    	   //Scanner userInput = new Scanner(System.in);
    	  // Scanner df = new Scanner(System.in);
    	   
		System.out.println("Enter a first number to add: ");
		

		//double df = userInput.nextDouble();
		  a= df.nextDouble();
		  
		
		System.out.println("Enter a Second number to add: ");
		//double sf = userInput.nextDouble();
		
		 b = df.nextDouble();
		c = a + b;
		System.out.println(c);
		
	}
}
