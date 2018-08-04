import java.util.Scanner;

public class GuessingNumber {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void guessMynumber(){
		int number;
		//String cam;
		do {
			//System.out.println("enter a number john ");
			System.out.println("enter a number between 1 and 50");
			
			while(!userInput.hasNextInt()) {
				
				//String numberEntered = userInput.next();
				String word= userInput.next();
				System.out.println(word+"is not a number");
				//System.out.println(numberEntered+ "is not a word ");
				//System.out.printf("%d is not a word", numberEntered);
			}
			//cam = userInput.nextLine();
			number = userInput.nextInt();
		}//while((cam !="john"));
		 while( number !=40);
		System.out.println("you got it");
		
		
	}
	
	public static void main(String[] args) {
		guessMynumber();
		
	}

}
