import java.util.Arrays;

public class SortArray4maxminvalue {
	public static void main(String[] args) {
		
	
		int[] array = new int[]{25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
     Arrays.sort(array);
     System.out.println("min is "+array[0]);
     //index is always one less than the length of ARRAY,since indexes starts with 0 whereas ARRAY's lengdoesn't
     System.out.println("max is "+array[array.length-1]);
     
     System.out.println(array.length);
     for(int i=0;i<array.length; i++) {
    	 int index = 0+i;
    	 System.out.print(index+" ");
     }
	}	

}/*
public static void minMaxValues() {
int[] array = { 1, 2, 3, 4, 5, 6, -5, 8, 9, 10, 11, 23, 32, 43, 34, 232, 12, 123, 443, 5342 };
int max = array[0], min = array[0];
for (int i = 0; i < array.length; i++) {
if (array[i] < min) {
min = array[i];
}
if (array[i] > max) {
max = array[i];
}
}
System.out.println("Maximum value in the array: " + max + " Minmum value in the array: " + min);
}*/
