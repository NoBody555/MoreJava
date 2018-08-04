
public class palindrome {
	public static void main(String[] args) {
		
		String s ="amjapa";
		String k = "";
		for(int i=s.length()-1; i>=0; i=i-1) {
			//i = i-1;
			k= k +s.charAt(i);
			//System.out.println(s.charAt(i));
		}
    	//System.out.println(s);
		System.out.println(k);
		
		if(s.equals(k))
			System.out.println("it is palindrome");
		
		else System.out.println("it aint palindrome, you get it, loser?!");
	}  
		
		
	
}
