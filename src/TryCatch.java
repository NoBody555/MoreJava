/*All Catch blocks must be ordered from most specific to most general
 *  i.e. catch for IndexOutOfBoundsException must come before
 *   catch for Exception*/
public class TryCatch {
	
	//one try can have multiple catch blocks, but catch blocks has to immediately follow after
	// after the Try block.
/*	int a =4;
	
	
	
	int b =7;
	int c=0;
	
	int k=b/c;
	public void getGoing() {
		
		System.out.println(k);
	}
	*/
	
	public static void main(String[] args) {
		int a =3;
		int b = 7;
		int c =0;
	
		TryCatch tc = new TryCatch();
		//tc.getGoing();
		try {
			//int k = b/c;
			int arr[]= new int [5];
			System.out.println(arr[9]);
			
			//System.out.println(k);
			
		 } catch(ArithmeticException e) {
			 
			 System.out.println("Arithmetic exception occurs, cannot divide by zero");
		 }
		
		  catch(IndexOutOfBoundsException ets) {
			  
			  System.out.println("index is out of bounds");
		  }
		catch(Exception e) {
			
			System.out.println(" unknown exception has occurred");
		}
		//finally block executed irrespective whether exception thrown/occur or not
		finally {
			System.out.println("yo yo yo yo");
		}//finally can be use only with try i.e without catch blocks...
		   //comment catch blocks to see, surrond the catch blocks with this comment */
	}

}
/*All catch blocks must be ordered from most specific to most general
 *  i.e. catch for IndexOutOfBoundsException must come before
 *   catch for Exception*/
