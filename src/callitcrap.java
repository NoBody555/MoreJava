import java.util.ArrayList;
import java.util.Scanner;

public class callitcrap {
	
	
	
	static Scanner userInput = new Scanner(System.in);
	protected static void doSomething(int startingNumber) {
		for(int i=startingNumber; i<=100; i++) {
			
			
			if(i==89) continue;
			System.out.println(i);
		}
		
		
		
	}
	protected static String printCrap(int maxnumber) {
		
		int i=1;
		while(i<(maxnumber/2)) {
			
			System.out.println(i);
			
			i++;
			if(i==(maxnumber/2))
			break;
		}
		callitcrap.doSomething(maxnumber);
		
		return "printCrap";
	}

	
	protected static void guessMyNumber() {
		
		
		
		int number;
		do {
		
		
			System.out.println("Enter a number betweeen 10 and 50");
			
			while(!userInput.hasNextInt()) {
				
				
			String numberEntered = userInput.next();
			System.out.printf("%s is not a number", numberEntered);
				
			}
			number = userInput.nextInt();
		}  while(number!=50);
		System.out.println("you got it");
	
	}
	public static void main(String[] args) {
		
		
		callitcrap dc = new callitcrap();
	System.out.println(callitcrap.printCrap(10));
	callitcrap.doSomething(100);
	//System.out.println(callitcrap.printCrap(100));
	callitcrap.guessMyNumber();
		
		int p=0;
		while((p<10)) {
			
			System.out.println(p);
			p++;
			//break;
		}
		
	}
		 
		
		
	
}
