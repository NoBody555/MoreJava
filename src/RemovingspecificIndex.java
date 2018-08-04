import java.util.Arrays;

public class RemovingspecificIndex {
  public static void main(String[] args) {
	
	  int ary[] = {24,44,23,53,64,93,53};
	  System.out.println("length of the array is: "+ary.length);
	  System.out.println("orignal array "+Arrays.toString(ary));
	/*  int removeIndex = 1;
	  
	  for(int i=removeIndex; i<ary.length -1;i++) {
		  
		 ary[i]=ary[i+1];  
		
	  
	  }*/int removeIndex = 3;
	  //since array starts at 0 index that's why array -1 to point to the last index
	  //for instance if you ary.length that means 7 but there is no element with that index 
	  //last index in this array is 6. thats why we say 7-1=6 
	  for(int i=removeIndex; i<ary.length -1;i++) {
	   //for(int i = removeIndex; i < ary.length -1; i++){
	      // ary[i] =ary[i + 1];
		  ary[i]=ary[i+1];
	      }
	  System.out.println("after removing the element at 4 index "+Arrays.toString(ary));
	  
  }
}
