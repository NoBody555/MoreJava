
public class FindingArrayindex {

	public static int findingIndex(int [] arr, int t) {
		
		if(arr==null) return -1;
		//int len = arr.length;
		int i=0;
		while(i<arr.length) {
			if(arr[i]==t)
				return i;
			else i= i+1;
	}
	       return -1;
	}
	public static void main(String[] args) {
		int arr[] = new int [] {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		// int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		System.out.println("the index of the  25: "+findingIndex(arr,25));
		System.out.println("the index of 56 is: "+findingIndex(arr,56));
		System.out.println("the index of 85 is: "+findingIndex(arr,85));
	}
}
