
public class AvgvalueofArrElements {
	
	public static void main(String[] args) {
		int number []= new int[] {20, 30, 25, 35, -16, 60, -100};
		double sum =0;
		//you always need a for loop to loop through elements
		int i=0;
		while(i<number.length) {
			
		//for(int i=0; i<number.length;i++)
			sum = sum+number[i];
			

		    i++;
		}
		// after looping following steps will execute
		double average = sum/number.length;
		
		System.out.println(" the average  value of array Elements is : "+average);
		System.out.println("length of the array is "+number.length);
		
			
	}

}
