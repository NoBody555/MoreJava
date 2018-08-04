
public class Mymein {
	
	public static void main(String[] args) {
		AddingComplexnumbers obj = new AddingComplexnumbers(5,9);
		AddingComplexnumbers obj1 = new AddingComplexnumbers(3,2);
		AddingComplexnumbers obj2 = new AddingComplexnumbers();
		obj2= obj2.ChangingValues(obj, obj1);
		System.out.println(obj2.x+"  " + obj2.y);
	
	}

}
/*  Complex addingvalues(complex x, complex y){
 * 
 *    complex src = new complex();
 *    src.k= x.k+y.k;
 *    src.l=x.l+y.l;
 *    return src;
 *    
 * }
 *  */



