
public class myminmax {
	/*
	public static void minMaxValues() {
		int[] array = new int[]{25, 14, 56, 15, 36, 56, 77, 18,18, 29, 49,99};
		//int[] array = { 1, 2, 3, 4, 5, 6, -5, 8, 9, 10, 11, 23, 32, 43, 34, 232, 12, 123, 443, 5342 };
		int max = array[0];
				int min = array[0];
				int len =array.length;
				for(int i=0;i<array.length;i=i+1) {
		//for (int i = 0; i < array.length; i= i+1) {
		/*if (array[i] < min) {
		min = array[i];
		}
		if (array[i] > max) {
		max = array[i];
		}*/
			
		//System.out.println("the values of max and min "+max+" "+min);
	//}
	public static void minandmax() {
	//int[] array = new int[] { 1, 2, 3, 4, 5, 6, -5, 8, 9, 10, 11, 23, 32, 43, 34, 232, 12, 123, 443, 5342 };
		int[] array = new int[]{25, 14, 56, 15, 36, 56, 77, 18,18, 29, 49,99};
		
		int max=array[0];
		int min = array[0];
		int len =array.length;
		System.out.println(" before execution min is"+min+" max is: "+max);
		     for(int i=0;i<array.length-1;i=i+1) {
		//for (int i = 0; i < array.length; i++) {	
			
				
			if(array[i]< min) {
				min =array[i];
			}
			if(array[i]>max) {
				
				 max =array[i];
			}
			
			
			
		}
		System.out.println("the minvalue in the aray is:  "+min+"\nthe max number in the array is: " +max);
		
	}
     public static void main(String[] args) {
		minandmax();
    	// minMaxValues();
	}
}
