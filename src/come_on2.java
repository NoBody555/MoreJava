import java.io.IOException;
import java.util.Scanner;

public class come_on2 {
	double a =  3.7903;
	  int b =(int) a;
	public static void main(String[] args) throws IOException {
		char choice;
		double fnum,snum, answer;
		
		Scanner amja = new Scanner(System.in);
		System.out.println("Enter a first number");
		fnum = amja.nextDouble();
		System.out.println("Enter a second number");
		snum = amja.nextDouble();
		 
	 System.out.println("pleaste enter what operation you'd like");
	 System.out.println("enter 1. for Add");
	 System.out.println("Enter 2 for Subtract");
	 
	 choice =(char) System.in.read();
	 switch(choice)
	 {
	 case '1':
		 answer=fnum + snum;
		 System.out.println(answer);
		 break;
	 case '2':
		 answer = fnum - snum;
		 System.out.println(answer);
		 break;
	 
	 }
		
		
		
	}

}
